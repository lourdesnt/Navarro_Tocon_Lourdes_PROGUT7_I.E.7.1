package act2;
/**
 * Clase Profesor, que hereda de la clase Persona
 * 
 * @author Lourdes
 *
 */
public class Profesor extends Persona{
	/**
	 * Atributo Despacho del profesor (tipo int)
	 */
	private int despacho;
	
	/**
	 * Constructor predeterminado
	 */
	public Profesor() {}
	
	/**
	 * Constructor que admite 5 parámetros 
	 * @param despacho Despacho del profesor
	 * @param nombre Nombre del profesor
	 * @param apellidos Apellidos del profesor
	 * @param nif NIF del profesor
	 * @param direccion Dirección del profesor
	 */
	public Profesor(int despacho, String nombre, String apellidos, String nif, Direccion direccion) {
		super(nombre, apellidos, nif, direccion);
		this.despacho=despacho;
	}

	//Getters y setters
	public int getDespacho() {
		return despacho;
	}

	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "PROFESOR del despacho " + despacho +
				"\nNombre: " + getNombre() +
				"\nApellidos: " + getApellidos() +
				"\nNIF: " + getNif() +
				"\nDireccion: " + getDireccion().toString();
	}

	/**
	 * Método que muestra la persona es un profesor
	 */
	public void identificate() {
		System.out.println("Es profesor");
	}
	

}
