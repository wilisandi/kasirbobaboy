/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konfigurasi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author TESTUSER
 */
public class koneksi {
    public static Connection getConnection(){
        Connection conn = null;
        String url ="jdbc:mysql://localhost:3306/bobaboy";
        String user = "root";
        String password = "";
        try{
            conn = DriverManager.getConnection(url,user,password);
        }catch(SQLException e){
            System.out.println(e);
        }
        return conn;
    }
    
    public static void main(String[] args) {
        try {
            Connection c = koneksi.getConnection();
            System.err.println(String.format("Connected to database %s"+" successfully.",c.getCatalog()));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
