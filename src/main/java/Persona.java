
abstract class Persona {
	private String nom;
	private String apellido;
	private String tipDoc;
	private int numDoc;
	private String correo;
	private int numCel;
	private String fecNac;
	private String sex;
	private String nac;
	private String domi;
	private int codPos;
	private String dep;
	private String localidad;
	
	public Persona(String nom, String apellido, String tipDoc, int numDoc, String correo, int numCel, String fecNac,
			String sex, String nac, String domi, int codPos, String dep, String localidad) {
		this.nom = nom;
		this.apellido = apellido;
		this.tipDoc = tipDoc;
		this.numDoc = numDoc;
		this.correo = correo;
		this.numCel = numCel;
		this.fecNac = fecNac;
		this.sex = sex;
		this.nac = nac;
		this.domi = domi;
		this.codPos = codPos;
		this.dep = dep;
		this.localidad = localidad;	
	}
	public Persona() {
		this.nom = "";
		this.apellido = "";
		this.tipDoc = "";
		this.numDoc = 0;
		this.correo = "";
		this.numCel = 0;
		this.fecNac = "";
		this.sex = "";
		this.nac = "";
		this.domi = "";
		this.codPos = 0;
		this.dep = "";
		this.localidad = "";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipDoc() {
		return tipDoc;
	}

	public void setTipDoc(String tipDoc) {
		this.tipDoc = tipDoc;
	}

	public int getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(int numDoc) {
		this.numDoc = numDoc;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getNumCel() {
		return numCel;
	}

	public void setNumCel(int numCel) {
		this.numCel = numCel;
	}

	public String getFecNac() {
		return fecNac;
	}

	public void setFecNac(String fecNac) {
		this.fecNac = fecNac;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNac() {
		return nac;
	}

	public void setNac(String nac) {
		this.nac = nac;
	}

	public String getDomi() {
		return domi;
	}

	public void setDomi(String domi) {
		this.domi = domi;
	}

	public int getCodPos() {
		return codPos;
	}

	public void setCodPos(int codPos) {
		this.codPos = codPos;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
}
