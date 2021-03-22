package act5;

public class EmpleadoPorComision extends Empleado {
	
	private int ventasBrutas;
	private double tarifaComision;
	
	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String NSS, int ventasBrutas, double tarifaComision) {
		super(primerNombre, apellidoPaterno, NSS);
		this.ventasBrutas=ventasBrutas;
		this.tarifaComision=tarifaComision;
	}

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
	
	public double ingresos() {
		return (ventasBrutas*tarifaComision);
	}

	@Override
	public String toString() {
		return super.toString() + ", por comisión, cuyas ventas son de " + ventasBrutas + " con tarifa de comisión de " + tarifaComision;
	}
	
	

}
