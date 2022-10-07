package model;

import connection.Connection_Cloud;

import java.sql.*;
import java.util.ArrayList;

public class InfoEmpresaDAO {

    Connection_Cloud conex = new Connection_Cloud();

    public boolean registrarInfoEmpresa(InfoEmpresa infoEmpresa){
        boolean registrar = false;
        try {
            Statement stmt = conex.establecerConexion().createStatement();
            stmt.executeUpdate("INSERT INTO info_empresa VALUES (" + infoEmpresa.getId() + ", "
                    + infoEmpresa.getFactura() + ", " + infoEmpresa.getId_Empresa() + ")");
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
            PreparedStatement consulta = conex.establecerConexion().prepareStatement("SELECT * FROM info_empresa;");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                InfoEmpresa infoEmpresa = new InfoEmpresa();
                infoEmpresa.setId(res.getInt("id"));
                infoEmpresa.setId_Empresa(res.getInt("id_empresa"));
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

    public InfoEmpresa consultarInfoEmpresa(int id) {
        InfoEmpresa info_empresa = new InfoEmpresa();
        try {
            PreparedStatement consulta = conex.establecerConexion()
                    .prepareStatement("SELECT * FROM info_empresa WHERE id = ? ;");
            consulta.setInt(1, id);
            ResultSet res = consulta.executeQuery();

            if (res.next()) {
                info_empresa.setId(id);
                info_empresa.setId_Empresa(res.getInt("id_empresa"));
                info_empresa.setFactura(res.getInt("factura"));
            }
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return info_empresa;
    }
}
