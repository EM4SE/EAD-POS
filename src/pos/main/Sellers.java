package pos.main;

import pos.table.TableCustom;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import pos.database.DBConfig;

/**
 *
 * @author Anjana
 */
public class Sellers extends javax.swing.JPanel {

    /**
     * Creates new form Sellers
     */
    public Sellers() {

        initComponents();
        TableCustom.apply(TableScollPaneSellers, TableCustom.TableType.MULTI_LINE);
        loadSellerData();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textSellerName = new pos.swing.TextField();
        textSellerPassword = new pos.swing.TextField();
        textSellerID = new pos.swing.TextField();
        comboGender = new pos.combox.CustomComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonDeleteSeller = new pos.swing.Button();
        buttonEditSeller = new pos.swing.Button();
        buttonAddSeller = new pos.swing.Button();
        tablepanel = new pos.swing.RoundPanel();
        TableScollPaneSellers = new javax.swing.JScrollPane();
        SellersTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 102, 255));
        jLabel1.setText("Manage Sellers");

        textSellerName.setShadowColor(new java.awt.Color(23, 102, 255));

        textSellerPassword.setShadowColor(new java.awt.Color(23, 102, 255));

        textSellerID.setToolTipText("");
        textSellerID.setName(""); // NOI18N
        textSellerID.setShadowColor(new java.awt.Color(23, 102, 255));

        comboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        comboGender.setSelectedIndex(-1);
        comboGender.setToolTipText("");
        comboGender.setPreferredSize(new java.awt.Dimension(98, 41));
        comboGender.setShadowColor(new java.awt.Color(23, 102, 255));

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
        buttonDeleteSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteSellerActionPerformed(evt);
            }
        });

        buttonEditSeller.setBackground(new java.awt.Color(255, 204, 102));
        buttonEditSeller.setText("Edit Seller");
        buttonEditSeller.setFocusPainted(false);
        buttonEditSeller.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonEditSeller.setShadowColor(new java.awt.Color(0, 51, 255));
        buttonEditSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditSellerActionPerformed(evt);
            }
        });

        buttonAddSeller.setBackground(new java.awt.Color(0, 204, 255));
        buttonAddSeller.setText("Add Seller");
        buttonAddSeller.setFocusPainted(false);
        buttonAddSeller.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonAddSeller.setShadowColor(new java.awt.Color(0, 51, 255));
        buttonAddSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddSellerActionPerformed(evt);
            }
        });

        tablepanel.setBackground(new java.awt.Color(204, 255, 255));

        SellersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seller ID", "Seller Name", "Seller Password", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableScollPaneSellers.setViewportView(SellersTable);
        if (SellersTable.getColumnModel().getColumnCount() > 0) {
            SellersTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            SellersTable.getColumnModel().getColumn(1).setPreferredWidth(250);
            SellersTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            SellersTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        javax.swing.GroupLayout tablepanelLayout = new javax.swing.GroupLayout(tablepanel);
        tablepanel.setLayout(tablepanelLayout);
        tablepanelLayout.setHorizontalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableScollPaneSellers, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablepanelLayout.setVerticalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableScollPaneSellers)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonAddSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEditSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDeleteSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textSellerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textSellerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textSellerPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
                .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddSeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditSeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeleteSeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(tablepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddSellerActionPerformed
        try {

            String sellerIdText = textSellerID.getText().trim();
            String sellerName = textSellerName.getText().trim();
            String sellerPassword = textSellerPassword.getText().trim();

            // Validate input
            if (sellerIdText.isEmpty()) {
                showErrorMessage("Error: Seller Id cannot be empty.");
                return;
            }
            if (sellerName.isEmpty()) {
                showErrorMessage("Error: Seller name cannot be empty.");
                return;
            }
            if (sellerPassword.isEmpty()) {
                showErrorMessage("Error: Seller password cannot be empty.");
                return;
            }
            if (comboGender.getSelectedIndex() == -1) {
                showErrorMessage("Error: Gender cannot be empty.");
                return;
            }
            if (!isValidName(sellerName)) {
                showErrorMessage("Error: Seller name must contain only letters.");
                return;
            }

            int sellerId = Integer.parseInt(textSellerID.getText().trim());

            if (sellerId <= 0) {
                showErrorMessage("Error: Seller ID must be a positive number.");
                return;
            }

            String gender = comboGender.getSelectedItem().toString();

            insertSeller(sellerId, sellerName, sellerPassword, gender);

        } catch (NumberFormatException e) {
            showErrorMessage("Error: Seller ID must be a number.");
        }

    }//GEN-LAST:event_buttonAddSellerActionPerformed

    private void buttonEditSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditSellerActionPerformed

        try {
            String sellerIdText = textSellerID.getText().trim();
            String sellerName = textSellerName.getText().trim();
            String sellerPassword = textSellerPassword.getText().trim();

            // Validate input
            if (sellerIdText.isEmpty()) {
                showErrorMessage("Error: Seller Id cannot be empty.");
                return;
            }
            if (sellerName.isEmpty()) {
                showErrorMessage("Error: Seller name cannot be empty.");
                return;
            }
            if (sellerPassword.isEmpty()) {
                showErrorMessage("Error: Seller password cannot be empty.");
                return;
            }
            if (comboGender.getSelectedIndex() == -1) {
                showErrorMessage("Error: Gender cannot be empty.");
                return;
            }
            if (!isValidName(sellerName)) {
                showErrorMessage("Error: Seller name must contain only letters.");
                return;
            }

            int sellerId = Integer.parseInt(textSellerID.getText().trim());

            if (sellerId <= 0) {
                showErrorMessage("Error: Seller ID must be a positive number.");
                return;
            }

            String gender = comboGender.getSelectedItem().toString();

            updateSellerData(sellerId, sellerName, sellerPassword, gender);

        } catch (NumberFormatException e) {
            showErrorMessage("Error: Seller ID must be a number.");
        }

    }//GEN-LAST:event_buttonEditSellerActionPerformed

    private void buttonDeleteSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteSellerActionPerformed
        try {
           String sellerIdText = textSellerID.getText().trim();
            

            if (sellerIdText.isEmpty()) {
                showErrorMessage("Error: Seller Not Selected!!");
                return;
            }
            int sellerId = Integer.parseInt(textSellerID.getText().trim());
            deleteSellerData(sellerId);

        } catch (NumberFormatException e) {
            showErrorMessage("Error: Seller ID must be a number.");
        }
    }//GEN-LAST:event_buttonDeleteSellerActionPerformed

    private void loadSellerData() {

        SellersTable.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                loadSelectedRowData();
            }
        });

        try {

            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();
            String sqlGetSellers = "SELECT * FROM sellers";
            PreparedStatement statementGetSellers = con.prepareStatement(sqlGetSellers);
            ResultSet rs = statementGetSellers.executeQuery();
            DefaultTableModel model = (DefaultTableModel) SellersTable.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                int ID = rs.getInt("id");
                String Name = rs.getString("name");
                String Password = rs.getString("password");
                String Gender = rs.getString("gender");

                model.addRow(new Object[]{ID, Name, Password, Gender});
            }
        } catch (SQLException e) {
            showErrorMessage("Error: Failed to load seller data.");
        }
    }

    private void insertSeller(int sellerId, String sellerName, String sellerPassword, String gender) {

        try {
            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();

            String sql = "INSERT INTO sellers (id, name, password, gender) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, sellerId);
            statement.setString(2, sellerName);
            statement.setString(3, sellerPassword);
            statement.setString(4, gender);
            statement.executeUpdate();

            showSuccessMessage("Seller data inserted successfully.");
            loadSellerData();
            clearFields();

        } catch (SQLException e) {

            if (e.getSQLState().equals("23000")) { // SQLState for integrity constraint violation
                showErrorMessage("Error: Seller Id Already in Used");
            } else {
                showErrorMessage("Error: Failed to insert seller data. Please check the connection details.");
            }
            clearFields();
        }

    }

    private void updateSellerData(int sellerId, String sellerName, String sellerPassword, String gender) {

        try {
            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();

            String sqlUpdateSellers = "UPDATE sellers SET name = ?, password = ?, gender = ? WHERE id = ?";
            PreparedStatement statementUpdateSellers = con.prepareStatement(sqlUpdateSellers);
            statementUpdateSellers.setString(1, sellerName);
            statementUpdateSellers.setString(2, sellerPassword);
            statementUpdateSellers.setString(3, gender);
            statementUpdateSellers.setInt(4, sellerId);
            statementUpdateSellers.executeUpdate();

            showSuccessMessage("Seller data Updated successfully.");
            loadSellerData();
            clearFields();

        } catch (SQLException e) {

            if (e.getSQLState().equals("23000")) { // SQLState for integrity constraint violation
                showErrorMessage("Error: Seller Id Already in Used");
            } else {
                showErrorMessage("Error: Failed to insert seller data. Please check the connection details.");
            }
            clearFields();
        }

    }

    private void deleteSellerData(int sellerId) {

        try {
            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();

            String sqlDeleteSellers = "DELETE FROM sellers WHERE id = ?";
            PreparedStatement statementDeleteSellers = con.prepareStatement(sqlDeleteSellers);
            statementDeleteSellers.setInt(1, sellerId);
            statementDeleteSellers.executeUpdate();

            showSuccessMessage("Seller data Deleted successfully.");
            loadSellerData();
            clearFields();

        } catch (SQLException e) {

            showErrorMessage("Error: Failed to insert seller data. Please check the connection details.");

            clearFields();
        }

    }

    private void loadSelectedRowData() {

        int selectedRow = SellersTable.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        String sellerId = SellersTable.getValueAt(selectedRow, 0).toString();
        String sellerName = SellersTable.getValueAt(selectedRow, 1).toString();
        String sellerPassword = SellersTable.getValueAt(selectedRow, 2).toString();
        String gender = SellersTable.getValueAt(selectedRow, 3).toString();

        textSellerID.setText(sellerId);
        textSellerName.setText(sellerName);
        textSellerPassword.setText(sellerPassword);

        if ("Male".equals(gender)) {
            comboGender.setSelectedIndex(0);
        } else {
            comboGender.setSelectedIndex(1);
        }

    }

    private boolean isValidName(String name) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    private void clearFields() {
        textSellerID.setText("");
        textSellerName.setText("");
        textSellerPassword.setText("");
        comboGender.setSelectedIndex(-1);
    }

    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void showSuccessMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SellersTable;
    private javax.swing.JScrollPane TableScollPaneSellers;
    private pos.swing.Button buttonAddSeller;
    private pos.swing.Button buttonDeleteSeller;
    private pos.swing.Button buttonEditSeller;
    private pos.combox.CustomComboBox comboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private pos.swing.RoundPanel tablepanel;
    private pos.swing.TextField textSellerID;
    private pos.swing.TextField textSellerName;
    private pos.swing.TextField textSellerPassword;
    // End of variables declaration//GEN-END:variables
}
