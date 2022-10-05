package model;

public class infoEmpresa {
    private int id;
    private int id_Empresa;
    private String factura;

    public infoEmpresa(int id, int id_Empresa, String factura){
        this.id = id;
        this.id_Empresa = id_Empresa;
        this.factura = factura;
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

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }
}
