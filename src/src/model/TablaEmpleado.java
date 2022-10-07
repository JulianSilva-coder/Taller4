package model;

public class TablaEmpleado {

    public String empleado, solicitud, empresa;

    public TablaEmpleado(String empleado, String solicitud, String empresa){
        this.empleado = empleado;
        this.solicitud = solicitud;
        this.empresa = empresa;
    }

    public TablaEmpleado() {

    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
