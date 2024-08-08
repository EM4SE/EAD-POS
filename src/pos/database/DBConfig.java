/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.database;

import java.sql.*;

/**
 *
 * @author Anjana
 */
public class DBConfig {

    Connection con;

    public Connection connectDB() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ead_pos", "root", "root");
            //Statement statement = con.createStatement();

            // String sql = "INSERT INTO student VALUES('Janith','Kandy')";
            //statement.executeUpdate(sql);
            // con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }

        return con;

    }
}
