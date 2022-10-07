package model;

public class InfoEmpresa {

    private int id;
    private int id_Empresa;
    private int factura;

    public InfoEmpresa(int id, int id_Empresa, int factura){
        this.id = id;
        this.id_Empresa = id_Empresa;
        this.factura = factura;
    }

    public InfoEmpresa(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Empresa() {
        return id_Empresa;
    }

    public void setId_Empresa(int id_Empresa) {
        this.id_Empresa = id_Empresa;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }
}
