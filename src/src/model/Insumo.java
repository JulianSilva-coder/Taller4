package model;

public class Insumo {

    private int id;
    private String nombre;
    private String descripción;
    private int id_Ciudad;

    public Insumo(int id, String nombre, String descripción, int id_Ciudad){
        this.id = id;
        this.nombre = nombre;
        this.descripción = descripción;
        this.id_Ciudad = id_Ciudad;
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

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public int getId_Ciudad() {
        return id_Ciudad;
    }

    public void setId_Ciudad(int id_Ciudad) {
        this.id_Ciudad = id_Ciudad;
    }
}
