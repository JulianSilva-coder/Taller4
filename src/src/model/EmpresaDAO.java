package model;

import connection.Connection_Local;

import java.sql.*;
import java.util.ArrayList;

public class EmpresaDAO {

    Connection_Local conex = new Connection_Local();

    public boolean registrarEmpresa(Empresa empresa){
        boolean registrar = false;
        try {
            Statement stmt = conex.establecerConexion().createStatement();
            stmt.executeUpdate("INSERT INTO empresa VALUES (" + empresa.getId() + ", '"
                    + empresa.getNombre() + "', " + empresa.getId_Empleado() + ")");
            registrar = true;
            stmt.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return registrar;
    }

    public ArrayList<Empresa> listaDeEmpresas() {
        ArrayList<Empresa> empresas = new ArrayList<Empresa>();

        try {
            PreparedStatement consulta = conex.establecerConexion().prepareStatement("SELECT * FROM empresa;");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                Empresa empresa = new Empresa();
                empresa.setId(res.getInt("Id"));
                empresa.setNombre(res.getString("Nombre"));
                empresa.setId_Empleado(res.getInt("Id_Empleado"));
                empresas.add(empresa);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return empresas;
    }
}
