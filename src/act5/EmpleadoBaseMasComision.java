package act5;
/**
 * Clase Empleado base m�s comisi�n, que hereda de la clase Empleado por comisi�n
 * 
 * @author Lourdes
 *
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {

	/**
	 * Atributo Salario base del empleado base m�s comisi�n
	 */
	private double salarioBase;
	
	/**
	 * Constructor que admite 6 par�metros
	 * @param primerNombre Primer nombre del empleado base
	 * @param apellidoPaterno Apellido paterno del empleado base
	 * @param NSS N�mero de Seguro Social del empleado base
	 * @param ventasBrutas Ventas brutas del empleado base
	 * @param tarifaComision Tarifa de comisi�n
	 * @param salarioBase Salario base del empleado base
	 */
	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String NSS, int ventasBrutas, double tarifaComision, double salarioBase) {
		super(primerNombre, apellidoPaterno, NSS, ventasBrutas, tarifaComision);
		this.salarioBase=salarioBase;
	}

	//M�todos obtener y establecer
	public double obtenerSalarioBase() {
		return salarioBase;
	}

	public void establecerSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	/**
	 * M�todo que calcula los ingresos del empleado asalariado, que en este caso corresponde con las ventas brutas por la tarifa de comisi�n m�s el salario base
	 * @return (Ventas brutas * Tarifa de comisi�n) + Salario base
	 */
	public double ingresos() {
		return (super.ingresos() + salarioBase);
	}
}
