package act5;
/**
 * Clase Empleado base más comisión, que hereda de la clase Empleado por comisión
 * 
 * @author Lourdes
 *
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {

	/**
	 * Atributo Salario base del empleado base más comisión
	 */
	private double salarioBase;
	
	/**
	 * Constructor que admite 6 parámetros
	 * @param primerNombre Primer nombre del empleado base
	 * @param apellidoPaterno Apellido paterno del empleado base
	 * @param NSS Número de Seguro Social del empleado base
	 * @param ventasBrutas Ventas brutas del empleado base
	 * @param tarifaComision Tarifa de comisión
	 * @param salarioBase Salario base del empleado base
	 */
	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String NSS, int ventasBrutas, double tarifaComision, double salarioBase) {
		super(primerNombre, apellidoPaterno, NSS, ventasBrutas, tarifaComision);
		this.salarioBase=salarioBase;
	}

	//Métodos obtener y establecer
	public double obtenerSalarioBase() {
		return salarioBase;
	}

	public void establecerSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	/**
	 * Método que calcula los ingresos del empleado asalariado, que en este caso corresponde con las ventas brutas por la tarifa de comisión más el salario base
	 * @return (Ventas brutas * Tarifa de comisión) + Salario base
	 */
	public double ingresos() {
		return (super.ingresos() + salarioBase);
	}
}
