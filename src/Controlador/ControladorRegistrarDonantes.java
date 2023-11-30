package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class ControladorRegistrarDonantes {
    private final frmDonantes vista;
    private ConsultasDonante modeloC = new ConsultasDonante();
    private int filaTabla=0;
    private int codDonante=0;

    public ControladorRegistrarDonantes(frmDonantes vista) {
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
        
        this.vista.btn_registrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validar_campos()){
                    Donante donante_new = crear_donante_campos();
                    modeloC.registrarDonante(donante_new);
                    JOptionPane.showMessageDialog(vista, "Donante registrado exitosamente");
                    actualizar_tabla();
                    limpiar_campos();
                }
            }
        });
        
        this.vista.btn_editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validar_seleccion_tabla()) {
                    Donante donante_bd = donante_tabla();
                    llenar_campos(donante_bd);
                    vista_editar();
                    JOptionPane.showMessageDialog(vista, "Actualice los datos del donante");
                }
            }
        });
        
        this.vista.btn_aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validar_campos()){
                    Donante donante_edit = crear_donante_campos();
                    modeloC.editaDonate(codDonante, donante_edit);
                    JOptionPane.showMessageDialog(vista, "Donante editado exitosamente");
                    actualizar_tabla();
                    limpiar_campos();
                    vista_registrar();
                }
            }
        });
        
        this.vista.btn_cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar_campos();
                vista_registrar();
            }
        });
        
        this.vista.btn_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validar_seleccion_tabla()) {
                    int codDonante = donante_tabla().getCodigo();
                    modeloC.eliminarDonante(codDonante);
                    actualizar_tabla();
                    JOptionPane.showMessageDialog(vista, "Donante Eliminado");
                }
            }
        });
        
    }
    
    public boolean validar_correo(){
        //formato correo
        String correo = vista.fld_correo.getText();
        String regex_correo = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
        //validar formato
        Pattern pattern_correo = Pattern.compile(regex_correo);
        Matcher matcher_correo = pattern_correo.matcher(correo);
        
        return matcher_correo.matches();
    }
    
    public boolean validar_correo_registrado(){
        String correo = vista.fld_correo.getText();
        String[] correos_registrados = CorreosDonantes.correos_registrados;
        for (String correoExistente : correos_registrados) {
            if (correoExistente.equals(correo)) {
                // Ese correo ya ha sido registrado anteriormente
                return false; 
            }
        }
        return true;
    }
    
    public boolean validar_fechaNacimiento(){
        //formato fecha
        String fechaNacimiento = vista.fld_fecha_nacimiento.getText();
        String regex_fechaNacimiento = "^\\d{2}-\\d{2}-\\d{4}$";
        //validar formato
        Pattern pattern_fechaNacimiento = Pattern.compile(regex_fechaNacimiento);
        Matcher matcher_fechaNacimiento = pattern_fechaNacimiento.matcher(fechaNacimiento);
        
        return matcher_fechaNacimiento.matches();
    }
    
    public boolean validar_edad(){
        String fechaNacimientoStr = vista.fld_fecha_nacimiento.getText();
        int edad;
        
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formato);
        
        if(fechaNacimiento.isAfter(fechaActual)){
            return false;
        }
        
        edad = Period.between(fechaNacimiento, fechaActual).getYears();
        
        return edad>=18;
    }
    
    public boolean validar_campos(){
        if (
            vista.fld_correo.getText().isEmpty() || 
            vista.fld_nombre.getText().isEmpty() || 
            vista.fld_fecha_nacimiento.getText().isEmpty() || 
            vista.fld_dni.getText().isEmpty() || 
            vista.fld_telefono.getText().isEmpty()
            )
        {
            JOptionPane.showMessageDialog(vista, "Complete todos los campos");
            return false;
        }
        if (!validar_correo()) {
            JOptionPane.showMessageDialog(vista, "El correo electrónico no es válido.");
            return false;
        }
        if (Integer.parseInt(vista.fld_dni.getText()) < 10000000){
            JOptionPane.showMessageDialog(vista, "El DNI debe tener 8 digitos");
            return false;
        }
        if (Integer.parseInt(vista.fld_telefono.getText()) < 100000000){
            JOptionPane.showMessageDialog(vista, "El teléfono debe tener 9 digitos");
            return false;
        }
        if (!validar_fechaNacimiento()) {
            JOptionPane.showMessageDialog(vista, "El formato de fecha debe ser dd-MM-yyyy");
            return false;  
        }
        if(!validar_correo_registrado()){
            JOptionPane.showMessageDialog(vista, "Este correo ya ha sido registrado");
            return false;
        }
        if(!validar_edad()){
            JOptionPane.showMessageDialog(vista, "No eres mayor de edad");
            return false;
        }
        return true;
    }
    
    public Donante crear_donante_campos(){
        Donante donante = new Donante(
            vista.fld_fecha_nacimiento.getText(),
            vista.fld_nombre.getText(),
            vista.fld_correo.getText(),
            vista.fld_dni.getText(),
            vista.fld_telefono.getText());
        return donante;
    }
    
    public boolean validar_seleccion_tabla(){
        filaTabla = vista.tbl_donantes.getSelectedRow();
        if (filaTabla < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un donante");
            return false;
        }
        return true;
    }
        
    public Donante donante_tabla(){
        codDonante = Integer.parseInt(vista.tbl_donantes.getValueAt(filaTabla, 0).toString());
        Donante donante = modeloC.buscar(codDonante);
        return donante;
    }
    
    public void llenar_campos(Donante donante){
        this.vista.fld_nombre.setText(donante.getNombre());
        this.vista.fld_fecha_nacimiento.setText(donante.getFechaNac());
        this.vista.fld_dni.setText(donante.getDNI());
        this.vista.fld_telefono.setText(String.valueOf(donante.getTelefono()));
        this.vista.fld_correo.setText(donante.getCorreo());
    }
    
    public void activarBoton(JButton boton){
        boton.setEnabled(true);
        boton.setVisible(true);
    }
    
    public void desactivarBoton(JButton boton){
        boton.setEnabled(false);
        boton.setVisible(false);
    }
    
    public void vista_editar(){
        desactivarBoton(vista.btn_editar);
        desactivarBoton(vista.btn_eliminar);
        desactivarBoton(vista.btn_registrar);
        activarBoton(vista.btn_aceptar);
        activarBoton(vista.btn_cancelar);
    }
    
    public void vista_registrar(){
        activarBoton(vista.btn_editar);
        activarBoton(vista.btn_eliminar);
        activarBoton(vista.btn_registrar);
        desactivarBoton(vista.btn_aceptar);
        desactivarBoton(vista.btn_cancelar);
    }
    
    public void regresar_menu_usuario(){
        ControladorPrincipalUser controladoruser = new ControladorPrincipalUser(new frmPrincipalUser());
        controladoruser.iniciar();
        vista.dispose();
    }
    
    public void actualizar_tabla(){
        this.vista.tbl_donantes.setModel(ConsultasDonante.listar());
        this.vista.tbl_donantes.getTableHeader().setReorderingAllowed(false);
        //Carga la lista de correos ya registrados.
        CorreosDonantes.correos_registrados = modeloC.obtener_correos_registrados();
    }
    
    public void limpiar_campos(){
        this.vista.fld_nombre.setText("");
        this.vista.fld_fecha_nacimiento.setText("");
        this.vista.fld_dni.setText("");
        this.vista.fld_telefono.setText("");
        this.vista.fld_correo.setText("");
    }
    
    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        desactivarBoton(vista.btn_aceptar);
        desactivarBoton(vista.btn_cancelar);
        actualizar_tabla();
    }
}
