package act1;
/**
 * Clase Administrador, que hereda de la clase Usuario
 * 
 * @author Lourdes
 *
 */
public class Administrador extends Usuario{

	/**
	 * Atributo N�mero de mensajes que ha mandado a la papelera (tipo int)
	 */
	private int papelera;
	/**
	 * Atributo N�mero de baneos que ha realizado (tipo int)
	 */
	private int baneos;
	
	/**
	 * Constructor predeterminado
	 */
	public Administrador() {}
	
	/**
	 * Constructor que admite el correo electr�nico y el nick. Inicializa el n�mero de posts mandados a la papelera y el n�mero de baneos a 0
	 * @param correo Correo electr�nico del administrador
	 * @param nick Nick del administrador
	 */
	public Administrador(String correo, String nick) {
		super(correo, nick);
		this.papelera=0;
		this.baneos=0;
	}
	
	//Getters y setters
	public int getPapelera() {
		return papelera;
	}

	public void setPapelera(int papelera) {
		this.papelera = papelera;
	}

	public int getBaneos() {
		return baneos;
	}

	public void setBaneos(int baneos) {
		this.baneos = baneos;
	}
	
	/**
	 * M�todo que incrementa en 1 el n�mero de mensajes que ha mandado a la papelera por incumplir las normas
	 */
	public void incrementaPapelera() {
		this.papelera++;
	}
	
	/**
	 * M�todo que incrementa en 1 el n�mero de baneos de usuarios por ser spammers
	 */
	public void incrementaBaneos() {
		this.baneos++;
	}
	
	/**
	 * M�todo para cambiar el nick
	 */
	public void cambiarNick(String nuevoNick) {
		super.cambiarNick(nuevoNick);
		}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "ADMINISTRADOR" +
				"\nNick: " + getNick() +
				"\nCorreo: " + getCorreo();
	}
}
