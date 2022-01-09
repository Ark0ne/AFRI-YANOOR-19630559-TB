package koneksi;


import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author afri
 */
public class Koneksi {
    Connection con;
    public static Connection getKoneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_kepegawaian","root","");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
        
    }
    
}
