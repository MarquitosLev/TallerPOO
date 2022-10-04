import java.util.ArrayList;
public class Lector extends Persona{
	private int canMulta;
	private Boolean estaMultado;
	private ArrayList<Ejemplar> ejemplares;
	
	public Lector(String nom, String apellido, String tipDoc, int numDoc, String correo, int numCel, String fecNac,
			String sex, String nac, String domi, int codPos, String dep, String localidad, int canMulta,
			Boolean estaMultado, ArrayList<Ejemplar> ejemplares) {
		super(nom, apellido, tipDoc, numDoc, correo, numCel, fecNac, sex, nac, domi, codPos, dep, localidad);
		this.canMulta = canMulta;
		this.estaMultado = estaMultado;
		this.ejemplares = ejemplares;
	}
	
	public Lector() {
		this.canMulta = 0;
		this.estaMultado = false;
		this.ejemplares = new ArrayList<Ejemplar>();
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

	public ArrayList<Ejemplar> getEjemplar() {
		return ejemplares;
	}

	public void setEjemplar(ArrayList<Ejemplar> ejemplar) {
		this.ejemplares = ejemplar;
	}
	
	
	
	
	
}