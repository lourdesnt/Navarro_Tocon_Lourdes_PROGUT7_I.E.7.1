package act4;
/**
 * Clase Pintura, que hereda de la clase Obra
 * 
 * @author Lourdes
 *
 */
public class Pintura extends Obra {
	/**
	 * Atributo Alto de la pintura (tipo double)
	 */
	private double alto;
	/**
	 * Atributo Ancho de la pintura (tipo double)
	 */
	private double ancho;
	/**
	 * Atributo Soporte donde la pintura ha sido realizada (tipo String)
	 */
	private String soporte;
	
	/**
	 * Constructor predeterminado
	 */
	public Pintura() {}
	
	/**
	 * Constructor que recibe 7 parámetros
	 * @param titulo Título de la pintura
	 * @param numInventario Número de inventario de la pintura
	 * @param autor Autor de la pintura
	 * @param anio Año en el que se realizó la pintura
	 * @param alto Alto de la pintura
	 * @param ancho Ancho de la pintura
	 * @param soporte Soporte donde se realizó la pintura
	 */
	public Pintura(String titulo, int numInventario, Artista autor, int anio, double alto, double ancho, String soporte) {
		super(titulo, numInventario, autor, anio);
		this.alto=alto;
		this.ancho=ancho;
		this.soporte=soporte;
	}

	//Getters y setters
	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public String getSoporte() {
		return soporte;
	}

	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}
	
	/**
	 * Método que muestra la información de la pintura
	 */
	public void muestra() {
		super.muestra(); System.out.println(" Se trata de una pintura de dimensiones " + alto + "x" + ancho + " sobre " + soporte);
	}
	
	/**
	 * equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pintura other = (Pintura) obj;
		if (Double.doubleToLongBits(alto) != Double.doubleToLongBits(other.alto))
			return false;
		if (Double.doubleToLongBits(ancho) != Double.doubleToLongBits(other.ancho))
			return false;
		if (soporte == null) {
			if (other.soporte != null)
				return false;
		} else if (!soporte.equals(other.soporte))
			return false;
		return true;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return super.toString() + 
				"\nPintura de dimensiones " + alto + "x" + ancho + " sobre " + soporte;
	}
	
	
	
}
