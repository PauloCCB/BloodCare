package Modelo;
import java.sql.*;


public class ConexionBaseDatos {
    /*
    public static String url = "jdbc:mysql://root:dxlJtqJwsB7XOkUCJrPO@containers-us-west-186.railway.app:7892/railway";
    public static String usuario = "root";
    public static String contraseña = "dxlJtqJwsB7XOkUCJrPO";
    */
    public static String url = "jdbc:mysql://localhost:3306/bancosangre";
    public static String usuario = "root";
    public static String contraseña = "root";
    public static String clase = "com.mysql.cj.jdbc.Driver";
    
    
    public static Connection conectar(){
        Connection conexion = null;
        try {
            Class.forName(clase);
            conexion = (Connection)DriverManager.getConnection(url,usuario,contraseña);
            //System.out.println("Conexion lograda");
        } catch (ClassNotFoundException|SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }
}
