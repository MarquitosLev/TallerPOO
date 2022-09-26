import java.time.LocalDate;

public class Reserva {
	private Lector lectorReserva;
	private Ejemplar ejemplarReservado;
	private LocalDate fechaReserva;
	private Funcionario funcionario;
	private Obra obra;
	
	public Lector getLectorReserva() {
		return lectorReserva;
	}
	public Ejemplar getEjemplarReservado() {
		return ejemplarReservado;
	}
	public LocalDate getFechaReserva() {
		return fechaReserva;
	} 
	
}
