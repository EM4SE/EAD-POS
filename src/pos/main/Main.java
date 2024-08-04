/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.main;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import pos.swing.RoundPanel;

/**
 *
 * @author Anjana
 */
public class Main extends javax.swing.JFrame {

    public static Main mainFrame;
    private ButtonGroup buttonGroup;

    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        mainFrame = this;
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(buttonSellers);
        buttonGroup.add(buttonCategories);
        buttonGroup.add(buttonBills);
        buttonGroup.add(buttonProducts);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new pos.swing.Background();
        panelShadow1 = new pos.swing.PanelShadow();
        profile1 = new pos.includes.Profile();
        buttonSellers = new pos.swing.ButtonMenu();
        buttonCategories = new pos.swing.ButtonMenu();
        buttonBills = new pos.swing.ButtonMenu();
        buttonProducts = new pos.swing.ButtonMenu();
        win_Button1 = new pos.winButtons.Win_Button();
        panelShadow3 = new pos.swing.PanelShadow();
        panelCategories = new pos.swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        panelBills = new pos.swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        panelSellers = new pos.swing.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        panelProduct = new pos.swing.RoundPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonSellers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/1.png"))); // NOI18N
        buttonSellers.setText("Sellers");
        buttonSellers.setClickedColor(new java.awt.Color(51, 204, 255));
        buttonSellers.setFocusPainted(false);
        buttonSellers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSellers.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/1.png"))); // NOI18N
        buttonSellers.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        buttonSellers.setUnselectedTextColor(new java.awt.Color(0, 0, 0));
        buttonSellers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSellersActionPerformed(evt);
            }
        });

        buttonCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/1.png"))); // NOI18N
        buttonCategories.setText("Categories");
        buttonCategories.setClickedColor(new java.awt.Color(51, 204, 255));
        buttonCategories.setFocusPainted(false);
        buttonCategories.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCategories.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/1.png"))); // NOI18N
        buttonCategories.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        buttonCategories.setUnselectedTextColor(new java.awt.Color(0, 0, 0));
        buttonCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCategoriesActionPerformed(evt);
            }
        });

        buttonBills.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/1.png"))); // NOI18N
        buttonBills.setText("Bills");
        buttonBills.setClickedColor(new java.awt.Color(51, 204, 255));
        buttonBills.setFocusPainted(false);
        buttonBills.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonBills.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/1.png"))); // NOI18N
        buttonBills.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        buttonBills.setUnselectedTextColor(new java.awt.Color(0, 0, 0));
        buttonBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBillsActionPerformed(evt);
            }
        });

        buttonProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/1.png"))); // NOI18N
        buttonProducts.setText("Products");
        buttonProducts.setClickedColor(new java.awt.Color(51, 204, 255));
        buttonProducts.setFocusPainted(false);
        buttonProducts.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonProducts.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/1.png"))); // NOI18N
        buttonProducts.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        buttonProducts.setUnselectedTextColor(new java.awt.Color(0, 0, 0));
        buttonProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProductsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(buttonSellers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(buttonCategories, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profile1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBills, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSellers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonBills, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelShadow3.setLayout(new javax.swing.OverlayLayout(panelShadow3));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("Categories");

        javax.swing.GroupLayout panelCategoriesLayout = new javax.swing.GroupLayout(panelCategories);
        panelCategories.setLayout(panelCategoriesLayout);
        panelCategoriesLayout.setHorizontalGroup(
            panelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriesLayout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel1)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        panelCategoriesLayout.setVerticalGroup(
            panelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriesLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel1)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        panelShadow3.add(panelCategories);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setText("Bills");

        javax.swing.GroupLayout panelBillsLayout = new javax.swing.GroupLayout(panelBills);
        panelBills.setLayout(panelBillsLayout);
        panelBillsLayout.setHorizontalGroup(
            panelBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBillsLayout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel2)
                .addContainerGap(550, Short.MAX_VALUE))
        );
        panelBillsLayout.setVerticalGroup(
            panelBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBillsLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel2)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        panelShadow3.add(panelBills);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel3.setText("Sellers");

        javax.swing.GroupLayout panelSellersLayout = new javax.swing.GroupLayout(panelSellers);
        panelSellers.setLayout(panelSellersLayout);
        panelSellersLayout.setHorizontalGroup(
            panelSellersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellersLayout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel3)
                .addContainerGap(501, Short.MAX_VALUE))
        );
        panelSellersLayout.setVerticalGroup(
            panelSellersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellersLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel3)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        panelShadow3.add(panelSellers);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel4.setText("Products");

        javax.swing.GroupLayout panelProductLayout = new javax.swing.GroupLayout(panelProduct);
        panelProduct.setLayout(panelProductLayout);
        panelProductLayout.setHorizontalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductLayout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel4)
                .addContainerGap(452, Short.MAX_VALUE))
        );
        panelProductLayout.setVerticalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel4)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        panelShadow3.add(panelProduct);

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelShadow3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addGap(0, 1152, Short.MAX_VALUE)
                .addComponent(win_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addComponent(win_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(137, 137, 137))
        );

        getContentPane().add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProductsActionPerformed

        panelProduct.setVisible(true);

        panelSellers.setVisible(false);
        panelCategories.setVisible(false);
        panelBills.setVisible(false);
    }//GEN-LAST:event_buttonProductsActionPerformed

    private void buttonSellersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSellersActionPerformed
        panelProduct.setVisible(false);

        panelSellers.setVisible(true);
        panelCategories.setVisible(false);
        panelBills.setVisible(false);
    }//GEN-LAST:event_buttonSellersActionPerformed

    private void buttonCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCategoriesActionPerformed
        panelProduct.setVisible(false);

        panelSellers.setVisible(false);
        panelCategories.setVisible(true);
        panelBills.setVisible(false);
    }//GEN-LAST:event_buttonCategoriesActionPerformed

    private void buttonBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBillsActionPerformed
        panelProduct.setVisible(false);

        panelSellers.setVisible(false);
        panelCategories.setVisible(false);
        panelBills.setVisible(true);
    }//GEN-LAST:event_buttonBillsActionPerformed

    /**
     * @param args the command line arguments
     */
    public void LoadProducts() {
        //HomePanel.setSelectedIndex(3);
        System.out.println("Panel reloaded.");
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pos.swing.Background background1;
    private pos.swing.ButtonMenu buttonBills;
    private pos.swing.ButtonMenu buttonCategories;
    private pos.swing.ButtonMenu buttonProducts;
    private pos.swing.ButtonMenu buttonSellers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private pos.swing.RoundPanel panelBills;
    private pos.swing.RoundPanel panelCategories;
    private pos.swing.RoundPanel panelProduct;
    private pos.swing.RoundPanel panelSellers;
    private pos.swing.PanelShadow panelShadow1;
    private pos.swing.PanelShadow panelShadow3;
    private pos.includes.Profile profile1;
    private pos.winButtons.Win_Button win_Button1;
    // End of variables declaration//GEN-END:variables
}
