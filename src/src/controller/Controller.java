package controller;

import model.*;
import view.Ventana_Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    public Ventana_Principal principal;

    public CiudadDAO ciudad;
    public EmpleadoDAO empleadodao;
    public InfoEmpresaDAO infoempresa;

    public EmpresaDAO empresadao;

    public InsumoDAO insumo;

    public TablaEmpleadoDAO tablaempleadoDAO;
    public Empresa empresa;

    public Empleado empleado;

    public TablaEmpleado tablaEmpleado;

    public Controller(){
        principal = new Ventana_Principal();
        ciudad = new CiudadDAO();
        empleadodao = new EmpleadoDAO();
        infoempresa = new InfoEmpresaDAO();
        empresadao = new EmpresaDAO();
        insumo = new InsumoDAO();
        asignarOyentes();
    }

    private void asignarOyentes() {
        principal.inicio.getTablas().addActionListener(this::actionPerformed);
        principal.tablas.getAtras().addActionListener(this::actionPerformed);
        principal.tablas.getEmpresas().addActionListener(this::actionPerformed);
        principal.tablas.getInsumos().addActionListener(this::actionPerformed);
        principal.tablas.getSolicitudes().addActionListener(this::actionPerformed);
        principal.inicio.getEnviar().addActionListener(this::actionPerformed);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();
    if (command.equals("TABLAS")){
        principal.inicio.setVisible(false);
        principal.tablas.setVisible(true);
    } else if (command.equals("ATRAS")) {
        principal.inicio.setVisible(true);
        principal.tablas.setVisible(false);
    } else if (command.equals("INSUMOS")) {
        principal.tablas.getJscp1().setVisible(true);
        principal.tablas.getJscp2().setVisible(false);
        principal.tablas.getJscp3().setVisible(false);
    } else if (command.equals("SOLICITUDES")) {
        principal.tablas.getJscp1().setVisible(false);
        principal.tablas.getJscp2().setVisible(true);
        principal.tablas.getJscp3().setVisible(false);
    } else if (command.equals("EMPRESAS")) {
        principal.tablas.getJscp1().setVisible(false);
        principal.tablas.getJscp2().setVisible(false);
        principal.tablas.getJscp3().setVisible(true);
    } else if (command.equals("ENVIAR")) {
        String nombre = principal.inicio.getBarra1().getText();
        String campoempresa = (String) principal.inicio.getEleccion1().getSelectedItem();
        String solicitud = principal.inicio.getBarra2().getText();

        empresa = empresadao.consultarEmpresa(campoempresa);
        empleado = new Empleado(empleadodao.incremento(), nombre, solicitud, empresa.getId());
        System.out.println(empleadodao.registrarEmpleado(empleado));
    }else if (command.equals("INSUMOS")){
        principal.getTablas().mostrarempleado(tablaempleadoDAO.listaDeTabla());
        System.out.println(tablaempleadoDAO.listaDeTabla());
    }
    }
}
