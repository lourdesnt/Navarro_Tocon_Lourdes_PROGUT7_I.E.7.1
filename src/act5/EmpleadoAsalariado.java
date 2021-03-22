package act5;

public class EmpleadoAsalariado extends Empleado {

	private double salarioSemanal;
	
	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String NSS, double salarioSemanal) {
		super(primerNombre, apellidoPaterno, NSS);
		this.salarioSemanal=salarioSemanal;
	}

	public double obtenerSalarioSemanal() {
		return salarioSemanal;
	}

	public void establecerSalarioSemanal(double salarioSemanal) {
		if(salarioSemanal<0) {
			System.out.println("ERROR: el salario no puede ser un valor negativo");
			this.salarioSemanal=0;
		} else {
			this.salarioSemanal = salarioSemanal;
		}
	}
	
	public double ingresos() {
		return salarioSemanal;
	}

	@Override
	public String toString() {
		return super.toString() + ", asalariado, con salario semanal de " + salarioSemanal;
	}
	
	
	
	
}
