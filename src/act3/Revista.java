package act3;
/**
 * Clase Revista, que hereda de la clase Publicación
 * 
 * @author Lourdes
 *
 */
public class Revista extends Publicacion {
	/**
	 * Atributo Número de revista
	 */
	private int numero;
	
	/**
	 * Constructor que recbie el código, título, año de publicación y número de revista
	 * @param codigo Código de la revista
	 * @param titulo Título de la revista
	 * @param anio Año de publicación de la revista
	 * @param numero Número de revista
	 */
	public Revista (String codigo, String titulo, int anio, int numero) {
		super(codigo, titulo, anio);
		this.numero=numero;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "REVISTA" + 
				"\n" + super.toString() +
				"\nNúmero: " + numero;
	}
}
