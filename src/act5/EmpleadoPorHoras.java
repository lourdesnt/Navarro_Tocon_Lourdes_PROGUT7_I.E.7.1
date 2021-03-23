package act5;
/**
 * Clase Empleado por horas, que hereda de Empleado
 * 
 * @author Lourdes
 *
 */
public class EmpleadoPorHoras extends Empleado {

	/**
	 * Atributo Sueldo por horas del empleado por horas (tipo double)
	 */
	private double sueldo;
	/**
	 * Atributo Horas que ha trabajado el empleado por horas (tipo int)
	 */
	private int horas;
	
	/**
	 * Constructor que admite 5 parámetros
	 * @param primerNombre Primer nombre del empleado por horas
	 * @param apellidoPaterno Apellido paterno del empleado por horas
	 * @param NSS Número de Seguro Social del empleado por horas
	 * @param sueldo Sueldo por horas del empleado por horas
	 * @param horas Horas que ha trabajado el empleado por horas
	 */
	public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String NSS, double sueldo, int horas) {
		super(primerNombre, apellidoPaterno, NSS);
		this.sueldo=sueldo;
		this.horas=horas;
	}

	/**
	 * Método que devuelve el valor del sueldo por horas
	 * @return Sueldo por horas
	 */
	public double obtenerSueldo() {
		return sueldo;
	}

	/**
	 * Método para asignar un valor no negativo al sueldo por horas
	 * @param sueldo Sueldo por horas
	 */
	public void establecerSueldo(double sueldo) {
		if(sueldo<0) {
			System.out.println("ERROR: el salario no puede ser un valor negativo");
			this.sueldo=0;
		} else {
			this.sueldo = sueldo;
		}
	}

	/**
	 * Método que devuelve el valor de las horas trabajadas
	 * @return Horas trabajadas
	 */
	public int obtenerHoras() {
		return horas;
	}

	/**
	 * Método que asigna un nuevo valor, comprendido entre 0 y 168, a horas trabajadas
	 * @param horas Horas que ha trabajado el empleado por horas
	 */
	public void establecerHoras(int horas) {
		if(horas<=168 && horas>=0) {
			this.horas = horas;
		} else {
			System.out.println("ERROR: el número de horas trabajadas deben estar comprendidas entre 0 y 168");
			this.horas=0;
		}
		
	}
	
	/**
	 * Método que calcula los ingresos del empleado por horas
	 * @return <ul>
	 * 				<li>sueldo*horas si las horas son menor o igual a 40</li>
	 * 				<li>sueldo de 40h + horas de más * 1,5 si las horas son más de 40</li>
	 *			</ul>
	 */
	public double ingresos() {
		if(horas<=40) {
			return (sueldo*horas);
		} else {
			return ((40*sueldo) + ((horas-40)*sueldo*1.5));
		}
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return super.toString() + ", por horas, que percibe un sueldo/hora de " + sueldo + " habiendo trabajado " + horas + " horas";
	}
	
	
}
