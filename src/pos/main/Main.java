package pos.main;

import Custom.Components.table.TableCustom;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.database.DBConfig;

/**
 *
 * @author Anjana
 */
public class Main extends javax.swing.JFrame {

    public static Main mainFrame; //crated to access in another classes 
    private ButtonGroup buttonGroup;

    public Main() {

        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        TableCustom.apply(BillsScrollPane, TableCustom.TableType.MULTI_LINE);
        loadreciepts();

        mainFrame = this;

        //adds side panel buttons to the group to unselect other button when select another button 
        buttonGroup = new ButtonGroup();
        buttonGroup.add(buttonSellers);
        buttonGroup.add(buttonCategories);
        buttonGroup.add(buttonBills);
        buttonGroup.add(buttonProducts);

        //load home panel and hide other panels 
        Products.setVisible(false);
        Sellers.setVisible(false);
        Categories.setVisible(false);
        Bills.setVisible(false);
        Home.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new Custom.Components.Swing.Background();
        win_Button1 = new pos.winButtons.Win_Button();
        panelShadow1 = new Custom.Components.Swing.PanelShadow();
        profile1 = new pos.includes.Profile();
        buttonSellers = new Custom.Components.Swing.ButtonMenu();
        buttonCategories = new Custom.Components.Swing.ButtonMenu();
        buttonBills = new Custom.Components.Swing.ButtonMenu();
        buttonProducts = new Custom.Components.Swing.ButtonMenu();
        panelShadow3 = new Custom.Components.Swing.PanelShadow();
        Home = new Custom.Components.Swing.RoundPanel();
        pictureBox2 = new Custom.Components.Swing.PictureBox();
        Products = new pos.main.Products();
        Sellers = new pos.main.Sellers();
        Bills = new Custom.Components.Swing.RoundPanel();
        BillsScrollPane = new javax.swing.JScrollPane();
        TableBills = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        Categories = new pos.main.Categories();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelShadow1.setBackground(new java.awt.Color(255, 255, 255));

        buttonSellers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/3.png"))); // NOI18N
        buttonSellers.setText("Sellers");
        buttonSellers.setClickedColor(new java.awt.Color(51, 204, 255));
        buttonSellers.setFocusPainted(false);
        buttonSellers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSellers.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/3.png"))); // NOI18N
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

        buttonBills.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/4.png"))); // NOI18N
        buttonBills.setText("Bills");
        buttonBills.setClickedColor(new java.awt.Color(51, 204, 255));
        buttonBills.setFocusPainted(false);
        buttonBills.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonBills.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/4.png"))); // NOI18N
        buttonBills.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        buttonBills.setUnselectedTextColor(new java.awt.Color(0, 0, 0));
        buttonBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBillsActionPerformed(evt);
            }
        });

        buttonProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/2.png"))); // NOI18N
        buttonProducts.setText("Products");
        buttonProducts.setClickedColor(new java.awt.Color(51, 204, 255));
        buttonProducts.setFocusPainted(false);
        buttonProducts.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonProducts.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/2.png"))); // NOI18N
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
                .addGap(0, 0, 0)
                .addComponent(buttonProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonSellers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonBills, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelShadow3.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow3.setLayout(new javax.swing.OverlayLayout(panelShadow3));

        Home.setBackground(new java.awt.Color(255, 255, 255));

        pictureBox2.setImage(new javax.swing.ImageIcon(getClass().getResource("/pos/icon/rose gold text~2.png"))); // NOI18N

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(pictureBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        panelShadow3.add(Home);
        panelShadow3.add(Products);
        panelShadow3.add(Sellers);

        Bills.setBackground(new java.awt.Color(255, 255, 255));

        TableBills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Seller ID", "Seller Name", "Date", "Amount", "Bill"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BillsScrollPane.setViewportView(TableBills);
        if (TableBills.getColumnModel().getColumnCount() > 0) {
            TableBills.getColumnModel().getColumn(0).setPreferredWidth(5);
            TableBills.getColumnModel().getColumn(1).setPreferredWidth(30);
            TableBills.getColumnModel().getColumn(2).setPreferredWidth(50);
            TableBills.getColumnModel().getColumn(3).setPreferredWidth(50);
            TableBills.getColumnModel().getColumn(4).setMinWidth(0);
            TableBills.getColumnModel().getColumn(4).setPreferredWidth(0);
            TableBills.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        javax.swing.GroupLayout BillsLayout = new javax.swing.GroupLayout(Bills);
        Bills.setLayout(BillsLayout);
        BillsLayout.setHorizontalGroup(
            BillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BillsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BillsLayout.setVerticalGroup(
            BillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BillsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        panelShadow3.add(Bills);
        panelShadow3.add(Categories);

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, 1048, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(win_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addComponent(win_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(143, 143, 143))
        );

        getContentPane().add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProductsActionPerformed

        Products.setVisible(true);
        Sellers.setVisible(false);
        Categories.setVisible(false);
        Bills.setVisible(false);
        Home.setVisible(false);
    }//GEN-LAST:event_buttonProductsActionPerformed

    private void buttonCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCategoriesActionPerformed

        Products.setVisible(false);
        Sellers.setVisible(false);
        Categories.setVisible(true);
        Bills.setVisible(false);
        Home.setVisible(false);
    }//GEN-LAST:event_buttonCategoriesActionPerformed

    private void buttonBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBillsActionPerformed

        Products.setVisible(false);
        Sellers.setVisible(false);
        Categories.setVisible(false);
        Bills.setVisible(true);
        Home.setVisible(false);
    }//GEN-LAST:event_buttonBillsActionPerformed

    private void buttonSellersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSellersActionPerformed

        Products.setVisible(false);
        Sellers.setVisible(true);
        Categories.setVisible(false);
        Bills.setVisible(false);
        Home.setVisible(false);
    }//GEN-LAST:event_buttonSellersActionPerformed

    private void loadreciepts() {
        TableBills.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                selectreciepts();
            }
        });
        try {
            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();

            String sqlGeBills = "SELECT * FROM bills ORDER BY id DESC";
            PreparedStatement statementBills = con.prepareStatement(sqlGeBills);
            ResultSet rs = statementBills.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TableBills.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                int ID = rs.getInt("seller_id");
                String Name = rs.getString("seller_name");
                String date = rs.getString("datetime");
                String Bill = rs.getString("receipt");
                double TotalPrice = rs.getDouble("totalprice");

                model.addRow(new Object[]{ID, Name, date, TotalPrice, Bill});
            }
            con.close();
        } catch (SQLException e) {
            showErrorMessage(e.toString());
        }
    }

    private void selectreciepts() {
        int selectedRow = TableBills.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        String BillText = TableBills.getValueAt(selectedRow, 4).toString();

        BillTxt.setText(BillText);

    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void showSuccessMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JTextArea BillTxt;
    private Custom.Components.Swing.RoundPanel Bills;
    private javax.swing.JScrollPane BillsScrollPane;
    private pos.main.Categories Categories;
    private Custom.Components.Swing.RoundPanel Home;
    private pos.main.Products Products;
    private pos.main.Sellers Sellers;
    private javax.swing.JTable TableBills;
    private Custom.Components.Swing.Background background1;
    private Custom.Components.Swing.ButtonMenu buttonBills;
    private Custom.Components.Swing.ButtonMenu buttonCategories;
    private Custom.Components.Swing.ButtonMenu buttonProducts;
    private Custom.Components.Swing.ButtonMenu buttonSellers;
    private javax.swing.JScrollPane jScrollPane2;
    private Custom.Components.Swing.PanelShadow panelShadow1;
    private Custom.Components.Swing.PanelShadow panelShadow3;
    private Custom.Components.Swing.PictureBox pictureBox2;
    private pos.includes.Profile profile1;
    private pos.winButtons.Win_Button win_Button1;
    // End of variables declaration//GEN-END:variables
}
