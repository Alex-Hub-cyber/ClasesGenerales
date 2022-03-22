/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Estudiante;
import com.alex.DB.ConexionMYSQL;
import com.sun.source.tree.TryTree;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ClsLoguin {
    
  
    ConexionMYSQL con = new ConexionMYSQL();
    Connection conexion = con.getConnecction();
    
    boolean c = false;
    
    
    public boolean Acceso (Estudiante Estu){
       
        String s = "{Call Seguridad_procedure(?,?)}";
        
        
        
        try {
            
            CallableStatement  callab = conexion.prepareCall(s);
            
            callab.setString("PUserName",Estu.getUserName());
            callab.setString("PPasswordUser",Estu.getPasswordUser());
            ResultSet Result = callab.executeQuery();
            
            if(Result.next()){
            
            c = true;
            return c;
            } 
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.toString());
        }
        
    
    return c;
    }
    
    
 
    
}

