package pos.swing;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import java.util.ArrayList;
import java.util.List;

public class ButtonMenu extends JButton {

    private String iconName = "/pos/icon/1.png"; // Default icon
    private String selectedIconName = "/pos/icon/1.png"; // Selected icon
    private Color effectColor = new Color(173, 173, 173);
    private Color clickedColor = new Color(242, 242, 242);
    private Color unselectedTextColor = new Color(76, 76, 76);
    private Color selectedTextColor = new Color(242, 242, 242);
    private Animator animator;
    private int targetSize;
    private float animatSize;
    private Point pressedPoint;
    private float alpha;
    private BufferedImage shadow;
    private int shadowSize = 6;
    private boolean toggled = false; // Changed from clicked to toggled
    private static List<ButtonMenu> buttonGroup = new ArrayList<>(); // Group to hold all ButtonMenu instances

    public ButtonMenu() {
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(0, 0, 0, 0));
        setBackground(new Color(43, 44, 75));
        setForeground(unselectedTextColor);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonGroup.add(this); // Add to the button group
        updateIcon(); // Initialize with default icon
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                targetSize = Math.max(getWidth(), getHeight()) * 2;
                animatSize = 0;
                pressedPoint = me.getPoint();
                alpha = 0.5f;
                toggled = !toggled; // Toggle the state
                if (toggled) {
                    deselectOthers(); // Deselect other buttons in the group
                }
                if (animator.isRunning()) {
                    animator.stop();
                }
                animator.start();
                repaint();
            }
        });
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (fraction > 0.5f) {
                    alpha = 1 - fraction;
                }
                animatSize = fraction * targetSize;
                repaint();
            }
        };
        animator = new Animator(400, target);
        animator.setResolution(0);
    }

    private void deselectOthers() {
        for (ButtonMenu button : buttonGroup) {
            if (button != this && button.toggled) {
                button.setToggled(false);
            }
        }
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
        updateIcon();
    }

    public String getSelectedIconName() {
        return selectedIconName;
    }

    public void setSelectedIconName(String selectedIconName) {
        this.selectedIconName = selectedIconName;
        if (toggled) {
            updateIcon();
        }
    }

    public Color getEffectColor() {
        return effectColor;
    }

    public void setEffectColor(Color effectColor) {
        this.effectColor = effectColor;
        repaint();
    }

    public Color getClickedColor() {
        return clickedColor;
    }

    public void setClickedColor(Color clickedColor) {
        this.clickedColor = clickedColor;
        repaint();
    }

    public Color getUnselectedTextColor() {
        return unselectedTextColor;
    }

    public void setUnselectedTextColor(Color unselectedTextColor) {
        this.unselectedTextColor = unselectedTextColor;
        if (!toggled) {
            setForeground(unselectedTextColor);
        }
    }

    public Color getSelectedTextColor() {
        return selectedTextColor;
    }

    public void setSelectedTextColor(Color selectedTextColor) {
        this.selectedTextColor = selectedTextColor;
        if (toggled) {
            setForeground(selectedTextColor);
        }
    }

    private void updateIcon() {
        String iconToUse = toggled ? selectedIconName : iconName;
        if (iconToUse != null && !iconToUse.isEmpty()) {
            setIcon(new ImageIcon(getClass().getResource(iconToUse)));
        } else {
            setIcon(null);
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        int space = shadowSize;
        int width = getWidth() - space * 2;
        int height = getHeight() - space * 2;
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        if (pressedPoint != null) {
            Area area = new Area(new RoundRectangle2D.Double(space, space, width, height, 20, 20));
            g2.setColor(effectColor);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));
            area.intersect(new Area(new Ellipse2D.Double((pressedPoint.x - animatSize / 2), (pressedPoint.y - animatSize / 2), animatSize, animatSize)));
            g2.fill(area);
        }
        g2.setComposite(AlphaComposite.SrcOver);
        super.paintComponent(grphcs);
    }

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (toggled) { // Check if button is toggled
            g2.setPaint(new GradientPaint(0, 0, new Color(71, 115, 252), 0, getHeight() * 2, new Color(226, 85, 255)));
            g2.drawImage(shadow, 0, 0, null);
            g2.fillRoundRect(shadowSize, shadowSize, getWidth() - shadowSize * 2 - 1, getHeight() - shadowSize * 2 - 1, 20, 20);
            g2.setColor(clickedColor);
            g2.fillRoundRect(shadowSize, shadowSize, getWidth() - shadowSize * 2 - 1, getHeight() - shadowSize * 2 - 1, 20, 20);
        }
        super.paint(g2);
    }

    @Override
    public void setSelected(boolean bln) {
        super.setSelected(bln);
        toggled = bln; // Set toggle state based on selected state
        if (bln) {
            updateIcon(); // Update to selected icon
            setForeground(selectedTextColor); // Set text color to selected text color
            setEffectColor(new Color(255, 255, 255));
        } else {
            updateIcon(); // Update to default icon
            setForeground(unselectedTextColor); // Set text color to unselected text color
            setEffectColor(new Color(173, 173, 173));
        }
    }

    public boolean isToggled() {
        return toggled;
    }

    public void setToggled(boolean toggled) {
        this.toggled = toggled;
        setSelected(toggled);
        repaint();
    }

    private BufferedImage createImage() {
        int width = getWidth() < shadowSize ? shadowSize : getWidth() - shadowSize * 2;
        int height = getHeight() < shadowSize ? shadowSize : getHeight() - shadowSize * 2;
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, img.getWidth(), img.getHeight(), 20, 20);
        return new ShadowRenderer(shadowSize, 0.4f, new Color(53, 102, 255)).createShadow(img);
    }

    private void createShadow() {
        shadow = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = shadow.createGraphics();
        g2.drawImage(createImage(), -1, -1, null);
        g2.dispose();
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        createShadow();
    }
}
