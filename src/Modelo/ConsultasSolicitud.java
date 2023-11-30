
package Modelo;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class ConsultasSolicitud extends ConexionBaseDatos{
    
    public static DefaultTableModel listar(){
        DefaultTableModel modelo = new DefaultTableModel(){
        @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Motivo");
        modelo.addColumn("Grupo");
        modelo.addColumn("Rh");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Fecha");
        
        Connection con=conectar();
        PreparedStatement ps=null;
        String sql="SELECT * FROM solicitudes";
        ResultSet rs;
        
        try {
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            
        } catch (SQLException e) {
            System.out.println("Error de listado: "+e.getMessage());
        }finally{
            ps=null;
            rs=null;
            
        }
        return modelo;
    }
    
    public boolean registrarSolicitud(Solicitud solicitud){
        PreparedStatement ps=null;
        Connection con=conectar();
        String sql = ("INSERT INTO solicitudes(nombre_soli,motivo_soli,grupo_soli,rh_soli,cant_soli,fecha_soli) VALUES (?,?,?,?,?,?)");
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,solicitud.getNombre());
            ps.setString(2,solicitud.getMotivo());
            ps.setString(3,solicitud.getGrupoSanguineo());
            ps.setString(4,solicitud.getRh()); 
            ps.setFloat(5,solicitud.getCantidad());
            ps.setString(6,solicitud.getFecha()); 
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
    
    public boolean eliminarSolicitud(int codSolicitud){
        PreparedStatement ps=null;
        Connection con=conectar();
        String sql = ("DELETE FROM solicitudes WHERE cod_soli=? ");
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,codSolicitud);
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
    
    //Método para buscar solicitud
    public Solicitud buscar(int id){
        Connection con=conectar();
        PreparedStatement ps=null;
        ResultSet rs=null;
        Solicitud soli = new Solicitud();
        String sql = "select * from solicitudes where cod_soli=? ";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while(rs.next()){
                soli.setCodigo(rs.getInt(1));
                soli.setNombre(rs.getString(2));
                soli.setMotivo(rs.getString(3));
                soli.setGrupoSanguineo(rs.getString(4));
                soli.setRh(rs.getString(5));
                soli.setCantidad(rs.getFloat(6));
                soli.setFecha(rs.getString(7));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return soli;
    }
    
}
