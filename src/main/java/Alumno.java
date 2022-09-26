
public class Alumno extends Lector {
	//Creación de la asociación entre el funcionario y el alumno. No se si se trata de doble direccionalidad en este caso. 
	private Funcionario funcionario;
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void Consultar(){
	}
}
