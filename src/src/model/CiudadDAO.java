package model;

import connection.Connection_Cloud;

import java.sql.*;
import java.util.ArrayList;

public class CiudadDAO {

    Connection_Cloud conex = new Connection_Cloud();

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
                ciudad.setId(res.getInt("id"));
                ciudad.setNombre(res.getString("nombre"));
                ciudad.setId_Inempresa(res.getInt("id_info"));
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

    public Ciudad consultarCiudad(String nombre) {
        Ciudad ciudad = new Ciudad();
        try {
            PreparedStatement consulta = conex.establecerConexion()
                    .prepareStatement("SELECT * FROM ciudad WHERE nombre = ? ;");
            consulta.setString(1, nombre);
            ResultSet res = consulta.executeQuery();

            if (res.next()) {
                ciudad.setId(res.getInt("id"));
                ciudad.setNombre(nombre);
                ciudad.setId_Inempresa(res.getInt("id_info"));
            }
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ciudad;
    }
}
