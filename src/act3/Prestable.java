package act3;
/**
 * Interfaz Prestable
 * 
 * @author Lourdes
 *
 */
public interface Prestable {
	/**
	 * M�todo que permite prestar un libro
	 */
	void prestar();
	
	/**
	 * M�todo que permite devolver un libro
	 */
	void devolver();
	
	/**
	 * M�todo que indica si un libro est� prestado o no
	 * @return <ul>
	 * 				<li>true: el libro est� en pr�stamo</li>
	 * 				<li>false: el libro no est� en pr�stamo</li>
	 *			</ul>
	 */
	boolean prestado();

}
