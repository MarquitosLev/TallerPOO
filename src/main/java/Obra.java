
public class Obra {
	
	private int cantEjem;
	private int cantEjemDisponible;
	private String titulo;
	private String subtitulo;
	private String autor1;
	private String autor2;
	private String autor3;
	private String genero;
	private int isbn;
	private int id;
	private Area area; //Enumeracion
	private tipoObra tipo; //Enumeracion
	//private Coleccion perteneceA; //Unidireccionalidad con multiplicidad. Quitar comentario en constructores
	
	
	public Obra() {
		super();
		this.cantEjem = 0;
		this.cantEjemDisponible = 0;
		this.titulo = "";
		this.subtitulo = "";
		this.autor1 = "";
		this.autor2 = "";
		this.autor3 = "";
		this.genero = "";
		this.isbn = 0;
		this.id = 0;
//		this.area =  "";
//		this.tipo =  "";
//		this.perteneceA = Coleccion();
	}
	
	public Obra(int cantEjem, int cantEjemDisponible, String titulo, String subtitulo, String autor1, String autor2,
			String autor3, String genero, int isbn, int id, Area area, tipoObra tipo, Coleccion perteneceA) {
		super();
		this.cantEjem = cantEjem;
		this.cantEjemDisponible = cantEjemDisponible;
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.autor1 = autor1;
		this.autor2 = autor2;
		this.autor3 = autor3;
		this.genero = genero;
		this.isbn = isbn;
		this.id = id;
		this.area = area;
		this.tipo = tipo;
//		this.perteneceA = perteneceA;
	}
	
	public int getCantEjem() {
		return cantEjem;
	}
	public void setCantEjem(int cantEjem) {
		this.cantEjem = cantEjem;
	}
	public int getCantEjemDisponible() {
		return cantEjemDisponible;
	}
	public void setCantEjemDisponible(int cantEjemDisponible) {
		this.cantEjemDisponible = cantEjemDisponible;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSubtitulo() {
		return subtitulo;
	}
	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}
	public String getAutor1() {
		return autor1;
	}
	public void setAutor1(String autor1) {
		this.autor1 = autor1;
	}
	public String getAutor2() {
		return autor2;
	}
	public void setAutor2(String autor2) {
		this.autor2 = autor2;
	}
	public String getAutor3() {
		return autor3;
	}
	public void setAutor3(String autor3) {
		this.autor3 = autor3;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIsbn() {
		return isbn;
	}
	public int getId() {
		return id;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public tipoObra getTipo() {
		return tipo;
	}
	public void setTipo(tipoObra tipo) {
		this.tipo = tipo;
	}

}