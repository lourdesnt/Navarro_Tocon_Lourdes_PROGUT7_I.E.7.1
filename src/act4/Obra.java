package act4;
/**
 * Clase abstracta Obra
 * 
 * @author Lourdes
 *
 */
public abstract class Obra {

	/**
	 * Atributo T�tulo de la obra art�stica (tipo String)
	 */
	private String titulo;
	/**
	 * Atributo N�mero de inventario de la obra art�stica (tipo int)
	 */
	private int numInventario;
	/**
	 * Atributo Autor de la obra art�stica (tipo Artista)
	 */
	private Artista autor;
	/**
	 * Atributo A�o en el que se realiz� la obra art�stica (tipo int)
	 */
	private int anio;
	
	/**
	 * Constructor predeterminado
	 */
	public Obra() {}
	
	/**
	 * Constructor que admite 4 par�metros
	 * @param titulo T�tulo de la obra
	 * @param numInventario N�mero de inventario de la obra
	 * @param autor Autor de la obra
	 * @param anio A�o en que se realiz� la obra
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
	 * M�todo que muestra la informaci�n de la obra art�stica
	 */
	public void muestra() {
		System.out.print("Obra titulada " + titulo + " (N� inventario: " + numInventario + "), del " + autor + " creada en " + anio + ".");
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
		return "T�tulo: " + titulo +
				"\nN� de inventario: " + numInventario +
				"\nAutor: " + autor +
				"\nA�o: " + anio;
	}

	
	
	
}
