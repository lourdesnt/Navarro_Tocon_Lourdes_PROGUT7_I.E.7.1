package act1;
/**
 * Clase Usuario
 * 
 * @author Lourdes
 *
 */
public class Usuario {
	/**
	 * Atributo Mensajes que lleva escritos (tipo int)
	 */
	private int mensajes;
	/**
	 * Atributo Correo electrónico (tipo String)
	 */
	private String correo;
	/**
	 * Atributo Nick (tipo String)
	 */
	private String nick;
	
	/**
	 * Constructor predeterminado
	 */
	public Usuario() {}
	
	/**
	 * Constructor que admite el correo electrónico y el nick
	 * @param correo Correo eléctronico del usuario
	 * @param nick Nick del usuario
	 */
	public Usuario(String correo, String nick) {
		this.mensajes=0;
		this.correo=correo;
		this.nick=nick;
	}
	
	//Getters y setters
	public int getMensajes() {
		return mensajes;
	}

	public void setMensajes(int mensajes) {
		this.mensajes = mensajes;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
	/**
	 * Método que incrementa en 1 el número de mensajes
	 */
	public void incrementa() {
		this.mensajes++;
	}
	
	/**
	 * Método que decrementa en 1 el número de mensajes
	 */
	public void decrementa() {
		if(this.mensajes>0) {
		this.mensajes--;
		System.out.println("Mensaje eliminado");
		} else {
			System.out.println("No hay mensajes a eliminar");
		}
	}
	
	/**
	 * Método para modificar el correo electrónico
	 * @param correoNuevo Nuevo correo electrónico que va a reemplazar al anterior
	 */
	public void modificarCorreo(String correoNuevo) {
		this.correo=correoNuevo;
	}
	
	/**
	 * Método para modificar el nick
	 * @param nickNuevo Nuevo nick que va a reemplazar al anterior
	 */
	protected void cambiarNick(String nickNuevo) {
		this.nick=nickNuevo;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "USUARIO" +
				"\nNick: " + nick +
				"\nCorreo: " + correo;
	}

}
