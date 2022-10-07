package model;

import java.sql.*;
import connection.Connection_Local;

import java.util.ArrayList;

public class TablaEmpleadoDAO {

    Connection_Local conex = new Connection_Local();

    public ArrayList<TablaEmpleado> listaDeTabla() {
        ArrayList<TablaEmpleado> tablaEmpleados = new ArrayList<>();

        try {
            Statement consulta = (Statement) conex.establecerConexion();
            ResultSet res = consulta.executeQuery("SELECT EMPLEADO.NOMBRE, EMPLEADO.SOLICITUD, EMPRESA.IDENTIDAD FROM EMPLEADO INNER JOIN EMPRESA ON (EMPLEADO.ID_EMPRESA = EMPRESA.ID);");
            while (res.next()) {
                TablaEmpleado tablaEmpleado = new TablaEmpleado();
                tablaEmpleado.setEmpleado(res.getString("nombre"));
                tablaEmpleado.setSolicitud(res.getString("solicitud"));
                tablaEmpleado.setEmpresa(res.getString("identidad"));
                tablaEmpleados.add(tablaEmpleado);
            }
            res.close();
            consulta.close();
            conex.desconectar();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tablaEmpleados;
    }
}