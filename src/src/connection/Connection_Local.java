package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_Local {
    Connection conexion_local = null;
    String usuario = "postgres";
    String contrasena = "141201";
    String bd = "Solicitud";
    String ip = "localhost";
    String puerto = "5432";

    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;

    public Connection establecerConexion(){
        try {
            Class.forName("org.postgresql.Driver");
            conexion_local = DriverManager.getConnection(cadena,usuario,contrasena);
            System.out.println("Se conecto Correctamente la BD Local");
        }catch (Exception e){
            System.out.println("Error de conexion de BD local provocado por: "+ e.getMessage());
        }
        return conexion_local;
    }
}
