//import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
public class Prestamo {
	private LocalDate fechaHoraPrestada;
	private String funcionarioPrestador;
	private LocalDate fechaHoraADevolver;
	private LocalDate fechaDevuelta;
	private String funcionarioDevuelta;
	private Lector lector;
	private Boolean aDomicilio;
	//Asociacion Multa y Prestamo
	private ArrayList<Multa> multas;
	private ArrayList<Funcionario> funcionarios;
	
	
	public Prestamo(LocalDate fechaHoraPrestada, String funcionarioPrestador, LocalDate fechaHoraADevolver, LocalDate fechaDevuelta,
			String funcionarioDevuelta, Lector lector, Boolean aDomicilio, ArrayList<Multa> multas, ArrayList<Funcionario> funcionarios) {
		this.fechaHoraPrestada = fechaHoraPrestada;
		this.funcionarioPrestador = funcionarioPrestador;
		this.fechaHoraADevolver = fechaHoraADevolver;
		this.fechaDevuelta = fechaDevuelta;
		this.funcionarioDevuelta = funcionarioDevuelta;
		this.lector = lector;
		this.aDomicilio = aDomicilio;
		this.multas = multas;
		this.funcionarios = funcionarios;
	}

	public Prestamo(){
		this.fechaHoraPrestada = LocalDate.of(2000, 1, 1);
		this.funcionarioPrestador = "";
		this.fechaHoraADevolver = LocalDate.of(2000, 1, 1);
		this.fechaDevuelta = LocalDate.of(2000, 1, 1);
		this.funcionarioDevuelta = "";
		this.multas = new ArrayList<Multa>();
		this.funcionarios = new ArrayList<Funcionario>();
		

	}


	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public ArrayList<Multa> getMultas() {
		return multas;
	}

	public void setMultas(ArrayList<Multa> multas) {
		this.multas = multas;
	}

	public LocalDate getFechaHoraPrestada() {
		return fechaHoraPrestada;
	}

	public void setFechaHoraPrestada(LocalDate fechaHoraPrestada) {
		this.fechaHoraPrestada = fechaHoraPrestada;
	}

	public String getFuncionarioPrestador() {
		return funcionarioPrestador;
	}

	public void setFuncionarioPrestador(String funcionarioPrestador) {
		this.funcionarioPrestador = funcionarioPrestador;
	}

	public LocalDate getFechaHoraADevolver() {
		return fechaHoraADevolver;
	}

	public void setFechaHoraADevolver(LocalDate fechaHoraADevolver) {
		this.fechaHoraADevolver = fechaHoraADevolver;
	}

	public LocalDate getFechaDevuelta() {
		return fechaDevuelta;
	}

	public void setFechaDevuelta(LocalDate fechaDevuelta) {
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
