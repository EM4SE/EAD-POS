/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.main;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pos.swing.RoundPanel;
import pos.table.TableCustom;

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
        
        
        TableCustom.apply(TableScollPaneSellers, TableCustom.TableType.MULTI_LINE);
        TableCustom.apply(TableScollPaneProducts, TableCustom.TableType.MULTI_LINE);
        TableCustom.apply(TableScollPaneCategories, TableCustom.TableType.MULTI_LINE);
        
        mainFrame = this;

        
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(buttonSellers);
        buttonGroup.add(buttonCategories);
        buttonGroup.add(buttonBills);
        buttonGroup.add(buttonProducts);
        testData(SellersTable);
        testData(ProductsTable);
        testData(CategoriesTable);
        
        Products.setVisible(false);
        Sellers.setVisible(false);
        Categories.setVisible(false);
        Bills.setVisible(false);
        Home.setVisible(true);

    }

    private void testData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        model.addRow(new Object[]{3, "Aniseed Syrup", "Beverages", 18, 39});
        model.addRow(new Object[]{4, "Chef Anton's Cajun Seasoning", "Beverages", 19, 39});
        model.addRow(new Object[]{5, "Chef Anton's Gumbo Mix", "Beverages", 18, 39});
        model.addRow(new Object[]{6, "Grandma's Boysenberry Spread", "Beverages", 19, 39});
        model.addRow(new Object[]{7, "Uncle Bob's Organic Dried Pears", "Beverages", 18, 39});
        model.addRow(new Object[]{8, "Northwoods Cranberry Sauce", "Beverages", 19, 39});
        model.addRow(new Object[]{9, "Mishi Kobe Niku", "Beverages", 18, 39});
        model.addRow(new Object[]{10, "Ikura", "Beverages", 19, 39});
        model.addRow(new Object[]{11, "Queso Cabrales", "Beverages", 18, 39});
        model.addRow(new Object[]{12, "Queso Manchego La Pastora", "Beverages", 19, 39});
        model.addRow(new Object[]{13, "Konbu", "Beverages", 18, 39});
        model.addRow(new Object[]{14, "Tofu", "Seafood", 19, 39});
        model.addRow(new Object[]{15, "Genen Shouyu", "Seafood", 18, 39});
        model.addRow(new Object[]{16, "Pavlova", "Seafood", 19, 39});
        model.addRow(new Object[]{17, "Alice Mutton", "Seafood", 18, 39});
        model.addRow(new Object[]{18, "Carnarvon Tigers", "Seafood", 19, 39});
        model.addRow(new Object[]{19, "Teatime Chocolate Biscuits", "Seafood", 19, 39});
        model.addRow(new Object[]{20, "Sir Rodney's Marmalade", "Seafood", 19, 39});
        model.addRow(new Object[]{21, "Sir Rodney's Scones", "Seafood", 19, 39});
        model.addRow(new Object[]{22, "Gustaf's Knäckebröd", "Seafood", 19, 39});
        model.addRow(new Object[]{23, "Tunnbröd", "Seafood", 19, 39});
        model.addRow(new Object[]{24, "Guaraná Fantástica", "Seafood", 19, 39});
        model.addRow(new Object[]{25, "NuNuCa Nuß-Nougat-Creme", "Seafood", 19, 39});
        model.addRow(new Object[]{26, "Gumbär Gummibärchen", "Seafood", 19, 39});
        model.addRow(new Object[]{27, "Schoggi Schokolade", "Seafood", 19, 39});
        model.addRow(new Object[]{28, "Rössle Sauerkraut", "Seafood", 19, 39});
        model.addRow(new Object[]{29, "Thüringer Rostbratwurst", "Seafood", 19, 39});
        model.addRow(new Object[]{30, "Nord-Ost Matjeshering", "Seafood", 19, 39});
        model.addRow(new Object[]{31, "Gorgonzola Telino", "Seafood", 19, 39});
        model.addRow(new Object[]{32, "Mascarpone Fabioli", "Seafood", 19, 39});
        model.addRow(new Object[]{33, "Geitost", "Seafood", 19, 39});
        model.addRow(new Object[]{34, "Sasquatch Ale", "Seafood", 19, 39});
        model.addRow(new Object[]{35, "Steeleye Stout", "Seafood", 19, 39});
        model.addRow(new Object[]{36, "Inlagd Sill", "Seafood", 19, 39});
        model.addRow(new Object[]{37, "Gravad lax", "Seafood", 19, 39});
        model.addRow(new Object[]{38, "Côte de Blaye", "Seafood", 19, 39});
        model.addRow(new Object[]{39, "Chartreuse verte", "Seafood", 19, 39});
        model.addRow(new Object[]{40, "Boston Crab Meat", "Seafood", 19, 39});
        model.addRow(new Object[]{41, "Jack's New England Clam Chowder", "Seafood", 19, 39});
        model.addRow(new Object[]{42, "Singaporean Hokkien Fried Mee", "Seafood", 19, 39});
        model.addRow(new Object[]{43, "Ipoh Coffee", "Seafood", 19, 39});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        background1 = new pos.swing.Background();
        win_Button1 = new pos.winButtons.Win_Button();
        panelShadow1 = new pos.swing.PanelShadow();
        profile1 = new pos.includes.Profile();
        buttonSellers = new pos.swing.ButtonMenu();
        buttonCategories = new pos.swing.ButtonMenu();
        buttonBills = new pos.swing.ButtonMenu();
        buttonProducts = new pos.swing.ButtonMenu();
        panelShadow3 = new pos.swing.PanelShadow();
        Categories = new pos.swing.RoundPanel();
        jLabel15 = new javax.swing.JLabel();
        textProductID1 = new pos.swing.TextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        textProductID2 = new pos.swing.TextField();
        textProductID3 = new pos.swing.TextField();
        buttonDeleteProduct1 = new pos.swing.Button();
        buttonEditProduct1 = new pos.swing.Button();
        buttonAddProduct1 = new pos.swing.Button();
        roundPanel3 = new pos.swing.RoundPanel();
        TableScollPaneCategories = new javax.swing.JScrollPane();
        CategoriesTable = new javax.swing.JTable();
        Products = new pos.swing.RoundPanel();
        jLabel9 = new javax.swing.JLabel();
        textProductID = new pos.swing.TextField();
        textProductName = new pos.swing.TextField();
        textProductQuantity = new pos.swing.TextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboboxCategory = new pos.combox.CustomComboBox();
        jLabel14 = new javax.swing.JLabel();
        textProductPrice = new pos.swing.TextField();
        buttonAddProduct = new pos.swing.Button();
        buttonEditProduct = new pos.swing.Button();
        buttonDeleteProduct = new pos.swing.Button();
        roundPanel2 = new pos.swing.RoundPanel();
        TableScollPaneProducts = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        Home = new pos.swing.RoundPanel();
        pictureBox2 = new pos.swing.PictureBox();
        Sellers = new pos.swing.RoundPanel();
        textSellerName = new pos.swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        textSellerPassword = new pos.swing.TextField();
        textSellerID = new pos.swing.TextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonDeleteSeller = new pos.swing.Button();
        buttonEditSeller = new pos.swing.Button();
        buttonAddSeller = new pos.swing.Button();
        customComboBox2 = new pos.combox.CustomComboBox();
        roundPanel1 = new pos.swing.RoundPanel();
        TableScollPaneSellers = new javax.swing.JScrollPane();
        SellersTable = new javax.swing.JTable();
        Bills = new pos.swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

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

        Categories.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(23, 102, 255));
        jLabel15.setText("Manage Categories");

        textProductID1.setToolTipText("");
        textProductID1.setName(""); // NOI18N
        textProductID1.setShadowColor(new java.awt.Color(23, 102, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 255));
        jLabel16.setText("Category ID");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 255));
        jLabel17.setText("Category Name");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 255));
        jLabel18.setText("Category Description");

        textProductID2.setToolTipText("");
        textProductID2.setName(""); // NOI18N
        textProductID2.setShadowColor(new java.awt.Color(23, 102, 255));

        textProductID3.setToolTipText("");
        textProductID3.setName(""); // NOI18N
        textProductID3.setShadowColor(new java.awt.Color(23, 102, 255));

        buttonDeleteProduct1.setBackground(new java.awt.Color(255, 102, 102));
        buttonDeleteProduct1.setText("Delete Product");
        buttonDeleteProduct1.setFocusPainted(false);
        buttonDeleteProduct1.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonDeleteProduct1.setShadowColor(new java.awt.Color(0, 51, 255));

        buttonEditProduct1.setBackground(new java.awt.Color(255, 204, 102));
        buttonEditProduct1.setText("Edit Product");
        buttonEditProduct1.setFocusPainted(false);
        buttonEditProduct1.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonEditProduct1.setShadowColor(new java.awt.Color(0, 51, 255));

        buttonAddProduct1.setBackground(new java.awt.Color(0, 204, 255));
        buttonAddProduct1.setText("Add Product");
        buttonAddProduct1.setFocusPainted(false);
        buttonAddProduct1.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonAddProduct1.setShadowColor(new java.awt.Color(0, 51, 255));

        roundPanel3.setBackground(new java.awt.Color(204, 255, 255));

        CategoriesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title5"
            }
        ));
        TableScollPaneCategories.setViewportView(CategoriesTable);
        if (CategoriesTable.getColumnModel().getColumnCount() > 0) {
            CategoriesTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            CategoriesTable.getColumnModel().getColumn(1).setPreferredWidth(250);
            CategoriesTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            CategoriesTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            CategoriesTable.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableScollPaneCategories, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableScollPaneCategories, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CategoriesLayout = new javax.swing.GroupLayout(Categories);
        Categories.setLayout(CategoriesLayout);
        CategoriesLayout.setHorizontalGroup(
            CategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoriesLayout.createSequentialGroup()
                .addGroup(CategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CategoriesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)))
                    .addComponent(textProductID1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textProductID2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textProductID3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CategoriesLayout.createSequentialGroup()
                        .addComponent(buttonAddProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEditProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDeleteProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CategoriesLayout.setVerticalGroup(
            CategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(56, 56, 56)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textProductID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textProductID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textProductID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeleteProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CategoriesLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelShadow3.add(Categories);

        Products.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(23, 102, 255));
        jLabel9.setText("Manage Products");

        textProductID.setToolTipText("");
        textProductID.setName(""); // NOI18N
        textProductID.setShadowColor(new java.awt.Color(23, 102, 255));

        textProductName.setToolTipText("");
        textProductName.setName(""); // NOI18N
        textProductName.setShadowColor(new java.awt.Color(23, 102, 255));

        textProductQuantity.setToolTipText("");
        textProductQuantity.setName(""); // NOI18N
        textProductQuantity.setShadowColor(new java.awt.Color(23, 102, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("Product ID");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 255));
        jLabel11.setText("Product Name");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setText("Quantity");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 255));
        jLabel13.setText("Price");

        comboboxCategory.setShadowColor(new java.awt.Color(23, 102, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 255));
        jLabel14.setText("Category");

        textProductPrice.setToolTipText("");
        textProductPrice.setName(""); // NOI18N
        textProductPrice.setShadowColor(new java.awt.Color(23, 102, 255));

        buttonAddProduct.setBackground(new java.awt.Color(0, 204, 255));
        buttonAddProduct.setText("Add Product");
        buttonAddProduct.setFocusPainted(false);
        buttonAddProduct.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonAddProduct.setShadowColor(new java.awt.Color(0, 51, 255));

        buttonEditProduct.setBackground(new java.awt.Color(255, 204, 102));
        buttonEditProduct.setText("Edit Product");
        buttonEditProduct.setFocusPainted(false);
        buttonEditProduct.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonEditProduct.setShadowColor(new java.awt.Color(0, 51, 255));

        buttonDeleteProduct.setBackground(new java.awt.Color(255, 102, 102));
        buttonDeleteProduct.setText("Delete Product");
        buttonDeleteProduct.setFocusPainted(false);
        buttonDeleteProduct.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonDeleteProduct.setShadowColor(new java.awt.Color(0, 51, 255));

        roundPanel2.setBackground(new java.awt.Color(204, 255, 255));

        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title5"
            }
        ));
        TableScollPaneProducts.setViewportView(ProductsTable);
        if (ProductsTable.getColumnModel().getColumnCount() > 0) {
            ProductsTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            ProductsTable.getColumnModel().getColumn(1).setPreferredWidth(250);
            ProductsTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            ProductsTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            ProductsTable.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableScollPaneProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableScollPaneProducts)
                .addContainerGap())
        );

        javax.swing.GroupLayout ProductsLayout = new javax.swing.GroupLayout(Products);
        Products.setLayout(ProductsLayout);
        ProductsLayout.setHorizontalGroup(
            ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsLayout.createSequentialGroup()
                .addGroup(ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductsLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                        .addGap(65, 65, 65))
                    .addGroup(ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textProductID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textProductName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboboxCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductsLayout.createSequentialGroup()
                            .addComponent(buttonAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonEditProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textProductPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textProductQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ProductsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))))
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ProductsLayout.setVerticalGroup(
            ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(56, 56, 56)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textProductQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textProductPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(ProductsLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelShadow3.add(Products);

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

        Sellers.setBackground(new java.awt.Color(255, 255, 255));

        textSellerName.setShadowColor(new java.awt.Color(23, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 102, 255));
        jLabel1.setText("Manage Sellers");

        textSellerPassword.setShadowColor(new java.awt.Color(23, 102, 255));

        textSellerID.setToolTipText("");
        textSellerID.setName(""); // NOI18N
        textSellerID.setShadowColor(new java.awt.Color(23, 102, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Seller ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Seller Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("Password");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("Gender");

        buttonDeleteSeller.setBackground(new java.awt.Color(255, 102, 102));
        buttonDeleteSeller.setText("Delete Seller");
        buttonDeleteSeller.setFocusPainted(false);
        buttonDeleteSeller.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonDeleteSeller.setShadowColor(new java.awt.Color(0, 51, 255));

        buttonEditSeller.setBackground(new java.awt.Color(255, 204, 102));
        buttonEditSeller.setText("Edit Seller");
        buttonEditSeller.setFocusPainted(false);
        buttonEditSeller.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonEditSeller.setShadowColor(new java.awt.Color(0, 51, 255));

        buttonAddSeller.setBackground(new java.awt.Color(0, 204, 255));
        buttonAddSeller.setText("Add Seller");
        buttonAddSeller.setFocusPainted(false);
        buttonAddSeller.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonAddSeller.setShadowColor(new java.awt.Color(0, 51, 255));

        customComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        customComboBox2.setSelectedIndex(-1);
        customComboBox2.setToolTipText("");
        customComboBox2.setPreferredSize(new java.awt.Dimension(98, 41));
        customComboBox2.setShadowColor(new java.awt.Color(23, 102, 255));

        roundPanel1.setBackground(new java.awt.Color(204, 255, 255));

        SellersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableScollPaneSellers.setViewportView(SellersTable);
        if (SellersTable.getColumnModel().getColumnCount() > 0) {
            SellersTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            SellersTable.getColumnModel().getColumn(1).setPreferredWidth(255);
            SellersTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            SellersTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            SellersTable.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableScollPaneSellers, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableScollPaneSellers)
                .addContainerGap())
        );

        javax.swing.GroupLayout SellersLayout = new javax.swing.GroupLayout(Sellers);
        Sellers.setLayout(SellersLayout);
        SellersLayout.setHorizontalGroup(
            SellersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellersLayout.createSequentialGroup()
                .addGroup(SellersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SellersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SellersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(SellersLayout.createSequentialGroup()
                                .addComponent(buttonAddSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEditSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDeleteSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(SellersLayout.createSequentialGroup()
                        .addGroup(SellersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SellersLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textSellerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textSellerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textSellerPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SellersLayout.setVerticalGroup(
            SellersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSellerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSellerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSellerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SellersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddSeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditSeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeleteSeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(SellersLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelShadow3.add(Sellers);

        Bills.setBackground(new java.awt.Color(242, 246, 253));

        jLabel2.setText("bills");

        javax.swing.GroupLayout BillsLayout = new javax.swing.GroupLayout(Bills);
        Bills.setLayout(BillsLayout);
        BillsLayout.setHorizontalGroup(
            BillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillsLayout.createSequentialGroup()
                .addContainerGap(989, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        BillsLayout.setVerticalGroup(
            BillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillsLayout.createSequentialGroup()
                .addContainerGap(537, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        panelShadow3.add(Bills);

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
    private pos.swing.RoundPanel Bills;
    private pos.swing.RoundPanel Categories;
    private javax.swing.JTable CategoriesTable;
    private pos.swing.RoundPanel Home;
    private pos.swing.RoundPanel Products;
    private javax.swing.JTable ProductsTable;
    private pos.swing.RoundPanel Sellers;
    private javax.swing.JTable SellersTable;
    private javax.swing.JScrollPane TableScollPaneCategories;
    private javax.swing.JScrollPane TableScollPaneProducts;
    private javax.swing.JScrollPane TableScollPaneSellers;
    private pos.swing.Background background1;
    private pos.swing.Button buttonAddProduct;
    private pos.swing.Button buttonAddProduct1;
    private pos.swing.Button buttonAddSeller;
    private pos.swing.ButtonMenu buttonBills;
    private pos.swing.ButtonMenu buttonCategories;
    private pos.swing.Button buttonDeleteProduct;
    private pos.swing.Button buttonDeleteProduct1;
    private pos.swing.Button buttonDeleteSeller;
    private pos.swing.Button buttonEditProduct;
    private pos.swing.Button buttonEditProduct1;
    private pos.swing.Button buttonEditSeller;
    private pos.swing.ButtonMenu buttonProducts;
    private pos.swing.ButtonMenu buttonSellers;
    private pos.combox.CustomComboBox comboboxCategory;
    private pos.combox.CustomComboBox customComboBox2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private pos.swing.PanelShadow panelShadow1;
    private pos.swing.PanelShadow panelShadow3;
    private pos.swing.PictureBox pictureBox2;
    private pos.includes.Profile profile1;
    private pos.swing.RoundPanel roundPanel1;
    private pos.swing.RoundPanel roundPanel2;
    private pos.swing.RoundPanel roundPanel3;
    private pos.swing.TextField textProductID;
    private pos.swing.TextField textProductID1;
    private pos.swing.TextField textProductID2;
    private pos.swing.TextField textProductID3;
    private pos.swing.TextField textProductName;
    private pos.swing.TextField textProductPrice;
    private pos.swing.TextField textProductQuantity;
    private pos.swing.TextField textSellerID;
    private pos.swing.TextField textSellerName;
    private pos.swing.TextField textSellerPassword;
    private pos.winButtons.Win_Button win_Button1;
    // End of variables declaration//GEN-END:variables
}
