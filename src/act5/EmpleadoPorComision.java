package act5;
/**
 * Clase Empleado por comisi�n, que hereda de la clase Empleado
 * 
 * @author Lourdes
 *
 */
public class EmpleadoPorComision extends Empleado {
	/**
	 * Atributo Ventas brutas del empleado por comisi�n (tipo int)
	 */
	private int ventasBrutas;
	/**
	 * Atributo Tarifa de comisi�n (tipo double)
	 */
	private double tarifaComision;
	
	/**
	 * Constructor que admite los 5 par�metros
	 * @param primerNombre Primer nombre del empleado por comisi�n
	 * @param apellidoPaterno Apellido paterno del empleado por comisi�n
	 * @param NSS N�mero de Seguro Social del empleado por comisi�n
	 * @param ventasBrutas Ventas brutas del empleado por comisi�n
	 * @param tarifaComision Tarifa de comisi�n
	 */
	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String NSS, int ventasBrutas, double tarifaComision) {
		super(primerNombre, apellidoPaterno, NSS);
		this.ventasBrutas=ventasBrutas;
		this.tarifaComision=tarifaComision;
	}

	//M�todos obtener y establecer
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
	 * M�todo que calcula los ingresos del empleado asalariado, que en este caso corresponde con las ventas brutas por la tarifa de comisi�n
	 * @return Ventas brutas * Tarifa de comisi�n
	 */
	public double ingresos() {
		return (ventasBrutas*tarifaComision);
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return super.toString() + ", por comisi�n, cuyas ventas son de " + ventasBrutas + " con tarifa de comisi�n de " + tarifaComision;
	}
	
	

}
