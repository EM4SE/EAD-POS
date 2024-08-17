package pos.SellerUI;

import Custom.Components.table.TableCustom;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.database.DBConfig;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Anjana
 */
public class SellerUI extends javax.swing.JFrame {

    int ProductID;
    String category;
    Products products1;
    String SellerName;
    int SellerID;

    public SellerUI(int SellerID, String Sellername) {
        initComponents();
        //setBackground(new Color(0, 0, 0, 0));
        this.SellerID = SellerID;
        this.SellerName = Sellername;
        labelName.setText(Sellername);
        TableCustom.apply(sellerscollpane, TableCustom.TableType.MULTI_LINE);
        TableCustom.apply(recieptsscrollpane, TableCustom.TableType.MULTI_LINE);
        loadCategories();
        loadForm("All");
        loadreciepts();
    }

    private void loadForm(String Cat) {

        ProductsLoad.removeAll();
        ProductsLoad.revalidate();
        ProductsLoad.repaint();

        if ("All".equals(Cat) || "".equals(Cat)) {
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
                statementGetProducts.setString(1, Cat);
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
        comboboxCategory = new Custom.Components.comboboxes.ComboBoxSuggestion();
        jScrollPane1 = new Custom.Components.ScollBar.ScrollPaneWin11();
        ProductsLoad = new javax.swing.JPanel();
        buttonDelete = new Custom.Components.Swing.Button();
        panelShadow4 = new Custom.Components.Swing.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        textCash = new Custom.Components.Swing.TextField();
        labelBalance = new javax.swing.JLabel();
        buttonPay = new Custom.Components.Swing.Button();
        sellerscollpane = new javax.swing.JScrollPane();
        tableBill = new javax.swing.JTable();
        BillScrollpane = new Custom.Components.ScollBar.ScrollPaneWin11();
        billtext = new javax.swing.JTextArea();
        labelName = new javax.swing.JLabel();
        recieptsscrollpane = new javax.swing.JScrollPane();
        tableReciepts = new javax.swing.JTable();

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

        comboboxCategory.setEditable(false);
        comboboxCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboboxCategoryItemStateChanged(evt);
            }
        });

        ProductsLoad.setBackground(new java.awt.Color(242, 246, 253));
        ProductsLoad.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ProductsLoadMouseMoved(evt);
            }
        });
        ProductsLoad.setLayout(new java.awt.GridLayout(0, 3, 7, 7));
        jScrollPane1.setViewportView(ProductsLoad);

        javax.swing.GroupLayout panelShadow3Layout = new javax.swing.GroupLayout(panelShadow3);
        panelShadow3.setLayout(panelShadow3Layout);
        panelShadow3Layout.setHorizontalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow3Layout.createSequentialGroup()
                .addComponent(comboboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(373, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        panelShadow3Layout.setVerticalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow3Layout.createSequentialGroup()
                .addComponent(comboboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textCash, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelBalance)))
        );

        buttonPay.setBackground(new java.awt.Color(0, 204, 102));
        buttonPay.setText("Pay & Print");
        buttonPay.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        buttonPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPayActionPerformed(evt);
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

        tableReciepts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Seller ID", "Amount", "Date", "Text"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recieptsscrollpane.setViewportView(tableReciepts);
        if (tableReciepts.getColumnModel().getColumnCount() > 0) {
            tableReciepts.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableReciepts.getColumnModel().getColumn(1).setPreferredWidth(20);
            tableReciepts.getColumnModel().getColumn(2).setPreferredWidth(100);
            tableReciepts.getColumnModel().getColumn(3).setMinWidth(0);
            tableReciepts.getColumnModel().getColumn(3).setPreferredWidth(0);
            tableReciepts.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelShadow2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(buttonPay, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelShadow2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(recieptsscrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellerscollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BillScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(BillScrollpane)
                            .addComponent(sellerscollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelShadow2Layout.createSequentialGroup()
                                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(recieptsscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1471, Short.MAX_VALUE)
            .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(background1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
            .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(background1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadreciepts() {
        tableReciepts.getSelectionModel().addListSelectionListener(e -> {
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
            DefaultTableModel model = (DefaultTableModel) tableReciepts.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                int ID = rs.getInt("seller_id");
                String date = rs.getString("datetime");
                String Bill = rs.getString("receipt");
                double TotalPrice = rs.getDouble("totalprice");

                model.addRow(new Object[]{ID, TotalPrice, date, Bill});
            }
        } catch (SQLException e) {
            showErrorMessage(e.toString());
        }
    }

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

        try {
            int numOfRow = tableBill.getRowCount();
            double tot = 0.0;

            for (int i = 0; i < numOfRow; i++) {

                double value = Double.parseDouble(tableBill.getValueAt(i, 3).toString());

                tot += value;

            }

            DecimalFormat df = new DecimalFormat("00.00");
            labelTotal.setText(df.format(tot));
        } catch (NumberFormatException ex) {
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

            showErrorMessage("Please enter valid values Pay");
        }
    }

    public void Bill() {
        // bill print

        try {

            billtext.setText("                                    EMASE Resturant \n");
            billtext.setText(billtext.getText() + "                                    268/ Matale Road, \n");
            billtext.setText(billtext.getText() + "                                    Kandy, Sri lanka, \n");
            billtext.setText(billtext.getText() + "                                    +9475 6441389, \n");
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
            billtext.setText(billtext.getText() + "                             " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n");
            billtext.setText(billtext.getText() + "-------------------------------------------------------------------------\n");
            billtext.setText(billtext.getText() + "                     Software by Anjana Ekanayaka" + "\n");

        } catch (Exception e) {

            showErrorMessage(e.toString());

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

    private void selectreciepts() {
        int selectedRow = tableReciepts.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        String BillText = tableReciepts.getValueAt(selectedRow, 3).toString();

        billtext.setText(BillText);

    }

    private void insertbills() {
        try {

            double total = Double.parseDouble(labelTotal.getText().trim());
            double cash = Double.parseDouble(textCash.getText().trim());
            double balance = Double.parseDouble(labelBalance.getText().trim());
            String receipt = billtext.getText();

            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();

            String insertSql = "INSERT INTO bills (seller_id, seller_name, receipt, totalprice,cash,balance) VALUES (?, ?, ?, ?,? ,?)";
            PreparedStatement insertStatement = con.prepareStatement(insertSql);
            insertStatement.setInt(1, SellerID);
            insertStatement.setString(2, SellerName);
            insertStatement.setString(3, receipt);
            insertStatement.setDouble(4, total);
            insertStatement.setDouble(5, cash);
            insertStatement.setDouble(6, balance);
            insertStatement.executeUpdate();

            String truncateSql = "TRUNCATE cart;";
            PreparedStatement truncateStatement = con.prepareStatement(truncateSql);
            truncateStatement.executeUpdate();

            loadBill();
            cal();
            textCash.setText("");
            labelBalance.setText("00.00");
            Bill();

            showSuccessMessage("Payamet Process successfully.");
        } catch (SQLException | NumberFormatException e) {
            showErrorMessage(e.toString());
        }
    }

    private void invoicesaver() {
        String folderPath = "D:\\Invoices\\"; // Specify your folder path here
        LocalDateTime now = LocalDateTime.now();
        String fileName = "Invoice_" + now.format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss")) + ".txt";
        String filePath = folderPath + fileName;

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.print(billtext.getText());
            showSuccessMessage("Bill has been saved to: " + filePath);
        } catch (IOException e) {
            showErrorMessage("Error writing to file: " + e.getMessage());
        }
    }

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

    private void buttonPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPayActionPerformed
        try {
            String payText = textCash.getText();
            double balance = Double.parseDouble(labelBalance.getText().trim());

            if (payText == null || payText.isEmpty()) {
                showErrorMessage("Please enter valid values Pay");
                return;
            }
            if (balance < 0) {
                showErrorMessage("Paid Amount is not sufficient");
                return;
            }
            pay();
            invoicesaver();
            billtext.print();
            insertbills();
            loadreciepts();

        } catch (PrinterException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {

            showErrorMessage("Please enter valid values Pay");

        }

    }//GEN-LAST:event_buttonPayActionPerformed

    private void comboboxCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboboxCategoryItemStateChanged

        category = comboboxCategory.getSelectedItem().toString().trim();
        //showSuccessMessage(category);
        loadForm(category);
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
    private javax.swing.JPanel Products;
    private javax.swing.JPanel ProductsLoad;
    private Custom.Components.Swing.Background background1;
    private javax.swing.JTextArea billtext;
    private Custom.Components.Swing.Button buttonDelete;
    private Custom.Components.Swing.Button buttonPay;
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
    private javax.swing.JScrollPane recieptsscrollpane;
    private javax.swing.JScrollPane sellerscollpane;
    private javax.swing.JTable tableBill;
    private javax.swing.JTable tableReciepts;
    private Custom.Components.Swing.TextField textCash;
    private pos.winButtons.Win_Button win_Button1;
    // End of variables declaration//GEN-END:variables
}
