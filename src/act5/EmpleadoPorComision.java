package act5;
/**
 * Clase Empleado por comisión, que hereda de la clase Empleado
 * 
 * @author Lourdes
 *
 */
public class EmpleadoPorComision extends Empleado {
	/**
	 * Atributo Ventas brutas del empleado por comisión (tipo int)
	 */
	private int ventasBrutas;
	/**
	 * Atributo Tarifa de comisión (tipo double)
	 */
	private double tarifaComision;
	
	/**
	 * Constructor que admite los 5 parámetros
	 * @param primerNombre Primer nombre del empleado por comisión
	 * @param apellidoPaterno Apellido paterno del empleado por comisión
	 * @param NSS Número de Seguro Social del empleado por comisión
	 * @param ventasBrutas Ventas brutas del empleado por comisión
	 * @param tarifaComision Tarifa de comisión
	 */
	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String NSS, int ventasBrutas, double tarifaComision) {
		super(primerNombre, apellidoPaterno, NSS);
		this.ventasBrutas=ventasBrutas;
		this.tarifaComision=tarifaComision;
	}

	//Métodos obtener y establecer
	public int obtenerVentasBrutas() {
		return ventasBrutas;
	}

	
	public void establecerVentasBrutas(int ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}

	public double obtenerTarifaComision() {
		return tarifaComision;
	}

	public void establecerTarifaComision(double tarifaComision) {
		this.tarifaComision = tarifaComision;
	}
	
	/**
	 * Método que calcula los ingresos del empleado asalariado, que en este caso corresponde con las ventas brutas por la tarifa de comisión
	 * @return Ventas brutas * Tarifa de comisión
	 */
	public double ingresos() {
		return (ventasBrutas*tarifaComision);
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return super.toString() + ", por comisión, cuyas ventas son de " + ventasBrutas + " con tarifa de comisión de " + tarifaComision;
	}
	
	

}
