/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author user
 */
public class Estudiante {
    
    String idEstudinate;
    String Nombre;
    String Apellido;
    String UserName;
    String PasswordUser; 

    public String getIdEstudinate() {
        return idEstudinate;
    }

    public void setIdEstudinate(String idEstudinate) {
        this.idEstudinate = idEstudinate;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }    

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPasswordUser() {
        return PasswordUser;
    }

    public void setPasswordUser(String PasswordUser) {
        this.PasswordUser = PasswordUser;
    }
    
}
