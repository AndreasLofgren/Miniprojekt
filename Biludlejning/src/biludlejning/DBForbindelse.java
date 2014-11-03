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
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Andreas
 */
public class DBForbindelse {
 //   private ArrayList<String> result; 
    private DefaultListModel model = new DefaultListModel();
    private String result;
    
    public DBForbindelse() {
//     result = new ArrayList<>();
       result = "";
        }
    public void DDL(String sql){
       // DDL bliver brugt når vi skal Selecte fra en tabel
             try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            String url = "jdbc:mysql://localhost:3306/biludlejning";
            conn = DriverManager.getConnection(url, "root", "root");
            Statement stmt = conn.createStatement();
                        
            
            
            ResultSet rs = stmt.executeQuery(sql);
            //ResultSet'et løbes igennem og kolonne fornavn udskrives
            while (rs.next()) {
            //System.out.println(rs.getString("cpr")+" "+rs.getString("fornavn")+" "+rs.getString("efternavn"));
            //System.out.println(result);
           // result.add("\n"+rs.getString("cpr")+" "+rs.getString("fornavn")+" "+rs.getString("efternavn"));
            result = rs.getString("fornavn")+", "+rs.getString("efternavn")+", "+rs.getString("cpr")+", "+rs.getString("telefon.tlf")+" ";
            model.addElement(result);
            
            }
            System.out.println(model);
            //rs.getString("cpr")+" "+rs.getString("fornavn")+" "+rs.getString("efternavn")
            stmt.close();
            conn.close();        
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found"+ex.getLocalizedMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
//    public ArrayList getArrayResult(){
//        return result;
//        
//    }
    
    public ListModel getModel(){
        return model;
        
        
    }
    public ListModel clearModel(){
        model.clear();
        return model;
    }
    
    public void DML(String sql){
     // DML bliver brugt når vi skal oprette en kunde, samt når vi skal opdatere informationer hos kunden.
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            String url = "jdbc:mysql://localhost:3306/biludlejning";
            conn = DriverManager.getConnection(url, "root", "root");
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