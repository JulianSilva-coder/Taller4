package model;

public class Empleado {
    
    private int id;
    private String nombre;
    private String solicitud;

    public Empleado(int id, String nombre, String solicitud){
        this.id = id;
        this.nombre = nombre;
        this.solicitud = solicitud;
    }

    public Empleado() {

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

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }
}
