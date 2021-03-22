package act3;
/**
 * Clase Publicacion
 * 
 * @author Lourdes
 *
 */
public class Publicacion {
	/**
	 * Atributo C�digo de la publicaci�n (tipo String)
	 */
	private String codigo;
	/**
	 * Atributo T�tulo de la publicaci�n (tipo String)
	 */
	private String titulo;
	/**
	 * Atributo A�o de publicaci�n (tipo int)
	 */
	private int anio;
	
	/**
	 * Constructor que admite los 3 par�metros
	 * @param codigo C�digo de la publicaci�n
	 * @param titulo T�tulo de la publicaci�n
	 * @param anio A�o de publicaci�n
	 */
	public Publicacion(String codigo, String titulo, int anio) {
		this.codigo=codigo;
		this.titulo=titulo;
		this.anio=anio;
	}

	//Getters y setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "C�digo: " + codigo +
				"\nT�tulo: " + titulo +
				"\nA�o: " + anio;
	}
	
	

}
