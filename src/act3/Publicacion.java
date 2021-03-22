package act3;
/**
 * Clase Publicacion
 * 
 * @author Lourdes
 *
 */
public class Publicacion {
	/**
	 * Atributo Código de la publicación (tipo String)
	 */
	private String codigo;
	/**
	 * Atributo Título de la publicación (tipo String)
	 */
	private String titulo;
	/**
	 * Atributo Año de publicación (tipo int)
	 */
	private int anio;
	
	/**
	 * Constructor que admite los 3 parámetros
	 * @param codigo Código de la publicación
	 * @param titulo Título de la publicación
	 * @param anio Año de publicación
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
		return "Código: " + codigo +
				"\nTítulo: " + titulo +
				"\nAño: " + anio;
	}
	
	

}
