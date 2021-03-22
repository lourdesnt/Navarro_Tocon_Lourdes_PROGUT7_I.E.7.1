package act2;
/**
 * Clase Estudiante, que hereda de la clase Persona
 * 
 * @author Lourdes
 *
 */
public class Estudiante extends Persona{

	/**
	 * Atributo ID de estudiante (tipo int)
	 */
	private int id;
	
	/**
	 * Constructor predeterminado
	 */
	public Estudiante() {}
	
	/**
	 * Constructor que admite 5 parámetros
	 * @param id ID del estudiante
	 * @param nombre Nombre del estudiante
	 * @param apellidos Apellidos del estudiante
	 * @param nif NIF del estudiante
	 * @param direccion Dirección del estudiante
	 */
	public Estudiante(int id, String nombre, String apellidos, String nif, Direccion direccion) {
		super(nombre, apellidos, nif, direccion);
		this.id=id;
	}
	
	//Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "ESTUDIANTE con id " + id + 
				"\nNombre: " + getNombre() +
				"\nApellidos: " + getApellidos() +
				"\nNIF: " + getNif() +
				"\nDireccion: " + getDireccion().toString();
	}

	/**
	 * Método que muestra que la persona es un estudiante
	 */
	public void identificate() {
		System.out.println("Es estudiante");
	}
}
