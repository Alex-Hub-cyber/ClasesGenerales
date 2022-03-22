/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ViewModel.NotaVM;
import com.alex.DB.ConexionMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Notas {
     
    ConexionMYSQL con = new ConexionMYSQL();
    Connection conexion = con.getConnecction();

//    public ArrayList<Nota> ListadoEstudiantes() {
//        ArrayList<Nota> listado = null;
//
//        try {
//            listado = new ArrayList<Nota>();
//
//            CallableStatement cb = conexion.prepareCall("{call SP_S_MOSTRARNOTAS()}");
//            ResultSet resultado = cb.executeQuery();
//
//            while (resultado.next()) {
//                //Llamar a el objeto de entidades.
//                Nota es = new Nota();
//                es.setNota(resultado.getString("nota"));
//                es.setNombreMateria(resultado.getString("NombreMateria"));
//                es.setNombre(resultado.getString("Nombre"));
//          
//                listado.add(es);
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//
//        return listado;
//
//    }ListadoEstudiantesConNotas
     public ArrayList<NotaVM> ListadoEstudiantesConNotas() {
        ArrayList<NotaVM> listado = new ArrayList<NotaVM>();

        try{
            CallableStatement cb = conexion.prepareCall("{call Estudiante_procedure()}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                //Llamar a el objeto de entidades.
                NotaVM es = new NotaVM();
                es.setNota(resultado.getString("Nota"));
                es.setNombreMateria(resultado.getString("NombreMateria"));
                es.setNombre(resultado.getString("Nombre"));
          
                listado.add(es);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return listado;

    }
    
}
