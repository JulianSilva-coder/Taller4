package model;

public class Ciudad {

    private int id;
    private String nombre;
    private int id_Inempresa;

    public Ciudad(int id, String nombre, int id_Inempresa){
        this.id = id;
        this.nombre = nombre;
        this.id_Inempresa = id_Inempresa;
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

    public int getId_Inempresa() {
        return id_Inempresa;
    }

    public void setId_Inempresa(int id_Inempresa) {
        this.id_Inempresa = id_Inempresa;
    }
}
