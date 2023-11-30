package Modelo;

import static Modelo.ConexionBaseDatos.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ConsultasUsuarios extends ConexionBaseDatos {

    public static DefaultTableModel listar() {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("Id");
        modelo.addColumn("Nombre de usuario");
        modelo.addColumn("contraseña");

        Connection con = conectar();
        PreparedStatement ps = null;
        String sql = "SELECT * FROM usuario";
        ResultSet rs;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            while (rs.next()) {//llenar cada fila
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);//llenamos filas
            }

        } catch (SQLException e) {
            System.out.println("Error de listado: " + e.getMessage());
        } finally {
            ps = null;
            rs = null;
        }

        return modelo;
    }
    
    public boolean añadirUsuario(Usuario usuario){
        PreparedStatement ps=null;
        Connection con=conectar();
        String sql = ("INSERT INTO usuario(nombre_user,contra_user) VALUES (?,?)");//sentencia_guardar
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,usuario.getNombre_Usuario());
            ps.setString(2,usuario.getContrasena());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    public boolean eliminarUsuario(int codUsuario){
        PreparedStatement ps=null;
        Connection con=conectar();
        String sql = ("DELETE FROM usuario WHERE id_user=? ");
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,codUsuario);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public UsuarioArreglo cargarUsuarios(){
        Connection con=conectar();
        PreparedStatement ps=null;
        String sql="SELECT * FROM usuario";
        ResultSet rs;
        UsuarioArreglo usuarios = new UsuarioArreglo(0);
        try {
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            while (rs.next()) {
                Usuario u = new Usuario(rs.getString("nombre_user"),rs.getString("contra_user"));
                usuarios.agregar(u);
            }
            
        } catch (SQLException e) {
            System.out.println("Error de carga: "+e.getMessage());
        }finally{
            ps=null;
            rs=null;
        }
        return usuarios;
    }
    
}
