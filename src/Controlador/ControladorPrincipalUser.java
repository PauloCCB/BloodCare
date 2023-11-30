package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorPrincipalUser {
    private final frmPrincipalUser vista;
    private final Usuario user;
    
    public ControladorPrincipalUser(frmPrincipalUser vista) {
        this.vista = vista;
        this.user = CredencialesLogin.usuario_validado;
                
        ActionListener btnCerrarSesionAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regresar_menu_login();
            }
        };
        
        this.vista.btn_cerrar_sesion_ico.addActionListener(btnCerrarSesionAction);
        
        this.vista.btn_cerrar_sesion_txt.addActionListener(btnCerrarSesionAction);
        
        this.vista.btn_donantes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                lanzar_menu_donantes();
            }
        });
        
        this.vista.btn_solicitudes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                lanzar_menu_solicitudes();
            }
        });
        
        this.vista.btn_extracciones.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                lanzar_menu_extracciones();
            }
        });
    } 
        
    public void lanzar_menu_donantes(){
        ControladorRegistrarDonantes controlador = new ControladorRegistrarDonantes (new frmDonantes());
        controlador.iniciar();
        vista.dispose();
    }
    
    public void lanzar_menu_solicitudes(){
        ControladorSolicitud controlador = new ControladorSolicitud (new frmSolicitudes());
        controlador.iniciar();
        vista.dispose();
    }
    
    public void lanzar_menu_extracciones(){
        ControladorExtraccion controlador = new ControladorExtraccion (new frmExtracciones());
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
        this.vista.txt_nombre_usuario.setText(user.getNombre_Usuario());
        this.vista.setVisible(true);
    }
}
