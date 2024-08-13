package Custom.Components.comboboxes;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import Custom.Components.Swing.ShadowRenderer;

public class CustomComboBox<E> extends JComboBox<E> {
    private int round = 10;
    private Color shadowColor = new Color(170, 170, 170);
    private BufferedImage imageShadow;
    private final Insets shadowSize = new Insets(2, 5, 8, 5);

    public CustomComboBox() {
        setUI(new ComboUI());
        setOpaque(false);
        setForeground(new Color(80, 80, 80));
        setBorder(new EmptyBorder(10, 12, 15, 12));
        setBackground(new Color(255, 255, 255));
        
        // Add autocomplete functionality
        AutoCompleteDecorator.decorate(this);
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        createImageShadow();
        repaint();
    }

    public Color getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
        createImageShadow();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        double width = getWidth() - (shadowSize.left + shadowSize.right);
        double height = getHeight() - (shadowSize.top + shadowSize.bottom);
        double x = shadowSize.left;
        double y = shadowSize.top;
        // Create Shadow Image
        g2.drawImage(imageShadow, 0, 0, null);
        // Create Background Color
        g2.setColor(getBackground());
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, round, round));
        g2.fill(area);
        g2.dispose();
        super.paintComponent(grphcs);
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        createImageShadow();
    }

    private void createImageShadow() {
        int height = getHeight();
        int width = getWidth();
        if (width > 0 && height > 0) {
            imageShadow = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = imageShadow.createGraphics();
            BufferedImage img = createShadow();
            if (img != null) {
                g2.drawImage(createShadow(), 0, 0, null);
            }
            g2.dispose();
        }
    }

    private BufferedImage createShadow() {
        int width = getWidth() - (shadowSize.left + shadowSize.right);
        int height = getHeight() - (shadowSize.top + shadowSize.bottom);
        if (width > 0 && height > 0) {
            BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = img.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.fill(new RoundRectangle2D.Double(0, 0, width, height, round, round));
            g2.dispose();
            return new ShadowRenderer(5, 0.3f, shadowColor).createShadow(img);
        } else {
            return null;
        }
    }

    private class ComboUI extends BasicComboBoxUI {
        @Override
        public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
            // Do not paint the default background
        }

        @Override
        protected JButton createArrowButton() {
            return new ArrowButton();
        }
    }

    private class ArrowButton extends JButton {
        public ArrowButton() {
            setContentAreaFilled(false);
            setBorder(new EmptyBorder(5, 5, 5, 5));
        }

        @Override
        public void paint(Graphics grphcs) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int width = getWidth();
            int height = getHeight();
            int size = 10;
            int x = (width - size) / 2;
            int y = (height - size) / 2 + 2;
            int px[] = {x, x + size, x + size / 2};
            int py[] = {y, y, y + size};
            g2.setColor(getForeground());
            g2.fillPolygon(px, py, px.length);
            g2.dispose();
        }
    }
}

class AutoCompleteDecorator {
    public static <E> void decorate(JComboBox<E> comboBox) {
        JTextComponent editor = (JTextComponent) comboBox.getEditor().getEditorComponent();

        editor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                SwingUtilities.invokeLater(() -> {
                    autoComplete(comboBox, editor);
                });
            }
        });
    }

    private static <E> void autoComplete(JComboBox<E> comboBox, JTextComponent editor) {
        String enteredText = editor.getText();

        if (enteredText.isEmpty()) {
            comboBox.hidePopup();
            return;
        }

        List<E> filteredItems = new ArrayList<>();
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            E item = comboBox.getItemAt(i);
            if (item.toString().toLowerCase().startsWith(enteredText.toLowerCase())) {
                filteredItems.add(item);
            }
        }

        if (filteredItems.isEmpty()) {
            comboBox.hidePopup();
        } else {
            comboBox.setModel(new DefaultComboBoxModel<>(filteredItems.toArray((E[]) new Object[0])));
            editor.setText(enteredText);
            editor.setCaretPosition(enteredText.length());
            comboBox.showPopup();
        }
    }
}