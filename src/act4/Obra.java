package act4;
/**
 * Clase abstracta Obra
 * 
 * @author Lourdes
 *
 */
public abstract class Obra {

	/**
	 * Atributo Título de la obra artística (tipo String)
	 */
	private String titulo;
	/**
	 * Atributo Número de inventario de la obra artística (tipo int)
	 */
	private int numInventario;
	/**
	 * Atributo Autor de la obra artística (tipo Artista)
	 */
	private Artista autor;
	/**
	 * Atributo Año en el que se realizó la obra artística (tipo int)
	 */
	private int anio;
	
	/**
	 * Constructor predeterminado
	 */
	public Obra() {}
	
	/**
	 * Constructor que admite 4 parámetros
	 * @param titulo Título de la obra
	 * @param numInventario Número de inventario de la obra
	 * @param autor Autor de la obra
	 * @param anio Año en que se realizó la obra
	 */
	public Obra(String titulo, int numInventario, Artista autor, int anio) {
		this.titulo=titulo;
		this.numInventario=numInventario;
		this.autor=autor;
		this.anio=anio;
	}

	//Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumInventario() {
		return numInventario;
	}

	public void setNumInventario(int numInventario) {
		this.numInventario = numInventario;
	}

	public Artista getAutor() {
		return autor;
	}

	public void setAutor(Artista autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	/**
	 * Método que muestra la información de la obra artística
	 */
	public void muestra() {
		System.out.print("Obra titulada " + titulo + " (Nº inventario: " + numInventario + "), del " + autor + " creada en " + anio + ".");
	}
	
	/**
	 * equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obra other = (Obra) obj;
		if (anio != other.anio)
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (numInventario != other.numInventario)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Título: " + titulo +
				"\nNº de inventario: " + numInventario +
				"\nAutor: " + autor +
				"\nAño: " + anio;
	}

	
	
	
}
