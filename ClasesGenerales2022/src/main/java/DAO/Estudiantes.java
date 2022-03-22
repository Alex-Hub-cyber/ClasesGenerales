/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Estudiante;
import com.alex.DB.ConexionMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Estudiantes {
      ConexionMYSQL con = new ConexionMYSQL();
    Connection conexion = con.getConnecction();

    public ArrayList<Estudiante> ListadoEstudiantes() {
        ArrayList<Estudiante> listado = null;

        try {
            listado = new ArrayList<Estudiante>();

            CallableStatement cb = conexion.prepareCall("{call Estudiante_procedure()}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                //Llamar a el objeto de entidades.
                Estudiante es = new Estudiante();
                es.setNombre(resultado.getString("Nombre"));
                es.setApellido(resultado.getString("Apellido"));
                listado.add(es);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return listado;

    }
    
    public void AddEstudiante(Estudiante es){
    
        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_ESTUDIANTE(?,?)}");
            cb.setString("nombre", es.getNombre());
            cb.setString("Apellido", es.getApellido());
            cb.execute();
            
            JOptionPane.showMessageDialog(null, "Persona agregada","Mensje Sistema",1);
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error "+ex.toString(),"Mensjae Sistema",1);
        }
    
    }
}
