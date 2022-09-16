
public class Edicion {
	private String editorial;
	private String pais;
	private int num;
	private int anio;
	private int volumen;
	private int paginas;
	private String idioma;
	private formatoObra formato; //Falta Especificacion "Otro" en formato obra
	
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public formatoObra getFormato() {
		return formato;
	}
	public void setFormato(formatoObra formato) {
		this.formato = formato;
	}
	
	
}
