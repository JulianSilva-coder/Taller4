package model;

public class Empresa {

    private int id;
    private String nombre;
    private int id_Empleado;

    public Empresa(int id, String nombre, int id_Empleado){
        this.id = id;
        this.nombre = nombre;
        this.id_Empleado = id_Empleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(int id_Empleado) {
        this.id_Empleado = id_Empleado;
    }
}
