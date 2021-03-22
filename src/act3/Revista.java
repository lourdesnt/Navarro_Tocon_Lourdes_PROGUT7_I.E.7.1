package act3;
/**
 * Clase Revista, que hereda de la clase Publicaci�n
 * 
 * @author Lourdes
 *
 */
public class Revista extends Publicacion {
	/**
	 * Atributo N�mero de revista
	 */
	private int numero;
	
	/**
	 * Constructor que recbie el c�digo, t�tulo, a�o de publicaci�n y n�mero de revista
	 * @param codigo C�digo de la revista
	 * @param titulo T�tulo de la revista
	 * @param anio A�o de publicaci�n de la revista
	 * @param numero N�mero de revista
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
				"\nN�mero: " + numero;
	}
}
