package controller;

import view.Ventana_Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    public Ventana_Principal principal;
    public Controller(){
        principal = new Ventana_Principal();
        asignarOyentes();
    }

    private void asignarOyentes() {
        principal.inicio.getTablas().addActionListener(this::actionPerformed);
        principal.tablas.getAtras().addActionListener(this::actionPerformed);
        principal.tablas.getEmpresas().addActionListener(this::actionPerformed);
        principal.tablas.getInsumos().addActionListener(this::actionPerformed);
        principal.tablas.getSolicitudes().addActionListener(this::actionPerformed);



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

    }
    }
}
