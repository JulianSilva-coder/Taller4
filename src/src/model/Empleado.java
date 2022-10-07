package model;

public class Empleado {
    
    private int id;
    private String nombre;
    private String solicitud;

    private int id_empresa;

    public Empleado(int id, String nombre, String solicitud, int id_empresa){
        this.id = id;
        this.nombre = nombre;
        this.solicitud = solicitud;
        this.id_empresa = id_empresa;
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

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }
}
