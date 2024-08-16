/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.SellerUI;

import Custom.Components.table.TableCustom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.database.DBConfig;

/**
 *
 * @author Anjana
 */
public class SellerUI extends javax.swing.JFrame {

    int ProductID;
    String category;
    Products products1;

    public SellerUI(String Sellername) {
        initComponents();
        labelName.setText(Sellername);
        TableCustom.apply(sellerscollpane, TableCustom.TableType.MULTI_LINE);
        loadCategories();
        loadSelectedRowData();
        loadForm();
        loadBill();
    }

    private void loadForm() {

        ProductsLoad.removeAll();
        ProductsLoad.removeAll();
        ProductsLoad.repaint();
        category = comboboxCategory.getSelectedItem().toString().trim();

        if ("All".equals(category) || "".equals(category)) {
            try {

                DBConfig mycon = new DBConfig();
                Connection con = mycon.connectDB();

                String sqlGetProducts = "SELECT * FROM products";
                PreparedStatement statementGetProducts = con.prepareStatement(sqlGetProducts);
                ResultSet rs = statementGetProducts.executeQuery();

                while (rs.next()) {

                    int ProductID = rs.getInt("product_id");
                    String ProductName = rs.getString("product_name");
                    String ProductCategory = rs.getString("product_category");
                    double ProductPrice = rs.getDouble("product_price");
                    String ImagePath = rs.getString("product_imagepath");

                    //call parametered constructor to assign values
                    products1 = new pos.SellerUI.Products(ProductID, ProductName, ProductCategory, ProductPrice, ImagePath);
                    ProductsLoad.add(products1);

                }
            } catch (SQLException e) {
                showErrorMessage("Error: Failed to load Products.");
            }
        } else {
            try {

                DBConfig mycon = new DBConfig();
                Connection con = mycon.connectDB();

                String sqlGetProducts = "SELECT * FROM products WHERE product_category = ? ";
                PreparedStatement statementGetProducts = con.prepareStatement(sqlGetProducts);
                statementGetProducts.setString(1, category);
                ResultSet rs = statementGetProducts.executeQuery();

                while (rs.next()) {

                    int ProductID = rs.getInt("product_id");
                    String ProductName = rs.getString("product_name");
                    String ProductCategory = rs.getString("product_category");
                    double ProductPrice = rs.getDouble("product_price");
                    String ImagePath = rs.getString("product_imagepath");
                    //call parametered constructor to assign values
                    products1 = new pos.SellerUI.Products(ProductID, ProductName, ProductCategory, ProductPrice, ImagePath);
                    ProductsLoad.add(products1);

                }
            } catch (SQLException e) {
                showErrorMessage("Error: Failed to load Categories.");
            }
        }
    }

    private void loadCategories() {
        try {

            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();

            String sqlGetCategories = "SELECT category_name FROM categories";
            PreparedStatement statementGetCategories = con.prepareStatement(sqlGetCategories);
            ResultSet rs = statementGetCategories.executeQuery();

            comboboxCategory.removeAllItems();
            comboboxCategory.addItem("All");
            while (rs.next()) {
                String Name = rs.getString("category_name");
                comboboxCategory.addItem(Name);

            }
        } catch (SQLException e) {
            showErrorMessage("Error: Failed to load Categories.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Products = new javax.swing.JPanel();
        background1 = new Custom.Components.Swing.Background();
        panelShadow2 = new Custom.Components.Swing.PanelShadow();
        win_Button1 = new pos.winButtons.Win_Button();
        panelShadow3 = new Custom.Components.Swing.PanelShadow();
        jScrollPane1 = new Custom.Components.ScollBar.ScrollPaneWin11();
        ProductsLoad = new javax.swing.JPanel();
        FilterButton = new Custom.Components.Swing.Button();
        comboboxCategory = new Custom.Components.comboboxes.ComboBoxSuggestion();
        buttonDelete = new Custom.Components.Swing.Button();
        panelShadow4 = new Custom.Components.Swing.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        textCash = new Custom.Components.Swing.TextField();
        labelBalance = new javax.swing.JLabel();
        button1 = new Custom.Components.Swing.Button();
        sellerscollpane = new javax.swing.JScrollPane();
        tableBill = new javax.swing.JTable();
        BillScrollpane = new Custom.Components.ScollBar.ScrollPaneWin11();
        billtext = new javax.swing.JTextArea();
        labelName = new javax.swing.JLabel();

        javax.swing.GroupLayout ProductsLayout = new javax.swing.GroupLayout(Products);
        Products.setLayout(ProductsLayout);
        ProductsLayout.setHorizontalGroup(
            ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        ProductsLayout.setVerticalGroup(
            ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        panelShadow2.setBackground(new java.awt.Color(255, 255, 255));

        ProductsLoad.setBackground(new java.awt.Color(242, 246, 253));
        ProductsLoad.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ProductsLoadMouseMoved(evt);
            }
        });
        ProductsLoad.setLayout(new java.awt.GridLayout(0, 3, 7, 7));
        jScrollPane1.setViewportView(ProductsLoad);

        FilterButton.setBackground(new java.awt.Color(255, 153, 0));
        FilterButton.setText("Filter");
        FilterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterButtonMouseClicked(evt);
            }
        });
        FilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterButtonActionPerformed(evt);
            }
        });

        comboboxCategory.setEditable(false);
        comboboxCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboboxCategoryItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelShadow3Layout = new javax.swing.GroupLayout(panelShadow3);
        panelShadow3.setLayout(panelShadow3Layout);
        panelShadow3Layout.setHorizontalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow3Layout.createSequentialGroup()
                .addComponent(comboboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );
        panelShadow3Layout.setVerticalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow3Layout.createSequentialGroup()
                .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buttonDelete.setBackground(new java.awt.Color(255, 102, 102));
        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        panelShadow4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setText("Total :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel2.setText("Cash :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel3.setText("Balance :");

        labelTotal.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        labelTotal.setText("00");

        textCash.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCashKeyReleased(evt);
            }
        });

        labelBalance.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        labelBalance.setText("00");

        javax.swing.GroupLayout panelShadow4Layout = new javax.swing.GroupLayout(panelShadow4);
        panelShadow4.setLayout(panelShadow4Layout);
        panelShadow4Layout.setHorizontalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelShadow4Layout.createSequentialGroup()
                        .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelShadow4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelShadow4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelShadow4Layout.setVerticalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelTotal))
                .addGap(3, 3, 3)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(textCash, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelBalance))
                .addContainerGap())
        );

        button1.setBackground(new java.awt.Color(0, 204, 102));
        button1.setText("Pay & Print");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        tableBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Qty", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sellerscollpane.setViewportView(tableBill);
        if (tableBill.getColumnModel().getColumnCount() > 0) {
            tableBill.getColumnModel().getColumn(0).setMinWidth(0);
            tableBill.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableBill.getColumnModel().getColumn(0).setMaxWidth(0);
            tableBill.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableBill.getColumnModel().getColumn(2).setPreferredWidth(20);
            tableBill.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        billtext.setColumns(20);
        billtext.setRows(5);
        BillScrollpane.setViewportView(billtext);

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelName.setText("Seller Name");

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addComponent(sellerscollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BillScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(356, 356, 356)
                .addComponent(win_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow2Layout.createSequentialGroup()
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(win_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BillScrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                            .addComponent(sellerscollpane))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1470, Short.MAX_VALUE)
            .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(background1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
            .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadBill() {

        tableBill.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                loadSelectedRowData();
            }
        });
        try {
            Bill();
            cal();

            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();
            String sqlcaltotprice = "UPDATE cart SET totalprice = qty * price ";
            PreparedStatement statementTotal = con.prepareStatement(sqlcaltotprice);
            statementTotal.executeUpdate();

            String sqlGeBills = "SELECT * FROM cart";
            PreparedStatement statementBills = con.prepareStatement(sqlGeBills);
            ResultSet rs = statementBills.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tableBill.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                int ID = rs.getInt("product_id");
                String Name = rs.getString("product_name");
                int Qty = rs.getInt("qty");
                double TotalPrice = rs.getDouble("totalprice");

                model.addRow(new Object[]{ID, Name, Qty, TotalPrice});
            }
        } catch (SQLException e) {
            showErrorMessage(e.toString());
        }
    }

    public void cal() {
        //cal total table values

        try{
        int numOfRow = tableBill.getRowCount();
        double tot = 0.0;

        for (int i = 0; i < numOfRow; i++) {

            double value = Double.parseDouble(tableBill.getValueAt(i, 3).toString());

            tot += value;

        }

        DecimalFormat df = new DecimalFormat("00.00");
        labelTotal.setText(df.format(tot));
        }catch(NumberFormatException ex ){
             showErrorMessage("Error: Failed to cal total amount.");
        }
    }

    public void pay() {
        // pat btn action

        String totalText = labelTotal.getText();
        String payText = textCash.getText();

        // Check if the total or pay fields are empty or null
        if (payText == null || payText.isEmpty()) {
            showErrorMessage("Please enter valid values Pay");
            return;
        }

        try {
            double tot = Double.parseDouble(totalText);
            double paid = Double.parseDouble(payText);
            double balance = paid - tot;

            DecimalFormat df = new DecimalFormat("00.00");

            labelBalance.setText(String.valueOf(df.format(balance)));
            Bill();

        } catch (NumberFormatException e) {
            // Handle invalid number format
            JOptionPane.showMessageDialog(this, "Please enter valid values Pay", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Bill() {
        // bill print

        try {

            billtext.setText("                         EMASE Resturant \n");
            billtext.setText(billtext.getText() + "                         268/ Matale Road, \n");
            billtext.setText(billtext.getText() + "                         Kandy, Sri lanka, \n");
            billtext.setText(billtext.getText() + "                         +9475 6441389, \n");
            billtext.setText(billtext.getText() + "-------------------------------------------------------------------------\n");
            billtext.setText(billtext.getText() + "  Item \t\tQty \tPrice" + "\n");
            billtext.setText(billtext.getText() + "-------------------------------------------------------------------------\n");

            DefaultTableModel df = (DefaultTableModel) tableBill.getModel();

            // get table Product details
            for (int i = 0; i < tableBill.getRowCount(); i++) {

                String Name = df.getValueAt(i, 1).toString().trim();
                String Qty = df.getValueAt(i, 2).toString().trim();
                String Price = df.getValueAt(i, 3).toString().trim();

                billtext.setText(billtext.getText() + "  " + Name + "\t\t" + Qty + "\t" + Price + "\n");
            }

            billtext.setText(billtext.getText() + "-------------------------------------------------------------------------\n");
            billtext.setText(billtext.getText() + "Sub Total : " + labelTotal.getText() + "\n");
            billtext.setText(billtext.getText() + "Cash      : " + textCash.getText() + "\n");
            billtext.setText(billtext.getText() + "Balance   : " + labelBalance.getText() + "\n");
            billtext.setText(billtext.getText() + "-------------------------------------------------------------------------\n");
            billtext.setText(billtext.getText() + "                     Thanks For Your Business...!" + "\n");
            billtext.setText(billtext.getText() + "-------------------------------------------------------------------------\n");
            billtext.setText(billtext.getText() + "                     Software by Anjana Ekanayaka" + "\n");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void loadSelectedRowData() {

        //ignore header row 
        int selectedRow = tableBill.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        String ProductIDText = tableBill.getValueAt(selectedRow, 0).toString();
        ProductID = Integer.parseInt(ProductIDText.trim());

    }

    private void FilterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterButtonMouseClicked
        loadForm();
    }//GEN-LAST:event_FilterButtonMouseClicked

    private void FilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterButtonActionPerformed

        loadForm();
    }//GEN-LAST:event_FilterButtonActionPerformed

    private void ProductsLoadMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsLoadMouseMoved
       try {

            loadBill();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ProductsLoadMouseMoved

    private void textCashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCashKeyReleased
        pay();
    }//GEN-LAST:event_textCashKeyReleased

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        try {
            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();

            String sqlDelete = "DELETE FROM cart WHERE product_id = ?";
            PreparedStatement statementDelete = con.prepareStatement(sqlDelete);
            statementDelete.setInt(1, ProductID);
            statementDelete.executeUpdate();

            showSuccessMessage("Data Deleted successfully.");
            loadBill();

        } catch (SQLException e) {

            showErrorMessage("Error: Failed to Delete seller data. Please check the connection details.");

        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void comboboxCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboboxCategoryItemStateChanged
       loadForm();
    }//GEN-LAST:event_comboboxCategoryItemStateChanged

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
            java.util.logging.Logger.getLogger(SellerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BillScrollpane;
    private Custom.Components.Swing.Button FilterButton;
    private javax.swing.JPanel Products;
    private javax.swing.JPanel ProductsLoad;
    private Custom.Components.Swing.Background background1;
    private javax.swing.JTextArea billtext;
    private Custom.Components.Swing.Button button1;
    private Custom.Components.Swing.Button buttonDelete;
    private Custom.Components.comboboxes.ComboBoxSuggestion comboboxCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBalance;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelTotal;
    private Custom.Components.Swing.PanelShadow panelShadow2;
    private Custom.Components.Swing.PanelShadow panelShadow3;
    private Custom.Components.Swing.PanelShadow panelShadow4;
    private javax.swing.JScrollPane sellerscollpane;
    private javax.swing.JTable tableBill;
    private Custom.Components.Swing.TextField textCash;
    private pos.winButtons.Win_Button win_Button1;
    // End of variables declaration//GEN-END:variables
}
