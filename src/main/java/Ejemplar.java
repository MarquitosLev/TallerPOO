import java.time.LocalDate;

public class Ejemplar {
    private int idEjemplar;
    private String observaciones;
    private boolean disponible;
    private int cantPedidas;
    private LocalDate fechaAdquisicion;
    private FormaAdquirida formaAdquirida; 
    private LocalDate fechaDeBaja;
    private String motivoDeBaja;
    private String codUbicacion;
    private String codDeBarra;
    private Obra obra;
    
    
    public Ejemplar(int idEjemplar, String observaciones, boolean disponible, int cantPedidas, LocalDate fechaAdquisicion,
			FormaAdquirida formaAdquirida, LocalDate fechaDeBaja, String motivoDeBaja, String codUbicacion,
			String codDeBarra, Obra obra) {
		this.idEjemplar = idEjemplar;
		this.observaciones = observaciones;
		this.disponible = disponible;
		this.cantPedidas = cantPedidas;
		this.fechaAdquisicion = fechaAdquisicion;
		this.formaAdquirida = formaAdquirida;
		this.fechaDeBaja = fechaDeBaja;
		this.motivoDeBaja = motivoDeBaja;
		this.codUbicacion = codUbicacion;
		this.codDeBarra = codDeBarra;
		this.obra = obra;
	}

	public Ejemplar() {
		this.idEjemplar = 0;
		this.observaciones = "";
		this.disponible = true;
		this.cantPedidas = 0;
		this.fechaAdquisicion = LocalDate.of(0000, 0, 0);
		//this.formaAdquirida = formaAdquirida.Otro; A esta todavía no la se hacer xd. Creo que hay que modificar algo en la enum. 
		this.fechaDeBaja = LocalDate.of(0000, 0, 0);
		this.motivoDeBaja = " ";
		this.codUbicacion = " ";
		this.codDeBarra = " ";
		this.obra = new Obra();
	}

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

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public FormaAdquirida getFormaAdquirida() {
		return formaAdquirida;
	}

	public void setFormaAdquirida(FormaAdquirida formaAdquirida) {
		this.formaAdquirida = formaAdquirida;
	}

	public LocalDate getFechaDeBaja() {
        return fechaDeBaja;
    }

    public void setFechaDeBaja(LocalDate fechaDeBaja) {
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
    
    public Obra getObra() {
    	return this.obra;
    }
    
    public void setObra(Obra obra){
    	this.obra = obra;
    }
}
