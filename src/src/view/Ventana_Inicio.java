package view;
import javax.swing.*;
import java.awt.*;

public class Ventana_Inicio extends JPanel {
    private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5;
    private JTextField barra1;
    private JTextArea barra2;
    private JComboBox eleccion1, eleccion2;

    private JButton enviar, tablas;
    public Ventana_Inicio(){
        setSize(700,700);
        setBackground(Color.RED);
        setLayout(null);
        iniciarcomponentes();
        setVisible(true);
    }

    private void iniciarcomponentes() {
        etiqueta1 = new JLabel("Bienvenidos al panel de peticion");
        etiqueta1.setBounds(130,20,550,50);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 25));
        add(etiqueta1);

        etiqueta2 = new JLabel("Por favor ingresa tu nombre");
        etiqueta2.setBounds(100,70,500,50);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 20));
        add(etiqueta2);

        barra1 = new JTextField();
        barra1.setBounds(100, 120, 350, 30);
        barra1.setFont(new Font("Arial", Font.BOLD, 20));
        add(barra1);

        etiqueta3 = new JLabel("Selecciona la empresa en la que te encuentras:");
        etiqueta3.setBounds(100,150,450,50);
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 20));
        add(etiqueta3);

        eleccion1 = new JComboBox();
        eleccion1.addItem("Selecciona");
        eleccion1.addItem("WORLDTECNO");
        eleccion1.addItem("EXITO");
        eleccion1.addItem("HOMECENTER");
        eleccion1.addItem("SALCHIPAPA");
        eleccion1.setBounds(100, 200, 350, 30);
        eleccion1.setFont(new Font("Arial", Font.BOLD, 20));
        add(eleccion1);


        etiqueta5 = new JLabel("Selecciona la empresa en la que te encuentras:");
        etiqueta5.setBounds(100,220,450,50);
        etiqueta5.setFont(new Font("Arial", Font.BOLD, 20));
        add(etiqueta5);

        eleccion2 = new JComboBox();
        eleccion2.addItem("Selecciona");
        eleccion2.addItem("BOGOTA");
        eleccion2.addItem("MEDELLIN");
        eleccion2.addItem("BARRANQUILLA");
        eleccion2.addItem("CUCUTA");
        eleccion2.addItem("CALI");
        eleccion2.setBounds(100, 270, 350, 30);
        eleccion2.setFont(new Font("Arial", Font.BOLD, 20));
        add(eleccion2);


        etiqueta4 = new JLabel("Escribe la peticion que deseas realizar:");
        etiqueta4.setBounds(100,300,450,50);
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 20));
        add(etiqueta4);

        barra2 = new JTextArea();
        barra2.setBounds(70, 380, 500, 150);
        barra2.setFont(new Font("Arial", Font.BOLD, 20));
        add(barra2);

        enviar = new JButton("Enviar Comentario");
        enviar.setBounds(70, 570, 250, 50);
        enviar.setFont(new Font("Arial", Font.BOLD, 15));
        enviar.setActionCommand("ENVIAR");
        enviar.setBackground(Color.WHITE);
        add(enviar);

        tablas = new JButton("Tablas");
        tablas.setBounds(350, 570, 150, 50);
        tablas.setFont(new Font("Arial", Font.BOLD, 15));
        tablas.setActionCommand("TABLAS");
        tablas.setBackground(Color.WHITE);
        add(tablas);
    }

    public JLabel getEtiqueta1() {
        return etiqueta1;
    }

    public void setEtiqueta1(JLabel etiqueta1) {
        this.etiqueta1 = etiqueta1;
    }

    public JLabel getEtiqueta2() {
        return etiqueta2;
    }

    public void setEtiqueta2(JLabel etiqueta2) {
        this.etiqueta2 = etiqueta2;
    }

    public JLabel getEtiqueta3() {
        return etiqueta3;
    }

    public void setEtiqueta3(JLabel etiqueta3) {
        this.etiqueta3 = etiqueta3;
    }

    public JLabel getEtiqueta4() {
        return etiqueta4;
    }

    public void setEtiqueta4(JLabel etiqueta4) {
        this.etiqueta4 = etiqueta4;
    }

    public JTextField getBarra1() {
        return barra1;
    }

    public void setBarra1(JTextField barra1) {
        this.barra1 = barra1;
    }

    public JTextArea getBarra2() {
        return barra2;
    }

    public void setBarra2(JTextArea barra2) {
        this.barra2 = barra2;
    }

    public JComboBox getEleccion1() {
        return eleccion1;
    }

    public void setEleccion1(JComboBox eleccion1) {
        this.eleccion1 = eleccion1;
    }

    public JButton getEnviar() {
        return enviar;
    }

    public void setEnviar(JButton enviar) {
        this.enviar = enviar;
    }

    public JButton getTablas() {
        return tablas;
    }

    public void setTablas(JButton tablas) {
        this.tablas = tablas;
    }

    public JLabel getEtiqueta5() {
        return etiqueta5;
    }

    public void setEtiqueta5(JLabel etiqueta5) {
        this.etiqueta5 = etiqueta5;
    }

    public JComboBox getEleccion2() {
        return eleccion2;
    }

    public void setEleccion2(JComboBox eleccion2) {
        this.eleccion2 = eleccion2;
    }
}
