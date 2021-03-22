package act2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	
	static Scanner sc;
	static Map<String, Persona> universidad;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Colección de personas de una universidad: profesores y estudiantes
		 */
		universidad = new HashMap<>();
		sc = new Scanner(System.in);
		
		String opcion;
		
		do {
			menu();
			opcion = sc.nextLine();
			
			System.out.println("");

			switch (opcion) {
				case "1": nuevoEstudiante(); break;
				case "2": nuevoProfesor(); break;
				case "3": eliminarEstudiante(); break;
				case "4": eliminarProfesor(); break;
				case "5": listarEstudiantes(); break;
				case "6": listarProfesores(); break;
				case "7": identificacion(); break;
				case "0": break;
				default: System.out.println("Opción no válida. Introduzca una opción válida, por favor.");
			}

		} while(!opcion.equals("0"));
		
		sc.close();
	}
	
	/**
	 * Método para mostrar un menú con opciones
	 */
	public static void menu() {
		System.out.println("================UNIVERSIDAD================");
		System.out.println("===========================================");
		System.out.println("1. Registrar estudiante");
		System.out.println("2. Registrar profesor");
		System.out.println("3. Eliminar estudiante");
		System.out.println("4. Eliminar profesor");
		System.out.println("5. Listar estudiantes");
		System.out.println("6. Listar profesores");
		System.out.println("7. Identificación");
		System.out.println("0. SALIR DE LA APLICACIÓN\n");
		System.out.print("Introduzca una opcion: ");
	}

	/**
	 * Método para crear un nuevo estudiante e insertarlo en la colección
	 */
	public static void nuevoEstudiante() {
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Apellidos: ");
		String apellidos = sc.nextLine();
		System.out.print("NIF: ");
		String nif = sc.nextLine().toLowerCase();
		System.out.println("Dirección:");
		System.out.print("Calle: ");
		String calle = sc.nextLine();
		System.out.print("Ciudad: ");
		String ciudad = sc.nextLine();
		System.out.print("CP: ");
		int cp = Integer.parseInt(sc.nextLine());
		System.out.print("Pais: ");
		String pais = sc.nextLine();
		
		System.out.print("ID: ");
		int id = Integer.parseInt(sc.nextLine());
		
		Direccion d = new Direccion(calle, ciudad, cp, pais);
		Persona e = new Estudiante(id, nombre, apellidos, nif, d);
		
		universidad.put(nif, e);
		
		System.out.println("Estudiante registrado");
		
		System.out.println("");
	}
	
	/**
	 * Método para crear un nuevo profesor e insertarlo en la colección
	 */
	public static void nuevoProfesor() {
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Apellidos: ");
		String apellidos = sc.nextLine();
		System.out.print("NIF: ");
		String nif = sc.nextLine().toLowerCase();
		System.out.println("Dirección:");
		System.out.print("Calle: ");
		String calle = sc.nextLine();
		System.out.print("Ciudad: ");
		String ciudad = sc.nextLine();
		System.out.print("CP: ");
		int cp = Integer.parseInt(sc.nextLine());
		System.out.print("Pais: ");
		String pais = sc.nextLine();
		
		System.out.print("Despacho: ");
		int despacho = Integer.parseInt(sc.nextLine());
		
		Direccion d = new Direccion(calle, ciudad, cp, pais);
		Persona p = new Profesor(despacho, nombre, apellidos, nif, d);
		
		universidad.put(nif, p);
		
		System.out.println("Profesor registrado");
		
		System.out.println("");
		
	}
	
	/**
	 * Método para eliminar un estudiante de la colección
	 */
	public static void eliminarEstudiante() {
		System.out.print("Introduzca el NIF del estudiante que deseea eliminar del registro: ");
		String nif = sc.nextLine().toLowerCase();
		Persona u = universidad.get(nif);
		
		if(u == null) {
			System.out.println("ERROR: No existen coincidencias");
		} else {
			universidad.remove(nif, u);
			System.out.println("Estudiante eliminado");
		}
		
		
		System.out.println("");
	}
	
	/**
	 * Método para eliminar un profesor de la colección
	 */
	public static void eliminarProfesor() {
		System.out.print("Introduzca el NIF del profesor que deseea eliminar del registro: ");
		String nif = sc.nextLine().toLowerCase();
		Persona u = universidad.get(nif);
		
		if(u == null) {
			System.out.println("ERROR: No existen coincidencias");
		} else {
			universidad.remove(nif, u);
			System.out.println("Profesor eliminado");
		}
		
		System.out.println("");
	}
	
	/**
	 * Método para mostrar los datos de todos los estudiantes de la colección
	 */
	public static void listarEstudiantes() {
		
		universidad.values().stream().filter(u -> u instanceof Estudiante).forEach(System.out::println);
		
		if(universidad.values().stream().filter(u -> u instanceof Estudiante).count()==0) {
			System.out.println("No hay alumnos registrados");
		}
		
		System.out.println("");
	}
	
	/**
	 * Método para mostrar los datos de todos los profesores de la colección
	 */
	public static void listarProfesores() {
		
		universidad.values().stream().filter(u -> u instanceof Profesor).forEach(System.out::println);;
		
		if(universidad.values().stream().filter(u -> u instanceof Profesor).count()==0) {
			System.out.println("No hay profesores registrados");
		}
		
		System.out.println("");
	}
	
	/**
	 * Método que identifica a una persona de la colección introduciendo su NIF
	 */
	public static void identificacion() {
		System.out.print("Introduzca el NIF de la persona que desea identificar: ");
		String nif = sc.nextLine();
		Persona u = universidad.get(nif);
		
		if(u == null) {
			System.out.println("ERROR: No se encuentran coincidencias");
		} else {
			u.identificate();
		}
		
		System.out.println("");
	}
	
}
