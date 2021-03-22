package act4;
/**
 * Clase Escultura, que hereda de la clase Obra
 * 
 * @author Lourdes
 *
 */
public class Escultura extends Obra {
	/**
	 * Atributo Material en que fue hecha la escultura (tipo String)
	 */
	private String material;
	/**
	 * Atributo Altura de la escultura (tipo double)
	 */
	private double altura;
	
	/**
	 * Constructor predeterminado
	 */
	public Escultura() {}
	
	/**
	 * Constructor que recibe 6 parámetros
	 * @param titulo Título de la escultura
	 * @param numInventario Número de inventario de la escultura
	 * @param autor Autor de la escultura
	 * @param anio Año en el que se realizó la escultura
	 * @param material Material en que fue hecha la escultura
	 * @param altura Altura de la escultura
	 */
	public Escultura(String titulo, int numInventario, Artista autor, int anio, String material, double altura) {
		super(titulo, numInventario, autor, anio);
		this.material=material;
		this.altura=altura;
	}

	//Getters y setters
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	/**
	 * Método que muestra la información de la escultura
	 */
	public void muestra() {
		super.muestra(); System.out.println(" Se trata de una escultura de " + material + ", de altura " + altura + "m");
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
		Escultura other = (Escultura) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		return true;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return super.toString() +
				"\nEscultura de " + material + " y altura " + altura + "m";
	}
	
	
}
