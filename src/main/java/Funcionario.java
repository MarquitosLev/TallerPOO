import java.util.ArrayList;

public class Funcionario {
	private String usuario;
	private String contrasenia;
	//Creación de la asociación entre el funcionario y la clase Ejemplar;
	private ArrayList<Ejemplar> ejemplares;
	//Creacion de la asociación entre el funcionario y la clase Obra;
	private ArrayList<Reserva> obras;
	
	public ArrayList<Ejemplar> getRealizaObservación() {
		return ejemplares;
	}
	public void setRealizaObservación(ArrayList<Ejemplar> ejemplares) {
		this.ejemplares = ejemplares;
	}
	public String getUsuario() {
		return this.usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public void registrarObservaciones() {
		//falta completar
	}
	
	public void realizarPrestamo() {
		//falta completar
	}
}
