package model;

import connection.Connection_Local;

import java.sql.*;
import java.util.ArrayList;

public class EmpleadoDAO {

    Connection_Local conex = new Connection_Local();

    public boolean registrarEmpleado(Empleado empleado){
        boolean registrar = false;
        try {
            Statement stmt = conex.establecerConexion().createStatement();
            stmt.executeUpdate("INSERT INTO empleado VALUES (" + empleado.getId() + ", '"
                    + empleado.getNombre() + "', '" + empleado.getSolicitud() + "')");
            registrar = true;
            stmt.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return registrar;
    }

    public ArrayList<Empleado> listaDeEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        try {
            PreparedStatement consulta = conex.establecerConexion().prepareStatement("SELECT * FROM empleado;");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                Empleado empleado = new Empleado();
                empleado.setId(res.getInt("Id"));
                empleado.setNombre(res.getString("Nombre"));
                empleado.setSolicitud(res.getString("Solicitud"));
                empleados.add(empleado);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return empleados;
    }
}
