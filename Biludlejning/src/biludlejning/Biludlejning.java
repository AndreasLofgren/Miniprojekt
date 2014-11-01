/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biludlejning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Andreas
 */
public class Biludlejning {
    private ArrayList<Bil> biler;
    private ArrayList<LedigeBiler> ledigeBiler;
    private ArrayList<Kunde> kunder;
    private ArrayList<Reservation> kontrakter;
    private DBForbindelse db;
        
    public Biludlejning() {
        biler = new ArrayList<>();
        ledigeBiler = new ArrayList<>();
        kunder = new ArrayList<>();
        kontrakter = new ArrayList<>();
        db = new DBForbindelse();
        
        
    }
    
    public void udfyldBiler() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            String url = "jdbc:mysql://localhost:3306/mycontacts";
            conn = DriverManager.getConnection(url, "root", "root");
            Statement stmt = conn.createStatement();
            
            String sql = "Select prisgruppe From biler";
            String sql1 = "Select bilmaerke From biler";
            String sql2 = "Select model From biler";
            System.out.println(sql + sql1 + sql2);
            stmt.execute(sql + sql1 + sql2);
            
            while (!sql.isEmpty()) {
                Prisgruppe type = new Prisgruppe(sql);
                Bil nyBil = new Bil(type, sql1, sql2);
                biler.add(nyBil);
            }                                
                        
            stmt.close();
            conn.close();        
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found"+ex.getLocalizedMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
    
}
