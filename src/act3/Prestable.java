package act3;
/**
 * Interfaz Prestable
 * 
 * @author Lourdes
 *
 */
public interface Prestable {
	/**
	 * Método que permite prestar un libro
	 */
	void prestar();
	
	/**
	 * Método que permite devolver un libro
	 */
	void devolver();
	
	/**
	 * Método que indica si un libro está prestado o no
	 * @return <ul>
	 * 				<li>true: el libro está en préstamo</li>
	 * 				<li>false: el libro no está en préstamo</li>
	 *			</ul>
	 */
	boolean prestado();

}
