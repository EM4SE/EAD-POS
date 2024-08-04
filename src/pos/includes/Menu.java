package pos.includes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pos.swing.ButtonMenu;
import javax.swing.JPanel;
import pos.main.Main;


/**
 *
 * @author Anjana
 */
public class Menu extends javax.swing.JPanel {
    
    

    
    private ButtonMenu selectedButton = null;

    public Menu() {
        initComponents();
        setOpaque(false);
         addButtonListeners();

       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new pos.swing.PanelShadow();
        profile2 = new pos.includes.Profile();
        buttonCategory = new pos.swing.ButtonMenu();
        buttonProducts = new pos.swing.ButtonMenu();
        buttonSellers = new pos.swing.ButtonMenu();
        buttonBills = new pos.swing.ButtonMenu();
        jButton1 = new javax.swing.JButton();

        buttonCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/2.png"))); // NOI18N
        buttonCategory.setText("Categories");
        buttonCategory.setClickedColor(new java.awt.Color(153, 255, 255));
        buttonCategory.setEffectColor(new java.awt.Color(51, 0, 255));
        buttonCategory.setFocusPainted(false);
        buttonCategory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonCategory.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/2.png"))); // NOI18N
        buttonCategory.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        buttonProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/1.png"))); // NOI18N
        buttonProducts.setText("Products");
        buttonProducts.setToolTipText("");
        buttonProducts.setClickedColor(new java.awt.Color(153, 255, 255));
        buttonProducts.setEffectColor(new java.awt.Color(51, 0, 204));
        buttonProducts.setFocusPainted(false);
        buttonProducts.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonProducts.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/1.png"))); // NOI18N
        buttonProducts.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/1.png"))); // NOI18N
        buttonProducts.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/1.png"))); // NOI18N
        buttonProducts.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        buttonProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProductsActionPerformed(evt);
            }
        });

        buttonSellers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/2.png"))); // NOI18N
        buttonSellers.setText("Sellers");
        buttonSellers.setClickedColor(new java.awt.Color(153, 255, 255));
        buttonSellers.setEffectColor(new java.awt.Color(51, 0, 255));
        buttonSellers.setFocusPainted(false);
        buttonSellers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonSellers.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        buttonBills.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/2.png"))); // NOI18N
        buttonBills.setText("Bills");
        buttonBills.setClickedColor(new java.awt.Color(153, 255, 255));
        buttonBills.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/2.png"))); // NOI18N
        buttonBills.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/2.png"))); // NOI18N
        buttonBills.setEffectColor(new java.awt.Color(51, 0, 255));
        buttonBills.setFocusPainted(false);
        buttonBills.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonBills.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/2.png"))); // NOI18N
        buttonBills.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/2.png"))); // NOI18N
        buttonBills.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/2.png"))); // NOI18N
        buttonBills.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/2.png"))); // NOI18N
        buttonBills.setSelectedIconName("");
        buttonBills.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(profile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonBills, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSellers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(profile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSellers, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonBills, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProductsActionPerformed
       Main main = new Main();

    }//GEN-LAST:event_buttonProductsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Main main = new Main();

    }//GEN-LAST:event_jButton1ActionPerformed

   private void addButtonListeners() {
        buttonCategory.addActionListener(new ButtonClickListener(buttonCategory));
        buttonProducts.addActionListener(new ButtonClickListener(buttonProducts));
        buttonSellers.addActionListener(new ButtonClickListener(buttonSellers));
        buttonBills.addActionListener(new ButtonClickListener(buttonBills));
    }

    private void handleButtonClick(ButtonMenu clickedButton) {
        if (selectedButton != null && selectedButton != clickedButton) {
            selectedButton.setSelected(false); // Deselect the previously selected button
        }
        clickedButton.setSelected(true); // Select the clicked button
        selectedButton = clickedButton; // Update the currently selected button
    }

    private class ButtonClickListener implements ActionListener {
        private ButtonMenu button;

        public ButtonClickListener(ButtonMenu button) {
            this.button = button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            handleButtonClick(button);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pos.swing.ButtonMenu buttonBills;
    private pos.swing.ButtonMenu buttonCategory;
    private pos.swing.ButtonMenu buttonProducts;
    private pos.swing.ButtonMenu buttonSellers;
    private javax.swing.JButton jButton1;
    private pos.swing.PanelShadow panelShadow1;
    private pos.includes.Profile profile2;
    // End of variables declaration//GEN-END:variables
}


