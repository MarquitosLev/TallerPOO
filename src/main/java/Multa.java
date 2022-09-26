public class Multa {
	private int diasMulta;
	//Asociacion Multa y Prestamo
	private Prestamo prestamo;
	
	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	public int getDiasMulta() {
		return diasMulta;
	}
	
	public void setDiasMulta(int diasMulta) {
		this.diasMulta = diasMulta;
	}
}
