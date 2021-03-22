package act2;
/**
 * Clase abstracta Persona que implementa la interfaz Humano
 * 
 * @author Lourdes
 *
 */
public abstract class Persona implements Humano{

	/**
	 * Atributos Nombre, apellidos y NIF de la persona (tipo String)
	 */
	protected String nombre, apellidos, nif;
	/**
	 * Atributo Dirección de la persona (tipo Dirección)
	 */
	protected Direccion direccion;
	
	/**
	 * Constructor predeterminado
	 */
	public Persona() {}
	
	/**
	 * Constructor que admite los 6 parámetros
	 * @param nombre Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param nif NIF de la persona
	 * @param direccion Dirección de la persona
	 */
	public Persona(String nombre, String apellidos, String nif, Direccion direccion) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nif=nif;
		this.direccion=direccion;
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
