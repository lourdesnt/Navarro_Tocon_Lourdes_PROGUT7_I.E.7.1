package act2;
/**
 * Clase Direcci�n
 * 
 * @author Lourdes
 *
 */
public class Direccion {
	/**
	 * Atributos Calle, ciudad y pa�s (tipo String)
	 */
	private String calle, ciudad, pais;
	/**
	 * Atributo C�digo postal (tipo int)
	 */
	private int cp;
	
	/**
	 * Constructor predeterminado
	 */
	public Direccion() {}
	
	/**
	 * Constructor que admite los 4 par�metros
	 * @param calle Calle
	 * @param ciudad Ciudad
	 * @param cp C�digo postal
	 * @param pais Pa�s
	 */
	public Direccion(String calle, String ciudad, int cp, String pais) {
		this.calle=calle;
		this.ciudad=ciudad;
		this.cp=cp;
		this.pais=pais;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "\nCalle: " + calle +
				"\nCiudad: " + ciudad +
				"\nCP: " + cp +
				"\nPais: " + pais;
	}
	
	

}
