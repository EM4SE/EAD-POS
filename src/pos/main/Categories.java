/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
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
public class Categories extends javax.swing.JPanel {

   
    
    public Categories() {
        initComponents();
        TableCustom.apply(TableScollPaneCategories, TableCustom.TableType.MULTI_LINE);
        loadCategoriesData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textCategoryID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        textCategoryName = new pos.swing.TextField();
        textCategoryDescription = new pos.swing.TextField();
        buttonDeleteCategory = new pos.swing.Button();
        buttonEditCategory = new pos.swing.Button();
        buttonAddCategory = new pos.swing.Button();
        roundPanel3 = new pos.swing.RoundPanel();
        TableScollPaneCategories = new javax.swing.JScrollPane();
        CategoriesTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(23, 102, 255));
        jLabel15.setText("Manage Categories");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 255));
        jLabel17.setText("Category Name");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 255));
        jLabel18.setText("Category Description");

        textCategoryName.setToolTipText("");
        textCategoryName.setName(""); // NOI18N
        textCategoryName.setShadowColor(new java.awt.Color(23, 102, 255));

        textCategoryDescription.setToolTipText("");
        textCategoryDescription.setName(""); // NOI18N
        textCategoryDescription.setShadowColor(new java.awt.Color(23, 102, 255));

        buttonDeleteCategory.setBackground(new java.awt.Color(255, 102, 102));
        buttonDeleteCategory.setText("Delete Category");
        buttonDeleteCategory.setFocusPainted(false);
        buttonDeleteCategory.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonDeleteCategory.setShadowColor(new java.awt.Color(0, 51, 255));
        buttonDeleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteCategoryActionPerformed(evt);
            }
        });

        buttonEditCategory.setBackground(new java.awt.Color(255, 204, 102));
        buttonEditCategory.setText("Edit Category");
        buttonEditCategory.setFocusPainted(false);
        buttonEditCategory.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonEditCategory.setShadowColor(new java.awt.Color(0, 51, 255));
        buttonEditCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditCategoryActionPerformed(evt);
            }
        });

        buttonAddCategory.setBackground(new java.awt.Color(0, 204, 255));
        buttonAddCategory.setText("Add Category");
        buttonAddCategory.setFocusPainted(false);
        buttonAddCategory.setRippleColor(new java.awt.Color(51, 0, 255));
        buttonAddCategory.setShadowColor(new java.awt.Color(0, 51, 255));
        buttonAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddCategoryActionPerformed(evt);
            }
        });

        roundPanel3.setBackground(new java.awt.Color(204, 255, 255));

        CategoriesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Category Name", "Category Description"
            }
        ));
        TableScollPaneCategories.setViewportView(CategoriesTable);
        if (CategoriesTable.getColumnModel().getColumnCount() > 0) {
            CategoriesTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            CategoriesTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            CategoriesTable.getColumnModel().getColumn(2).setPreferredWidth(250);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addComponent(textCategoryName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textCategoryDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(buttonAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEditCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDeleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(56, 56, 56)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCategoryDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddCategoryActionPerformed

        try {

            String CategoryName = textCategoryName.getText().trim();
            String CategoryDescription = textCategoryDescription.getText().trim();

            // Validate input
            if (CategoryName.isEmpty()) {
                showErrorMessage("Error: Category name cannot be empty.");
                return;
            }
            if (CategoryDescription.isEmpty()) {
                showErrorMessage("Error: Category Description cannot be empty.");
                return;
            }
            if (!isValidName(CategoryName)) {
                showErrorMessage("Error: Category name must contain only letters.");
                return;
            }

            
            insertCategories(CategoryName, CategoryDescription);
        } catch (NumberFormatException e) {
            showErrorMessage("Error: Category ID must be a number.");
        }
    }//GEN-LAST:event_buttonAddCategoryActionPerformed

    private void buttonEditCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditCategoryActionPerformed
        try {

            String CategoryName = textCategoryName.getText().trim();
            String CategoryDescription = textCategoryDescription.getText().trim();

            // Validate input
            if (CategoryName.isEmpty()) {
                showErrorMessage("Error: Category name cannot be empty.");
                return;
            }
            if (CategoryDescription.isEmpty()) {
                showErrorMessage("Error: Category Description cannot be empty.");
                return;
            }
            if (!isValidName(CategoryName)) {
                showErrorMessage("Error: Category name must contain only letters.");
                return;
            }

            int CategoryID = Integer.parseInt(textCategoryID.getText().trim());

            updateCategoryData(CategoryID, CategoryName, CategoryDescription);
        } catch (NumberFormatException e) {
            showErrorMessage("Error: Category ID must be a number.");
        }
    }//GEN-LAST:event_buttonEditCategoryActionPerformed

    private void buttonDeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteCategoryActionPerformed
        try {
            String CategoryIDText = textCategoryID.getText().trim();

            if (CategoryIDText.isEmpty()) {
                showErrorMessage("Error: Category Not Selected.");
                return;
            }
            int CategoryID = Integer.parseInt(textCategoryID.getText().trim());
            deleteCategoryrData(CategoryID);

        } catch (NumberFormatException e) {
            showErrorMessage("Error: Category ID must be a number.");
        }
    }//GEN-LAST:event_buttonDeleteCategoryActionPerformed

    private void insertCategories(String CategoryName, String CategoryDescription) {

        try {
            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();

            String sql = "INSERT INTO categories (category_name ,category_description) VALUES (?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, CategoryName);
            statement.setString(2, CategoryDescription);

            statement.executeUpdate();

            showSuccessMessage("Category data inserted successfully.");
            loadCategoriesData();
            clearFields();
            
            

        } catch (SQLException e) {

            if (e.getSQLState().equals("23000")) { // SQLState for integrity constraint violation
                showErrorMessage("Error: Category Name Already in Used");
            } else {
                showErrorMessage("Error: Failed to insert Category data. Please check the connection details.");
            }
            clearFields();
        }

    }

    private void updateCategoryData(int CategoryID, String CategoryName, String CategoryDescription) {

        try {
            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();

            String sqlUpdateCategory = "UPDATE categories SET category_name = ?, category_description = ? WHERE category_id = ?";
            PreparedStatement statementUpdateCategory = con.prepareStatement(sqlUpdateCategory);
            statementUpdateCategory.setString(1, CategoryName);
            statementUpdateCategory.setString(2, CategoryDescription);
            statementUpdateCategory.setInt(3, CategoryID);
            statementUpdateCategory.executeUpdate();

            showSuccessMessage("Category data Updated successfully.");
            loadCategoriesData();
            clearFields();
        

        } catch (SQLException e) {

            if (e.getSQLState().equals("23000")) { // SQLState for integrity constraint violation
                showErrorMessage("Error: Category Name Already in Used");
            } else {
                showErrorMessage("Error: Failed to insert Category data. Please check the connection details.");
            }
            clearFields();
        }

    }

    private void loadCategoriesData() {

        CategoriesTable.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                loadSelectedRowData();
            }
        });

        try {

            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();

            String sqlGetCategories = "SELECT * FROM categories";
            PreparedStatement statementGetCategories = con.prepareStatement(sqlGetCategories);
            ResultSet rs = statementGetCategories.executeQuery();
            DefaultTableModel model = (DefaultTableModel) CategoriesTable.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                int ID = rs.getInt("category_id");
                String Name = rs.getString("category_name");
                String Description = rs.getString("category_description");

                model.addRow(new Object[]{ID, Name, Description});
            }
        } catch (SQLException e) {
            showErrorMessage("Error: Failed to load Categories data.");
        }
    }

    private void loadSelectedRowData() {

        int selectedRow = CategoriesTable.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        String CategoryID = CategoriesTable.getValueAt(selectedRow, 0).toString();
        String CategoryName = CategoriesTable.getValueAt(selectedRow, 1).toString();
        String CategoryDescription = CategoriesTable.getValueAt(selectedRow, 2).toString();

        textCategoryID.setText(CategoryID);
        textCategoryName.setText(CategoryName);
        textCategoryDescription.setText(CategoryDescription);

    }

    private void deleteCategoryrData(int CategoryID) {

        try {
            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();

            String sqlDeleteCategory = "DELETE FROM categories WHERE category_id = ?";
            PreparedStatement statementDeleteCategory = con.prepareStatement(sqlDeleteCategory);
            statementDeleteCategory.setInt(1, CategoryID);
            statementDeleteCategory.executeUpdate();

            showSuccessMessage("Category data Deleted successfully.");
            loadCategoriesData();
            clearFields();
           

        } catch (SQLException e) {

            showErrorMessage("Error: Failed to Delete Category data. Please check the connection details.");

            clearFields();
        }

    }

    private boolean isValidName(String name) {
        Pattern pattern = Pattern.compile("^[ a-zA-Z]+$");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    private void clearFields() {

        textCategoryID.setText("");
        textCategoryName.setText("");
        textCategoryDescription.setText("");
    }

    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void showSuccessMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CategoriesTable;
    private javax.swing.JScrollPane TableScollPaneCategories;
    private pos.swing.Button buttonAddCategory;
    private pos.swing.Button buttonDeleteCategory;
    private pos.swing.Button buttonEditCategory;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private pos.swing.RoundPanel roundPanel3;
    private pos.swing.TextField textCategoryDescription;
    private javax.swing.JTextField textCategoryID;
    private pos.swing.TextField textCategoryName;
    // End of variables declaration//GEN-END:variables
}
