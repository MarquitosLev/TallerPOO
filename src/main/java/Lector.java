
public class Lector extends Persona{
	private int canMulta;
	private Boolean estaMultado;
	public Lector(String nom, String apellido, String tipDoc, int numDoc, String correo, int numCel, String fecNac,
			String sex, String nac, String domi, int codPos, String dep, String localidad, int canMulta,
			Boolean estaMultado) {
		super(nom, apellido, tipDoc, numDoc, correo, numCel, fecNac, sex, nac, domi, codPos, dep, localidad);
		this.canMulta = canMulta;
		this.estaMultado = estaMultado;
	}
	
	public Lector() {
		this.canMulta = 0;
		this.estaMultado = false;
	}

	public int getCanMulta() {
		return canMulta;
	}

	public void setCanMulta(int canMulta) {
		this.canMulta = canMulta;
	}

	public Boolean getEstaMultado() {
		return estaMultado;
	}

	public void setEstaMultado(Boolean estaMultado) {
		this.estaMultado = estaMultado;
	}
	
	
	
}