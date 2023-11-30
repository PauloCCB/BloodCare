package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorPrincipalAdmin {
    private final frmPrincipalAdmin vista;
    private final Administrador admin;
    
    public ControladorPrincipalAdmin(frmPrincipalAdmin vista) {
        this.vista = vista;
        this.admin = CredencialesLogin.administrador_validado;
        
        
        ActionListener btnCerrarSesionAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regresar_menu_login();
            }
        };
        this.vista.btn_cerrar_sesion_ico.addActionListener(btnCerrarSesionAction);
        this.vista.btn_cerrar_sesion_txt.addActionListener(btnCerrarSesionAction);
        
        this.vista.btn_usuarios.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                lanzar_menu_usuarios();
            }
        });
        
        this.vista.btn_inventario.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                lanzar_menu_inventario();
            }
        });
    } 
    
    public void lanzar_menu_usuarios(){
        ControladorUsuarios controlador = new ControladorUsuarios(new frmUsuarios());
        controlador.iniciar();
        vista.dispose();
    }
    
    public void lanzar_menu_inventario(){
        ControladorInventario controlador = new ControladorInventario(new frmInventario());
        controlador.iniciar();
        vista.dispose();
    }
    
    public void regresar_menu_login(){
        ControladorLogin controlador = new ControladorLogin( new frmLogin());
        controlador.iniciar();
        vista.dispose();
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.txt_nombre_usuario.setText(admin.getAdministrador());
    }
}
