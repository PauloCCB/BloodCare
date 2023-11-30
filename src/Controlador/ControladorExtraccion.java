package Controlador;

import Modelo.*;
import Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class ControladorExtraccion {
    private final frmExtracciones vista;
    private final ConsultasSangre modeloU = new ConsultasSangre();
    private final ConsultasDonante modeloD = new ConsultasDonante();
    private ConsultasExtraccion modeloC = new ConsultasExtraccion();
    private int filaTabla = 0;
    private int codExtraccion = 0; 

    public ControladorExtraccion(frmExtracciones vista) {
        this.vista = vista;
        
        ActionListener btnAtrasAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(vista.btn_registrar.isEnabled()){
                    regresar_menu_usuario();
                }
                else{
                    JOptionPane.showMessageDialog(vista, "Debe terminar de editar al donante");
                }
            }
        };
        
        this.vista.btn_atras_ico.addActionListener(btnAtrasAction);
        
        this.vista.btn_atras_txt.addActionListener(btnAtrasAction);
        
        this.vista.btn_registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validar_campos()) {
                    ExtraccionSangre extraccion_new = crear_extraccion_campos();
                    modeloC.registrarExtraccion(extraccion_new);
                    añadir_sangre(extraccion_new.getGrupoSanguineo(),extraccion_new.getRh());
                    JOptionPane.showMessageDialog(vista, "Extraccion Registrada");
                    actualizarTabla();
                    limpiarCampos();
                }
            }
        });
        
        this.vista.btn_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validar_seleccion_tabla()){    
                    ExtraccionSangre extraccion_bd = extraccion_tabla();
                    modeloC.eliminarExtraccion(extraccion_bd.getCodigo());
                    disminuir_sangre(extraccion_bd.getGrupoSanguineo(),extraccion_bd.getRh());
                    JOptionPane.showMessageDialog(vista, "Extraccion eliminada");
                    actualizarTabla();
                }
            }
        });
    }
    
    public boolean validar_campos(){
        if (vista.fld_cantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(vista, "Complete todos los campos");
            return false;
        }
        if(Float.parseFloat(vista.fld_cantidad.getText())<=0){
            JOptionPane.showMessageDialog(vista, "Ingrese una cantidad válida");
            return false;
        }
        if(Float.parseFloat(vista.fld_cantidad.getText())>500){
            JOptionPane.showMessageDialog(vista, "El volumen máximo aceptado es 500ml");
            return false;
        }
        return true;
    }
    
    public ExtraccionSangre crear_extraccion_campos(){
        ExtraccionSangre extraccion = new ExtraccionSangre(
            Float.parseFloat(vista.fld_cantidad.getText()),
            vista.box_grupo_sanguineo.getSelectedItem().toString(),
            vista.box_rh.getSelectedItem().toString(),
            vista.box_donante.getSelectedItem().toString());
        return extraccion;
    }
    
    public void añadir_sangre(String GrupoSanguineo, String Rh){
        float Cantidad = Float.parseFloat(vista.fld_cantidad.getText());
        int idSangre = modeloU.idSangre(GrupoSanguineo,Rh);
        modeloU.añadir(idSangre, Cantidad);
    }
    
    public void disminuir_sangre(String GrupoSanguineo, String Rh){
        float Cantidad =Float.parseFloat(vista.tbl_extracciones.getValueAt(filaTabla, 3).toString());
        int idSangre = modeloU.idSangre(GrupoSanguineo,Rh);
        modeloU.disminuir(idSangre, Cantidad);
    }
    
    public boolean validar_seleccion_tabla(){
        filaTabla = vista.tbl_extracciones.getSelectedRow();
        if (filaTabla < 0) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una solicitud");
            return false;
        }
        return true;
    }
        
    public ExtraccionSangre extraccion_tabla(){
        codExtraccion = Integer.parseInt(vista.tbl_extracciones.getValueAt(filaTabla, 0).toString());
        ExtraccionSangre extraccion = modeloC.buscar(codExtraccion);
        return extraccion;
    }
    
    public void regresar_menu_usuario(){
        ControladorPrincipalUser controladoruser = new ControladorPrincipalUser(new frmPrincipalUser());
        controladoruser.iniciar();
        vista.dispose();
    }
    
    public void actualizarTabla(){
        this.vista.tbl_extracciones.setModel(ConsultasExtraccion.listar());
        this.vista.tbl_extracciones.getTableHeader().setReorderingAllowed(false);
    }
    
    public void limpiarCampos(){
        this.vista.fld_cantidad.setText(""); 
    }
    
    public void cargar_box_donante(){
        DefaultComboBoxModel box_donantes = new DefaultComboBoxModel();
        modeloD.comboBoxDonante(box_donantes);
        this.vista.box_donante.setModel(box_donantes);
    }
    
    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        cargar_box_donante();
        actualizarTabla();
    }
}
