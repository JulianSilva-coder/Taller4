package model;

import connection.Connection_Local;

import java.sql.*;
import java.util.ArrayList;

public class InfoEmpresaDAO {

    Connection_Local conex = new Connection_Local();

    public boolean registrarInfoEmpresa(InfoEmpresa infoEmpresa){
        boolean registrar = false;
        try {
            Statement stmt = conex.establecerConexion().createStatement();
            stmt.executeUpdate("INSERT INTO infoEmpresa VALUES (" + infoEmpresa.getId() + ", "
                    + infoEmpresa.getId_Empresa() + ", " + infoEmpresa.getFactura() + ")");
            registrar = true;
            stmt.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return registrar;
    }

    public ArrayList<InfoEmpresa> listaDeInfoEmpresas() {
        ArrayList<InfoEmpresa> InfoEmpresas = new ArrayList<InfoEmpresa>();

        try {
            PreparedStatement consulta = conex.establecerConexion().prepareStatement("SELECT * FROM infoEmpresa;");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                InfoEmpresa infoEmpresa = new InfoEmpresa();
                infoEmpresa.setId(res.getInt("Id"));
                infoEmpresa.setId_Empresa(res.getInt("Id_Empresa"));
                infoEmpresa.setFactura(res.getInt("factura"));
                InfoEmpresas.add(infoEmpresa);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return InfoEmpresas;
    }
}
