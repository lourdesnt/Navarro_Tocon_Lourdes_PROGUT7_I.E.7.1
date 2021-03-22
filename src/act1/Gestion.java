package act1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Clase Gestion, donde probaremos las tres clases implementadas y sus respectivos m�todos 
 *
 * @author Lourdes
 *
 */
public class Gestion {

	static Scanner sc;
	static Map<String, Usuario> usuarios;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
		/**
		 * Colecci�n de usuarios
		 */
		usuarios = new HashMap<>();
		
		String opcion;
		
		do {
			menu();
			opcion = sc.nextLine();

			System.out.println("");
			
			switch (opcion) {
				case "0": break;
				case "1": registrarse();
						break;
				case "2": iniciarSesion();
						break;
				default: System.out.println("Opci�n no v�lida. Introduzca una opci�n v�lida, por favor.");
			}

		} while(!opcion.equals("0"));
		
		sc.close();
		
	}
	
	/**
	 * M�todo para mostrar un men� con opciones
	 */
	public static void menu() {
		System.out.println("=============ADSLZone=============");
		System.out.println("==================================");
		System.out.println("1. Registrarse");
		System.out.println("2. Iniciar sesi�n");
		System.out.println("0. SALIR DE LA APLICACI�N\n");
		System.out.print("Introduzca una opcion: ");
	}
	
	/**
	 * M�todo para registrar un nuevo usuario, moderador o administrador
	 */
	public static void registrarse() {
		System.out.println("Elija el tipo de usuario:");
		System.out.println("1. Usuario normal");
		System.out.println("2. Moderador");
		System.out.println("3. Administrador");
		
		String opcion;
		
		boolean error;
		
		do {
			error=false;
			opcion = sc.nextLine();
			switch(opcion){
				case "1":
					System.out.println("Introduzca un correo electr�nico:");
					String correoU = sc.nextLine();
					System.out.println("Introduzca un nick:");
					String nickU = sc.nextLine();
					Usuario u = new Usuario(correoU, nickU);
					usuarios.put(nickU, u);
					System.out.println("Usuario registrado con �xito");
					break;
				case "2":
					System.out.println("Introduzca un correo electr�nico:");
					String correoM = sc.nextLine();
					System.out.println("Introduzca un nick:");
					String nickM = sc.nextLine();
					Usuario m = new Moderador(correoM, nickM);
					usuarios.put(nickM, m);
					System.out.println("Moderador registrado con �xito");
					break;
				case "3":
					System.out.println("Introduzca un correo electr�nico:");
					String correoA = sc.nextLine();
					System.out.println("Introduzca un nick:");
					String nickA = sc.nextLine();
					Usuario a = new Administrador(correoA, nickA);
					usuarios.put(nickA, a);
					System.out.println("Administrador registrado con �xito");
					break;
				default: System.out.println("ERROR: Por favor, introduzca una opci�n v�lida."); error=true;
			}
		} while(error);
		
		System.out.println("");
	}
	
	/**
	 * M�todo que pide el nick del usuario y muestra distintas opciones a las que tiene acceso
	 */
	public static void iniciarSesion() {
		System.out.println("Introduzca su nick:");
		String nick = sc.nextLine();
		
		System.out.println("");
		
		String opcion1, opcion2, opcion3;
		
		if(usuarios.get(nick)==null) {
			System.out.println("No existe el usuario");
		} else {
			Usuario u = usuarios.get(nick);
		
			if(u instanceof Usuario){
			
				do {
					System.out.println("�rea de usuarios de ADSLZone");
					System.out.println("============================");
					System.out.println("1. Escribir mensaje");
					System.out.println("2. Eliminar mensaje");
					System.out.println("3. Cambiar correo el�ctronico");
					System.out.println("0. Cerrar sesi�n\n");
					System.out.print("Introduzca una opcion: ");
					opcion1 = sc.nextLine();

					switch (opcion1) {
						case "0": System.out.println("�Hasta pronto!"); break;
						case "1": u.incrementa(); System.out.println("Mensaje enviado"); break;
						case "2": u.decrementa(); break;
						case "3": System.out.println("Introduzca el nuevo correo:"); String correoNuevo=sc.nextLine(); u.modificarCorreo(correoNuevo); System.out.println("Correo modificado con �xito"); break;
						default: System.out.println("Opci�n no v�lida. Introduzca una opci�n v�lida, por favor.");
					}
					
					System.out.println("");

				} while(!opcion1.equals("0"));
			
			} else if(u instanceof Moderador) {
			
				do {
					System.out.println("�rea de moderadores de ADSLZone");
					System.out.println("===============================");
					System.out.println("1. Escribir mensaje");
					System.out.println("2. Eliminar mensaje");
					System.out.println("3. Cambiar correo el�ctronico");
					System.out.println("4. Mandar a la papelera un mensaje inapropiado");
					System.out.println("0. Cerrar sesi�n\n");
					System.out.print("Introduzca una opcion: ");
					opcion2 = sc.nextLine();

					switch (opcion2) {
						case "0": System.out.println("�Hasta pronto!"); break;
						case "1": u.incrementa(); System.out.println("Mensaje enviado"); break;
						case "2": u.decrementa(); break;
						case "3": System.out.println("Introduzca el nuevo correo:"); String correoNuevo=sc.nextLine(); u.modificarCorreo(correoNuevo); System.out.println("Correo modificado con �xito"); break;
						case "4": ((Moderador) u).incrementaPapelera(); System.out.println("Mensaje eliminado"); break;
						default: System.out.println("Opci�n no v�lida. Introduzca una opci�n v�lida, por favor.");
					}
					
					System.out.println("");

				} while(!opcion2.equals("0"));
			
			} else if(u instanceof Administrador){
			
				do {
					System.out.println("�rea de administradores de ADSLZone");
					System.out.println("===================================");
					System.out.println("1. Escribir mensaje");
					System.out.println("2. Eliminar mensaje");
					System.out.println("3. Cambiar correo el�ctronico");
					System.out.println("4. Cambiar nick");
					System.out.println("5. Mandar a la papelera un mensaje inapropiado");
					System.out.println("6. Banear usuario");
					System.out.println("0. Cerrar sesi�n\n");
					System.out.print("Introduzca una opcion: ");
					opcion3 = sc.nextLine();

					switch (opcion3) {
						case "0": System.out.println("�Hasta pronto!"); break;
						case "1": u.incrementa(); System.out.println("Mensaje enviado"); break;
						case "2": u.decrementa(); break;
						case "3": System.out.println("Introduzca el nuevo correo:"); String correoNuevo=sc.nextLine(); u.modificarCorreo(correoNuevo); System.out.println("Correo modificado con �xito"); break;
						case "4": System.out.println("Introduzca el nuevo nick:"); String nickNuevo=sc.nextLine(); ((Administrador) u).cambiarNick(nickNuevo); System.out.println("Nick modificado con �xito"); break;
						case "5": ((Administrador) u).incrementaPapelera(); System.out.println("Mensaje eliminado"); break;
						case "6": System.out.print("Escriba el nick del usuario que desee banear:"); String nickBaneo = sc.nextLine(); usuarios.remove(nickBaneo); System.out.println("Usuario baneado, bye bye spammer!"); break;
						default: System.out.println("Opci�n no v�lida. Introduzca una opci�n v�lida, por favor.");
					}
					
					System.out.println("");

				} while(!opcion3.equals("0"));
			
			}
		}
	}
}
