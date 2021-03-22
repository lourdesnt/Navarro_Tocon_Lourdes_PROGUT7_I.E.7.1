package act5;

public abstract class Empleado {

	private String primerNombre;
	private String apellidoPaterno;
	private String NSS;
	
	public Empleado(String primerNombre, String apellidoPaterno, String NSS) {
		this.primerNombre=primerNombre;
		this.apellidoPaterno=apellidoPaterno;
		this.NSS=NSS;
	}

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

	@Override
	public String toString() {
		return "Empleado " + primerNombre + " " + apellidoPaterno + " con Número de Seguro Social " + NSS;
	}
	
	public abstract double ingresos();
	
}
