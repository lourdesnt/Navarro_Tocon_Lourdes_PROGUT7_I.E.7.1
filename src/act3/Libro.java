package act3;
/**
 * Clase Libro, que hereda de la clase Publicación e implementa la interfaz Prestable
 * 
 * @author Lourdes
 *
 */
public class Libro extends Publicacion implements Prestable {
	/**
	 * Atributo que indica si el libro está prestado o no (tipo boolean)
	 */
	private boolean prestado;
	
	/**
	 * Constructor que admite el código, título y año de publicación del libro e inicializa el atributo prestado a false
	 * @param codigo Código del libro
	 * @param titulo Título del libro
	 * @param anio Año de publicación del libro 
	 */
	public Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
		prestado=false;
	}

	/**
	 * Método que permite prestar un libro
	 */
	public void prestar() {
		prestado = true;
	}

	/**
	 * Método que permite devolver un libro
	 */
	public void devolver() {
		prestado = false;
	}

	/**
	 * Método que indica si un libro está prestado o no
	 * @return <ul>
	 * 				<li>true: el libro está en préstamo</li>
	 * 				<li>false: el libro no está en préstamo</li>
	 *			</ul>
	 */
	public boolean prestado() {
		return prestado;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "LIBRO" + 
				"\n" + super.toString() +
				"\nPrestado (true/false): " + prestado;
	}
	
	

}
