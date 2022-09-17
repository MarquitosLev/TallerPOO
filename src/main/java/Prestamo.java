import java.util.Date;

public class Prestamo {
	private Date fechaHoraPrestada;
	private String funcionarioPrestador;
	private Date fechaHoraADevolver;
	private Date fechaDevuelta;
	private String funcionarioDevuelta;
	private Lector lector;
	private Boolean aDomicilio;
	
	public Prestamo(Date fechaHoraPrestada, String funcionarioPrestador, Date fechaHoraADevolver, Date fechaDevuelta,
			String funcionarioDevuelta, Lector lector, Boolean aDomicilio) {
		this.fechaHoraPrestada = fechaHoraPrestada;
		this.funcionarioPrestador = funcionarioPrestador;
		this.fechaHoraADevolver = fechaHoraADevolver;
		this.fechaDevuelta = fechaDevuelta;
		this.funcionarioDevuelta = funcionarioDevuelta;
		this.lector = lector;
		this.aDomicilio = aDomicilio;
	}

	public Prestamo(){
		this.fechaHoraPrestada = new Date(0, 0, 1);
		this.funcionarioPrestador = "";
		this.fechaHoraADevolver = new Date(0, 0, 1);
		this.fechaDevuelta = new Date(0, 0, 1);
		this.funcionarioDevuelta = "";

	}

	public Date getFechaHoraPrestada() {
		return fechaHoraPrestada;
	}

	public void setFechaHoraPrestada(Date fechaHoraPrestada) {
		this.fechaHoraPrestada = fechaHoraPrestada;
	}

	public String getFuncionarioPrestador() {
		return funcionarioPrestador;
	}

	public void setFuncionarioPrestador(String funcionarioPrestador) {
		this.funcionarioPrestador = funcionarioPrestador;
	}

	public Date getFechaHoraADevolver() {
		return fechaHoraADevolver;
	}

	public void setFechaHoraADevolver(Date fechaHoraADevolver) {
		this.fechaHoraADevolver = fechaHoraADevolver;
	}

	public Date getFechaDevuelta() {
		return fechaDevuelta;
	}

	public void setFechaDevuelta(Date fechaDevuelta) {
		this.fechaDevuelta = fechaDevuelta;
	}

	public String getFuncionarioDevuelta() {
		return funcionarioDevuelta;
	}

	public void setFuncionarioDevuelta(String funcionarioDevuelta) {
		this.funcionarioDevuelta = funcionarioDevuelta;
	}

	public Lector getLector() {
		return lector;
	}

	public void setLector(Lector lector) {
		this.lector = lector;
	}

	public Boolean getaDomicilio() {
		return aDomicilio;
	}

	public void setaDomicilio(Boolean aDomicilio) {
		this.aDomicilio = aDomicilio;
	}
	
	public void compararFecha() {
		
	}
}
