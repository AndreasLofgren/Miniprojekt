/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biludlejning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andreas
 */
public class DBForbindelse {
    
    
    public DBForbindelse() {
    
        }
    public void DDL(String sql){
             try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            String url = "jdbc:mysql://localhost:3306/biludlejning";
            conn = DriverManager.getConnection(url, "root", "9919");
            Statement stmt = conn.createStatement();
                        
            
            
            ResultSet rs = stmt.executeQuery(sql);
            //ResultSet'et løbes igennem og kolonne fornavn udskrives
            while (rs.next()) {
                System.out.println(rs.getString("fornavn"));
            }

            stmt.close();
            conn.close();        
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found"+ex.getLocalizedMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    public void DML(String sql){
     
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            String url = "jdbc:mysql://localhost:3306/biludlejning";
            conn = DriverManager.getConnection(url, "root", "9919");
            Statement stmt = conn.createStatement();
                        
            
            
            stmt.executeUpdate(sql);
            
            stmt.close();
            conn.close();        
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found"+ex.getLocalizedMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
}
            
}