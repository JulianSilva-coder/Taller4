package model;

import connection.Connection_Local;

import java.sql.*;
import java.util.ArrayList;

public class InsumoDAO {

    Connection_Local conex = new Connection_Local();

    public boolean registrarInsumo(Insumo insumo){
        boolean registrar = false;
        try {
            Statement stmt = conex.establecerConexion().createStatement();
            stmt.executeUpdate("INSERT INTO insumo VALUES (" + insumo.getId() + ", '"
                    + insumo.getNombre() + "', '" + insumo.getDescripción() +"',"+ insumo.getId_Ciudad()
                    +")");
            registrar = true;
            stmt.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return registrar;
    }

    public ArrayList<Insumo> listaDeInsumos() {
        ArrayList<Insumo> insumos = new ArrayList<Insumo>();

        try {
            PreparedStatement consulta = conex.establecerConexion().prepareStatement("SELECT * FROM insumo;");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                Insumo insumo = new Insumo();
                insumo.setId(res.getInt("Id"));
                insumo.setNombre(res.getString("Nombre"));
                insumo.setDescripción(res.getString("Descripcion"));
                insumo.setId_Ciudad(res.getInt("Id_Ciudad"));
                insumos.add(insumo);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return insumos;
    }
}
