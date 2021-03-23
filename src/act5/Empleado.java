package act5;
/**
 * Clase abstracta Empleado
 * 
 * @author Lourdes
 *
 */
public abstract class Empleado {

	/**
	 * Atributo Primer nombre del empleado (tipo String)
	 */
	private String primerNombre;
	/**
	 * Atributo Apellido paterno del empleado (tipo String)
	 */
	private String apellidoPaterno;
	/**
	 * Atributo Número de Seguro Social del empleado (tipo String)
	 */
	private String NSS;
	
	/**
	 * Constructor que recibe los 3 parámetros
	 * @param primerNombre Primer nombre del empleado
	 * @param apellidoPaterno Apellido paterno del empleado
	 * @param NSS Número de Seguro Social del empleado
	 */
	public Empleado(String primerNombre, String apellidoPaterno, String NSS) {
		this.primerNombre=primerNombre;
		this.apellidoPaterno=apellidoPaterno;
		this.NSS=NSS;
	}

	//Métodos obtener y establecer
	public String obtenerPrimerNombre() {
		return primerNombre;
	}

	public void establecerPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String obtenerApellidoPaterno() {
		return apellidoPaterno;
	}

	public void establecerApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String obtenerNSS() {
		return NSS;
	}

	public void establecerNSS(String nSS) {
		NSS = nSS;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Empleado " + primerNombre + " " + apellidoPaterno + " con Número de Seguro Social " + NSS;
	}
	
	/**
	 * Método abstracto que calcula los ingresos del empleado
	 * @return ingresos
	 */
	public abstract double ingresos();
	
}
