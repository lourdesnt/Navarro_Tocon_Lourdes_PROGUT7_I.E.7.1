package act5;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

	private double salarioBase;
	
	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String NSS, int ventasBrutas, double tarifaComision, double salarioBase) {
		super(primerNombre, apellidoPaterno, NSS, ventasBrutas, tarifaComision);
		this.salarioBase=salarioBase;
	}

	public double obtenerSalarioBase() {
		return salarioBase;
	}

	public void establecerSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double ingresos() {
		return (super.ingresos() + salarioBase);
	}
}
