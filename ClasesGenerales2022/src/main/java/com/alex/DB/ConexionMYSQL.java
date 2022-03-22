/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alex.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ConexionMYSQL {
     private static Connection ConnectionDB = null;
    public Connection getConnecction(){
    
        try {
      
        String url="jdbc:mysql://localhost:3306/clase";
        String user ="alex";
        String password="root";
        
        
        ConnectionDB=DriverManager.getConnection(url,user,password);
            System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.toString());
        

    }
         return ConnectionDB;
}

//    public Connection getConecction() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
