package act1;
/**
 * Clase Moderador, que hereda de la clase Usuario
 * 
 * @author Lourdes
 *
 */
public class Moderador extends Usuario {

	/**
	 * Atributo Número de mensajes que ha mandado a la papelera (tipo int)
	 */
	private int papelera;
	
	/**
	 * Constructor predetermina
	 */
	public Moderador() {}
	
	/**
	 * Constructor que admite el correo electrónico y el nick
	 * @param correo Correo electrónico del moderador
	 * @param nick Nick del moderador
	 */
	public Moderador(String correo, String nick) {
		super(correo, nick);
		this.papelera=0;
	}

	//Getters y setters
	public int getPapelera() {
		return papelera;
	}

	public void setPapelera(int papelera) {
		this.papelera = papelera;
	}
	
	/**
	 * Método que incrementa en 1 el número de mensajes que ha mandado a la papelera por incumplir las normas
	 */
	public void incrementaPapelera() {
		this.papelera++;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "MODERADOR" +
				"\nNick: " + getNick() +
				"\nCorreo: " + getCorreo();
	}
}
