package act2;
/**
 * Clase Dirección
 * 
 * @author Lourdes
 *
 */
public class Direccion {
	/**
	 * Atributos Calle, ciudad y país (tipo String)
	 */
	private String calle, ciudad, pais;
	/**
	 * Atributo Código postal (tipo int)
	 */
	private int cp;
	
	/**
	 * Constructor predeterminado
	 */
	public Direccion() {}
	
	/**
	 * Constructor que admite los 4 parámetros
	 * @param calle Calle
	 * @param ciudad Ciudad
	 * @param cp Código postal
	 * @param pais País
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
