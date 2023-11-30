package Controlador;

import Modelo.*;
import Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorUsuarios {
    private final frmUsuarios vista;
    
    
    public ControladorUsuarios(frmUsuarios vista){
        this.vista = vista;
        
        ActionListener btnAtrasAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regresar_menu_administrador();
            }
        };
        this.vista.btn_atras_ico.addActionListener(btnAtrasAction);
        this.vista.btn_atras_txt.addActionListener(btnAtrasAction);
        
    }
    
    public void regresar_menu_administrador(){
        ControladorPrincipalAdmin controlador = new ControladorPrincipalAdmin(new frmPrincipalAdmin());
        controlador.iniciar();
        vista.dispose();
    }
    
    private void actualizar_tabla(){
        this.vista.tbl_usuarios.setModel(ConsultasUsuarios.listar());
        this.vista.tbl_usuarios.getTableHeader().setReorderingAllowed(false);
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        actualizar_tabla();
    }
}