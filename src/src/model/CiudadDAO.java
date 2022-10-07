package model;

import connection.Connection_Local;

import java.sql.*;
import java.util.ArrayList;

public class CiudadDAO {

    Connection_Local conex = new Connection_Local();

    public boolean registrarCiudad(Ciudad ciudad){
        boolean registrar = false;
        try {
            Statement stmt = conex.establecerConexion().createStatement();
            stmt.executeUpdate("INSERT INTO ciudad VALUES (" + ciudad.getId() + ", '"
                    + ciudad.getNombre() + "', " + ciudad.getId_Inempresa() + ")");
            registrar = true;
            stmt.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return registrar;
    }

    public ArrayList<Ciudad> listaDeCiudades() {
        ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();

        try {
            PreparedStatement consulta = conex.establecerConexion().prepareStatement("SELECT * FROM ciudad;");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setId(res.getInt("Id"));
                ciudad.setNombre(res.getString("Nombre"));
                ciudad.setId_Inempresa(res.getInt("Id_Inempresa"));
                ciudades.add(ciudad);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ciudades;
    }
}
