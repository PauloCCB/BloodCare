package Modelo;
import java.io.Serializable;

public class Usuario implements Serializable{   
    private String Nombre_Usuario;
    private String Contrasena;
    
    public Usuario(String Nombre_Usuario, String Contrasena) {
        this.Nombre_Usuario = Nombre_Usuario;
        this.Contrasena = Contrasena;
    }
    
    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }
    
    public void setNombre_Usuario(String Usuario) {
        this.Nombre_Usuario = Usuario;
    }
    
    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
    public boolean ingresar(String nombre_usuario, String contraseña){
        boolean resultado = false;
        if(this.Nombre_Usuario.equalsIgnoreCase(nombre_usuario) && 
           this.Contrasena.equals(contraseña))
        {
            resultado = true;
        }            
        return resultado; 
    }
}