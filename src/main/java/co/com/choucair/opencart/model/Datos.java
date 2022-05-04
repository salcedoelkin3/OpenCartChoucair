package co.com.choucair.opencart.model;

public class Datos {
    private String usuario;
    private String clave;
    private String idpedidos;
    private String idDevolucion;
    private String fromCode;
    private String fromName;
    private String fromEmail;
    private String toName;
    private String toEmail;
    private String salesOption;
    private String info;

    public String getSalesOption() {
        return salesOption;
    }

    public void setSalesOption(String salesOption) {
        this.salesOption = salesOption;
    }



    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getIdpedidos() {
        return idpedidos;
    }

    public void setIdpedidos(String idpedidos) {
        this.idpedidos = idpedidos;
    }

    public String getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(String idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public String getFromCode() {
        return fromCode;
    }

    public void setFromCode(String fromCode) {
        this.fromCode = fromCode;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    private String monto;
}
