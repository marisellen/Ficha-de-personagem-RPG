package dao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conect {
    private static final String URL = "jdbc:mysql://localhost:3306/ficha_personagem_rpg";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection conn;
    public static Connection conector(){
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
        return conn;
    }

    public static void closeConnection(Connection conn){
        if (conn != null){
            try {
                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
}
