package Controlador;

import Modelo.*;
import Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorInventario {
    private final frmInventario vista;
    
    public ControladorInventario(frmInventario vista){
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
    
    public void actualizarTabla() {
          this.vista.tbl_inventario.setModel(ConsultasSangre.listar());
          this.vista.tbl_inventario.getTableHeader().setReorderingAllowed(false);
    }
    
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        actualizarTabla();
    }
}
