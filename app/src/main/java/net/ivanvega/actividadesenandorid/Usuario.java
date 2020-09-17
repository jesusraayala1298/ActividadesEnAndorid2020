package net.ivanvega.actividadesenandorid;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Usuario implements Serializable {
    private String Nombre;
    private String Telefono;
    private String Email;
    private String Contraseña;

    public Usuario(String nombre, String telefono, String email, String contraseña) {
        Nombre = nombre;
        Telefono = telefono;
        Email = email;
        Contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    @Override
    public String toString(){
        return Nombre;
    }
}
