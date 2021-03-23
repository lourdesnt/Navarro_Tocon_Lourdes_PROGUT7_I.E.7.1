package act5;
/**
 * Clase Empleado Asalariado, que hereda de la clase Empleado
 * 
 * @author Lourdes
 *
 */
public class EmpleadoAsalariado extends Empleado {

	/**
	 * Atributo Salario semanal del empleado asalariado (tipo double)
	 */
	private double salarioSemanal;
	
	/**
	 * Constructor que recibe los 4 parámetros
	 * @param primerNombre Primer nombre del empleado asalariado
	 * @param apellidoPaterno Apellido paterno del empleado asalariado
	 * @param NSS Número de Seguro Social del empleado asalariado
	 * @param salarioSemanal Salario semanal del empleado asalariado
	 */
	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String NSS, double salarioSemanal) {
		super(primerNombre, apellidoPaterno, NSS);
		this.salarioSemanal=salarioSemanal;
	}

	/**
	 * Método que devuelve el valor del salario semanal
	 * @return Salario semanal
	 */
	public double obtenerSalarioSemanal() {
		return salarioSemanal;
	}

	/**
	 * Método para asignar un valor no negativo a salarioSemanal
	 * @param salarioSemanal Salario semanal
	 */
	public void establecerSalarioSemanal(double salarioSemanal) {
		if(salarioSemanal<0) {
			System.out.println("ERROR: el salario no puede ser un valor negativo");
			this.salarioSemanal=0;
		} else {
			this.salarioSemanal = salarioSemanal;
		}
	}
	
	/**
	 * Método que calcula los ingresos del empleado asalariado, que en este caso corresponde con el salario semanal
	 * @return Salario semanal
	 */
	public double ingresos() {
		return salarioSemanal;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return super.toString() + ", asalariado, con salario semanal de " + salarioSemanal;
	}
	
	
	
	
}
