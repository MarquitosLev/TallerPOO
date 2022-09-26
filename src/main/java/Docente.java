
public class Docente extends Lector {
	private String carrera;
	//Creación de la asociación entre docente y funcionario. Aunque no se si se trata de doble direccionalidad en este caso. 
	private Funcionario funcionario;

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public void Consultar() {
		
	}
	
}
