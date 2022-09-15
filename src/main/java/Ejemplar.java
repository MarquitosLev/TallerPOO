import java.util.Date;

public class Ejemplar {
    private int idEjemplar;
    private String observaciones;
    private boolean disponible;
    private int cantPedidas;
    private Date fechaAdquisicion;
    // private formaAdquirida formaAdquirida; 
    private Date fechaDeBaja;
    private String motivoDeBaja;
    private String codUbicacion;
    private String codDeBarra;

    //faltan get y set de formaAdquirida ;)

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getCantPedidas() {
        return cantPedidas;
    }

    public void setCantPedidas(int cantPedidas) {
        this.cantPedidas = cantPedidas;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Date getFechaDeBaja() {
        return fechaDeBaja;
    }

    public void setFechaDeBaja(Date fechaDeBaja) {
        this.fechaDeBaja = fechaDeBaja;
    }

    public String getMotivoDeBaja() {
        return motivoDeBaja;
    }

    public void setMotivoDeBaja(String motivoDeBaja) {
        this.motivoDeBaja = motivoDeBaja;
    }

    public String getCodUbicacion() {
        return codUbicacion;
    }

    public void setCodUbicacion(String codUbicacion) {
        this.codUbicacion = codUbicacion;
    }

    public String getCodDeBarra() {
        return codDeBarra;
    }

    public void setCodDeBarra(String codDeBarra) {
        this.codDeBarra = codDeBarra;
    }
}
