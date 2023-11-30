package Controlador;

import Modelo.*;
import Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorSolicitud {
    private final frmSolicitudes vista;
    private final ConsultasSangre modeloU = new ConsultasSangre();
    private ConsultasSolicitud modeloC = new ConsultasSolicitud();
    private int filaTabla = 0;
    private int codSolicitud = 0;
    
    public ControladorSolicitud(frmSolicitudes vista) {
        this.vista = vista;
        
        ActionListener btnAtrasAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regresar_menu_usuario();
            }
        };
        
        this.vista.btn_atras_ico.addActionListener(btnAtrasAction);
        
        this.vista.btn_atras_txt.addActionListener(btnAtrasAction);
        
        this.vista.btn_registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(validar_campos()){
                    Solicitud solicitud_new = crear_solicitud_campos();
                    modeloC.registrarSolicitud(solicitud_new);
                    retirar_sangre(solicitud_new.getGrupoSanguineo(),solicitud_new.getRh());
                    JOptionPane.showMessageDialog(vista, "Solicitud Agregada");
                    actualizar_tabla();
                    limpiar_campos();
                }
            }
        });
        
        this.vista.btn_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validar_seleccion_tabla()){
                    Solicitud solicitud_bd = solicitud_tabla();
                    modeloC.eliminarSolicitud(solicitud_bd.getCodigo());
                    regresar_sangre(solicitud_bd.getGrupoSanguineo(),solicitud_bd.getRh());
                    actualizar_tabla();
                    JOptionPane.showMessageDialog(vista, "Solicitud Eliminada");
                    
                }
            }
        }
        );
    }
        
    public boolean validar_campos(){        
        if(vista.fld_nombre.getText().isEmpty()||vista.fld_motivo.getText().isEmpty()||vista.fld_cantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(vista, "Complete todos los campos");
            return false;
        }
        String GrupoSanguineo = vista.box_grupo_sanguineo.getSelectedItem().toString();
        String Rh = vista.box_factor_rh.getSelectedItem().toString();
        int idSangre = modeloU.idSangre(GrupoSanguineo, Rh);
        float Cantidad = Float.parseFloat(vista.fld_cantidad.getText()); 
        if (modeloU.verificaVolumen(idSangre)<Cantidad){
            JOptionPane.showMessageDialog(vista, "No se cuenta con esa cantidad de sangre");
            return false;
        }
        return true;
    }
    
    public Solicitud crear_solicitud_campos(){
        String Nombre = String.valueOf(vista.fld_nombre.getText());
        String Motivo = String.valueOf(vista.fld_motivo.getText());
        String GrupoSanguineo = vista.box_grupo_sanguineo.getSelectedItem().toString();
        String Rh = vista.box_factor_rh.getSelectedItem().toString();
        float Cantidad = Float.parseFloat(vista.fld_cantidad.getText());
        
        Solicitud solicitud = new Solicitud(Nombre,Motivo,GrupoSanguineo,Rh,Cantidad);
        return solicitud;
    }
    
    public void retirar_sangre(String GrupoSanguineo, String Rh){
        float Cantidad = Float.parseFloat(vista.fld_cantidad.getText());
        int idSangre = modeloU.idSangre(GrupoSanguineo, Rh);
        modeloU.disminuir(idSangre, Cantidad);
    }
    
    public void regresar_sangre(String GrupoSanguineo, String Rh){
        float Cantidad =Float.parseFloat(vista.tbl_solicitudes.getValueAt(filaTabla, 5).toString());
        int idSangre = modeloU.idSangre(GrupoSanguineo, Rh);
        modeloU.añadir(idSangre, Cantidad);
    }
    
    public boolean validar_seleccion_tabla(){
        filaTabla = vista.tbl_solicitudes.getSelectedRow();
        if (filaTabla < 0) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una solicitud");
            return false;
        }
        return true;
    }
        
    public Solicitud solicitud_tabla(){
        codSolicitud = Integer.parseInt(vista.tbl_solicitudes.getValueAt(filaTabla, 0).toString());
        Solicitud solicitud = modeloC.buscar(codSolicitud);
        return solicitud;
    }
    
    public void regresar_menu_usuario(){
        ControladorPrincipalUser controladoruser = new ControladorPrincipalUser(new frmPrincipalUser());
        controladoruser.iniciar();
        vista.dispose();
    }
    
    public void actualizar_tabla(){
        this.vista.tbl_solicitudes.setModel(ConsultasSolicitud.listar());
        this.vista.tbl_solicitudes.getTableHeader().setReorderingAllowed(false);
    }
    
    public void limpiar_campos(){
        this.vista.fld_nombre.setText("");
        this.vista.fld_motivo.setText("");
        this.vista.fld_cantidad.setText("");
    }
    
    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        actualizar_tabla();

    }
}

