package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorLogin {
    private final frmLogin vista;
    
    ConsultasUsuarios cU = new ConsultasUsuarios();
    ConsultasAdministrador cA = new ConsultasAdministrador();
    
    UsuarioArreglo usuarios_db;
    AdministradorArreglo administradores_db;
    
    public ControladorLogin(frmLogin vista) {
        this.vista = vista;
        
        this.vista.btn_ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (validar_campos()){
                    
                    Usuario user = usuarios_db.ingresar(vista.fld_usuario.getText(), vista.fld_contraseña.getText());
                    
                    Administrador admin = administradores_db.ingresar(vista.fld_usuario.getText(), vista.fld_contraseña.getText());
                    
                    switch(validar_credenciales(user,admin)){
                        case "administrador" -> {
                            CredencialesLogin.administrador_validado = admin;
                            lanzar_menu_administrador();
                            break;
                        }
                        case "usuario" -> {
                            CredencialesLogin.usuario_validado = user;
                            lanzar_menu_usuario();
                            break;
                        }
                        case "incorrectos" -> {
                            JOptionPane.showMessageDialog(vista, "Usuario y/o contraseña incorrectas");
                            limpiar_campos();
                            break;
                        }
                    }
                }
            }
        });
    }
        
    public boolean validar_campos(){
        String usuario = vista.fld_usuario.getText();
        String contraseña = vista.fld_contraseña.getText();
        
        if (usuario.isEmpty()){
            if(contraseña.isEmpty()){
                System.out.println("1");
                JOptionPane.showMessageDialog(vista, "Ingrese un usuario y contraseña");
            }
            else{
                System.out.println("2");
                JOptionPane.showMessageDialog(vista, "Ingrese un usuario");
            }
            return false;
        }
        else if(contraseña.isEmpty()){
            System.out.println("3");
            JOptionPane.showMessageDialog(vista, "Ingrese una contraseña");
            return false;
        }
        return true;
    }
    
    public String validar_credenciales(Usuario user, Administrador admin){
        if(admin != null){
            return "administrador";
        }else if(user != null){
            return "usuario";
        }else{
            return "incorrectos";
        }
    }
    
    public void lanzar_menu_administrador(){
        ControladorPrincipalAdmin controladoradmin = new ControladorPrincipalAdmin(new frmPrincipalAdmin());
        controladoradmin.iniciar();
        vista.dispose();
    }
    
    public void lanzar_menu_usuario(){
        ControladorPrincipalUser controladoruser = new ControladorPrincipalUser(new frmPrincipalUser());
        controladoruser.iniciar();
        vista.dispose();
    }
    
    public void cargar_datos(){
        usuarios_db = cU.cargarUsuarios();
        administradores_db = cA.cargarAdministradores();
    }
    
    public void limpiar_campos(){
        this.vista.fld_usuario.setText("");
        this.vista.fld_contraseña.setText("");
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        cargar_datos();
        limpiar_campos();
        this.vista.setVisible(true);
    }
}
