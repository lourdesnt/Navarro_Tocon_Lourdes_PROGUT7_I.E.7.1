package act5;

public class EmpleadoPorHoras extends Empleado {

	private double sueldo;
	private int horas;
	
	public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String NSS, double sueldo, int horas) {
		super(primerNombre, apellidoPaterno, NSS);
		this.sueldo=sueldo;
		this.horas=horas;
	}

	public double obtenerSueldo() {
		return sueldo;
	}

	public void establecerSueldo(double sueldo) {
		if(sueldo<0) {
			System.out.println("ERROR: el salario no puede ser un valor negativo");
			this.sueldo=0;
		} else {
			this.sueldo = sueldo;
		}
	}

	public int obtenerHoras() {
		return horas;
	}

	public void establecerHoras(int horas) {
		if(horas<=168 && horas>=0) {
			this.horas = horas;
		} else {
			System.out.println("ERROR: el número de horas trabajadas deben estar comprendidas entre 0 y 168");
			this.horas=0;
		}
		
	}
	
	public double ingresos() {
		if(horas<=40) {
			return (sueldo*horas);
		} else {
			return ((40*sueldo) + ((horas-40)*sueldo*1.5));
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", por horas, que percibe un sueldo/hora de " + sueldo + " habiendo trabajado " + horas + " horas";
	}
	
	
}
