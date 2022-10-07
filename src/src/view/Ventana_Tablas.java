package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Ventana_Tablas extends JPanel {
    private JTable tablaSolicitudes, tablaHeroku, tablaEmpleados;
    private JButton atras, Solicitudes, Insumos, Empresas;
    private JLabel fondo1, fondo2, fondo3;
    private DefaultTableModel modelotabla1,modelotabla2,modelotabla3;
    private JScrollPane jscp1,jscp2,jscp3;
    private int cantidad = 0;

    public Ventana_Tablas(){
        tablaSolicitudes = new JTable();
        setSize(700,700);
        setBackground(Color.GRAY);
        setLayout(null);
        iniciarcomponentes();
        crearTablaEmpleados();
        crearTablaInsumos();
        crearTablaEmpresas();
        setVisible(false);
    }
    private void crearTablaEmpleados() {
        tablaEmpleados = new JTable(new DefaultTableModel(new Object[] {"Nombre Empleado", "Solicitud", "Empresa"}, cantidad));
        modelotabla1 = (DefaultTableModel) tablaEmpleados.getModel();
        jscp1 = new JScrollPane(tablaEmpleados);
        jscp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jscp1.setPreferredSize(new Dimension(400,250));
        jscp1.setBounds(50,50,550,400);
        jscp1.setVisible(false);
        add(jscp1);

        ImageIcon imagen = new ImageIcon("src/Fondo.jpg");
        ImageIcon icon = new ImageIcon(imagen.getImage().getScaledInstance(700,700, Image.SCALE_DEFAULT));
        fondo1 = new JLabel(icon);
        fondo1.setBounds(0,0,700,700);
        add(fondo1);

    }

    private void crearTablaInsumos() {
        tablaHeroku = new JTable(new DefaultTableModel(new Object[] {"NombreInsumo", "Descripcion", "Nombre Empresa"}, cantidad));
        modelotabla2 = (DefaultTableModel) tablaHeroku.getModel();
        jscp2 = new JScrollPane(tablaHeroku);
        jscp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jscp2.setPreferredSize(new Dimension(400,250));
        jscp2.setBounds(50,50,550,400);
        jscp2.setVisible(false);
        add(jscp2);
        ImageIcon imagen = new ImageIcon("src/Fondo.jpg");
        ImageIcon icon = new ImageIcon(imagen.getImage().getScaledInstance(700,700, Image.SCALE_DEFAULT));
        fondo2 = new JLabel(icon);
        fondo2.setBounds(0,0,700,700);
        add(fondo2);
    }

    private void crearTablaEmpresas() {
        tablaSolicitudes = new JTable(new DefaultTableModel(new Object[] {"ID informacion", "Facturacion", "Empresa"}, cantidad));
        modelotabla3 = (DefaultTableModel) tablaSolicitudes.getModel();
        jscp3 = new JScrollPane(tablaSolicitudes);
        jscp3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jscp3.setPreferredSize(new Dimension(400,250));
        jscp3.setBounds(50,50,550,400);
        jscp3.setVisible(false);
        add(jscp3);
        ImageIcon imagen = new ImageIcon("src/Fondo.jpg");
        ImageIcon icon = new ImageIcon(imagen.getImage().getScaledInstance(700,700, Image.SCALE_DEFAULT));
        fondo3 = new JLabel(icon);
        fondo3.setBounds(0,0,700,700);
        add(fondo3);
    }
    private void iniciarcomponentes() {

        atras = new JButton("Atras");
        atras.setActionCommand("ATRAS");
        atras.setBackground(Color.WHITE);
        atras.setBounds(30,500,120, 50);
        atras.setFont(new Font("Arial", Font.BOLD, 15));
        add(atras);

        Solicitudes = new JButton("Solicitudes");
        Solicitudes.setActionCommand("SOLICITUDES");
        Solicitudes.setBackground(Color.WHITE);
        Solicitudes.setBounds(190,500,120, 50);
        Solicitudes.setFont(new Font("Arial", Font.BOLD, 15));
        add(Solicitudes);

        Insumos = new JButton("Empleados");
        Insumos.setActionCommand("INSUMOS");
        Insumos.setBackground(Color.WHITE);
        Insumos.setBounds(360,500,120, 50);
        Insumos.setFont(new Font("Arial", Font.BOLD, 15));
        add(Insumos);

        Empresas = new JButton("Empresas");
        Empresas.setActionCommand("EMPRESAS");
        Empresas.setBackground(Color.WHITE);
        Empresas.setBounds(520,500,120, 50);
        Empresas.setFont(new Font("Arial", Font.BOLD, 15));
        add(Empresas);
    }

    public JTable getTablaSolicitudes() {
        return tablaSolicitudes;
    }

    public void setTablaSolicitudes(JTable tablaSolicitudes) {
        this.tablaSolicitudes = tablaSolicitudes;
    }

    public JTable getTablaHeroku() {
        return tablaHeroku;
    }

    public void setTablaHeroku(JTable tablaHeroku) {
        this.tablaHeroku = tablaHeroku;
    }

    public JTable getTablaEmpleados() {
        return tablaEmpleados;
    }

    public void setTablaEmpleados(JTable tablaEmpleados) {
        this.tablaEmpleados = tablaEmpleados;
    }

    public JButton getAtras() {
        return atras;
    }

    public void setAtras(JButton atras) {
        this.atras = atras;
    }

    public JButton getSolicitudes() {
        return Solicitudes;
    }

    public void setSolicitudes(JButton solicitudes) {
        Solicitudes = solicitudes;
    }

    public JButton getInsumos() {
        return Insumos;
    }

    public void setInsumos(JButton insumos) {
        Insumos = insumos;
    }

    public JButton getEmpresas() {
        return Empresas;
    }

    public void setEmpresas(JButton empresas) {
        Empresas = empresas;
    }

    public DefaultTableModel getModelotabla1() {
        return modelotabla1;
    }

    public void setModelotabla1(DefaultTableModel modelotabla1) {
        this.modelotabla1 = modelotabla1;
    }

    public DefaultTableModel getModelotabla2() {
        return modelotabla2;
    }

    public void setModelotabla2(DefaultTableModel modelotabla2) {
        this.modelotabla2 = modelotabla2;
    }

    public DefaultTableModel getModelotabla3() {
        return modelotabla3;
    }

    public void setModelotabla3(DefaultTableModel modelotabla3) {
        this.modelotabla3 = modelotabla3;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public JScrollPane getJscp1() {
        return jscp1;
    }

    public void setJscp1(JScrollPane jscp1) {
        this.jscp1 = jscp1;
    }

    public JScrollPane getJscp2() {
        return jscp2;
    }

    public void setJscp2(JScrollPane jscp2) {
        this.jscp2 = jscp2;
    }

    public JScrollPane getJscp3() {
        return jscp3;
    }

    public void setJscp3(JScrollPane jscp3) {
        this.jscp3 = jscp3;
    }

    public JLabel getFondo1() {
        return fondo1;
    }

    public void setFondo1(JLabel fondo1) {
        this.fondo1 = fondo1;
    }

    public JLabel getFondo2() {
        return fondo2;
    }

    public void setFondo2(JLabel fondo2) {
        this.fondo2 = fondo2;
    }

    public JLabel getFondo3() {
        return fondo3;
    }

    public void setFondo3(JLabel fondo3) {
        this.fondo3 = fondo3;
    }
}
