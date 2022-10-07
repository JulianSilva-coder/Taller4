package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_Cloud {
    Connection conexion_cloud = null;
    String usuario = "pyrhiccyimskyp";
    String contrasena = "a03f6ec3ffebebd6046e8345f9811da834c21c0378a25a15a18d71ed4f61babe";
    String bd = "d2h6f5nrdqc01o";
    String ip = "ec2-44-208-236-253.compute-1.amazonaws.com";
    String puerto = "5432";

    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;

    public Connection establecerConexion(){
        try {
            Class.forName("org.postgresql.Driver");
            conexion_cloud = DriverManager.getConnection(cadena,usuario,contrasena);
            System.out.println("Se conecto Correctamente la BD Cloud");
        }catch (Exception e){
            System.out.println("Error de conexion de BD Cloud provocado por: "+ e.getMessage());
        }
        return conexion_cloud;
    }

    public void desconectar() {
        conexion_cloud = null;
    }
}
