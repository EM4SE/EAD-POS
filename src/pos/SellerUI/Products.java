/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos.SellerUI;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pos.database.DBConfig;
import pos.SellerUI.SellerUI;

/**
 *
 * @author Anjana
 */
public class Products extends javax.swing.JPanel {

    int productID;
    String productName;
    double productPrice;

    SellerUI sellui;

    public Products() {
        initComponents();
        sellui = new SellerUI(2966,"AnjanaEkanayaka");
        sellui.setVisible(true);
    }

    public Products(int ProductID, String ProductName, String ProductCategory, double ProductPrice, String ImagePath) {
        initComponents();
        this.productID = ProductID;
        this.productName = ProductName;
        this.productPrice = ProductPrice;

        labelName.setText(ProductName);
        labelPrice.setText(Double.toString(ProductPrice));
        labelCategory.setText(ProductCategory);

        ImageIcon imageIcon = new ImageIcon(ImagePath);
        picture.setIcon(imageIcon);
        picture.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new Custom.Components.Swing.PanelShadow();
        labelName = new javax.swing.JLabel();
        labelCategory = new javax.swing.JLabel();
        textqty = new Custom.Components.Swing.TextField();
        buttonadd = new Custom.Components.Swing.Button();
        labelPrice = new javax.swing.JLabel();
        picture = new Custom.Components.Swing.ImageAvatar();

        setBackground(new java.awt.Color(242, 246, 253));
        setMaximumSize(new java.awt.Dimension(190, 319));

        panelShadow1.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow1.setMaximumSize(new java.awt.Dimension(190, 308));

        labelName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelName.setText("Product Name");
        labelName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelCategory.setForeground(new java.awt.Color(0, 102, 0));
        labelCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCategory.setText("Product Category");

        textqty.setShadowColor(new java.awt.Color(51, 0, 255));

        buttonadd.setBackground(new java.awt.Color(0, 204, 255));
        buttonadd.setText("Add to Cart");
        buttonadd.setRippleColor(new java.awt.Color(255, 0, 0));
        buttonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonaddActionPerformed(evt);
            }
        });

        labelPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelPrice.setForeground(new java.awt.Color(51, 204, 0));
        labelPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPrice.setText("150.00");

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textqty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
            .addComponent(picture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(labelPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelName)
                .addGap(0, 0, 0)
                .addComponent(labelCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textqty, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonaddActionPerformed

        try {

            String Quantitytext = textqty.getText().trim();

            // Validate inputs
            if (Quantitytext.isEmpty()) {
                showErrorMessage("Error: Quantity cannot be empty.");
                return;
            }
            int Quantity = Integer.parseInt(textqty.getText().trim());

            if (Quantity <= 0) {
                showErrorMessage("Error: Quantity must be a positive number.");
                return;
            }

            addtobill(Quantity);

        } catch (NumberFormatException e) {
            showErrorMessage("Error: Quantity must be a number.");
        }


    }//GEN-LAST:event_buttonaddActionPerformed

    private void addtobill(int Quantity) {
        try {

            DBConfig mycon = new DBConfig();
            Connection con = mycon.connectDB();

            // check if the product with the given ID already exists
            String checkSql = "SELECT COUNT(*) FROM cart WHERE product_id = ?";
            PreparedStatement checkStatement = con.prepareStatement(checkSql);
            checkStatement.setInt(1, productID);
            ResultSet resultSet = checkStatement.executeQuery();

            if (resultSet.next() && resultSet.getInt(1) > 0) {
                // product exists, update the record
                String updateSql = "UPDATE cart  SET qty  = ? WHERE product_id = ?";
                PreparedStatement updateStatement = con.prepareStatement(updateSql);
                updateStatement.setInt(1, Quantity);
                updateStatement.setInt(2, productID);
                updateStatement.executeUpdate();

                showSuccessMessage("Product Quantity updated successfully.");
            } else {
                // Product does not exist, insert a new record
                String insertSql = "INSERT INTO cart (product_id, product_name, qty, price) VALUES (?, ?, ?, ?)";
                PreparedStatement insertStatement = con.prepareStatement(insertSql);
                insertStatement.setInt(1, productID);
                insertStatement.setString(2, productName);
                insertStatement.setInt(3, Quantity);
                insertStatement.setDouble(4, productPrice);
                insertStatement.executeUpdate();

                showSuccessMessage("Product inserted successfully.");
            }
            con.close();

        } catch (SQLException e) {
            if (e.getSQLState().equals("23000")) { // SQLState for integrity constraint violation
                showErrorMessage("Error: Product Id Already in Use");
            } else {
                showErrorMessage(e.toString());
            }
        }
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void showSuccessMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Custom.Components.Swing.Button buttonadd;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPrice;
    private Custom.Components.Swing.PanelShadow panelShadow1;
    private Custom.Components.Swing.ImageAvatar picture;
    private Custom.Components.Swing.TextField textqty;
    // End of variables declaration//GEN-END:variables

    void addActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
