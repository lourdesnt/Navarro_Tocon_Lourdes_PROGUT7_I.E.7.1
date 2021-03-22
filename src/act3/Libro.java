package act3;
/**
 * Clase Libro, que hereda de la clase Publicaci�n e implementa la interfaz Prestable
 * 
 * @author Lourdes
 *
 */
public class Libro extends Publicacion implements Prestable {
	/**
	 * Atributo que indica si el libro est� prestado o no (tipo boolean)
	 */
	private boolean prestado;
	
	/**
	 * Constructor que admite el c�digo, t�tulo y a�o de publicaci�n del libro e inicializa el atributo prestado a false
	 * @param codigo C�digo del libro
	 * @param titulo T�tulo del libro
	 * @param anio A�o de publicaci�n del libro 
	 */
	public Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
		prestado=false;
	}

	/**
	 * M�todo que permite prestar un libro
	 */
	public void prestar() {
		prestado = true;
	}

	/**
	 * M�todo que permite devolver un libro
	 */
	public void devolver() {
		prestado = false;
	}

	/**
	 * M�todo que indica si un libro est� prestado o no
	 * @return <ul>
	 * 				<li>true: el libro est� en pr�stamo</li>
	 * 				<li>false: el libro no est� en pr�stamo</li>
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
