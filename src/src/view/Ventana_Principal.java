package view;

import javax.swing.*;

public class Ventana_Principal extends JFrame {

    public Ventana_Inicio inicio;
    public Ventana_Tablas tablas;

    public Ventana_Principal(){
        setTitle("Solicitud de Insumos");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,600);
        setLayout(null);
        iniciarLayouts();
        setVisible(true);
    }

    private void iniciarLayouts() {
        inicio = new Ventana_Inicio();
        getContentPane().add(inicio);

        tablas = new Ventana_Tablas();
        getContentPane().add(tablas);
    }

    public Ventana_Inicio getInicio() {
        return inicio;
    }

    public void setInicio(Ventana_Inicio inicio) {
        this.inicio = inicio;
    }

    public Ventana_Tablas getTablas() {
        return tablas;
    }

    public void setTablas(Ventana_Tablas tablas) {
        this.tablas = tablas;
    }
}
