package act5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Clase N�mina donde vamos a desarrollar las distintas funcionalidades para poder ingresar, listar, modificar y eliminar empleados y mostrar sus salarios
 * 
 * @author Lourdes
 *
 */
public class Nomina {

	static Scanner sc;
	/**
	 * Colecci�n de empleados
	 */
	static Map<String, Empleado> empleados;

	public static void main(String[] args) {
			// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		empleados = new HashMap<>();
			
		String opcion;
			
		do {
		menu();
		opcion = sc.nextLine();

			switch (opcion) {
				case "0": break;
				case "1": ingresarEmpleado();
						break;
				case "2": listarEmpleados();
						break;
				case "3": eliminarEmpleado();
						break;
				case "4": mostrarIngresos();
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
		System.out.println("1. Ingresar empleado");
		System.out.println("2. Listar empleados");
		System.out.println("3. Eliminar empleado");
		System.out.println("4. Mostrar ingresos");
		System.out.println("0. SALIR DE LA APLICACI�N\n");
		System.out.print("Introduzca una opcion: ");
	}
		
	/**
	 * M�todo que permite crear un nuevo empleado y a�adirlo a la colecci�n
	 */
	public static void ingresarEmpleado() {
		System.out.println("Tipo de empleado:");
		System.out.println("1. Empleado asalariado");
		System.out.println("2. Empleado por horas");
		System.out.println("3. Empleado por comisi�n");
		System.out.println("4. Empleado base m�s comisi�n");
		
		String opcion;
			
		boolean error;
		
			do {
				error=false;
			opcion = sc.nextLine();
			switch(opcion){
				case "1":
					System.out.print("Primer nombre: ");
					String pNomEA = sc.nextLine();
					System.out.print("Apellido paterno: ");
					String aPatEA = sc.nextLine();
					System.out.print("N�mero de Seguro Social: ");
					String NSSEA = sc.nextLine();
					System.out.print("Salario semanal: ");
					double salarioEA = Double.parseDouble(sc.nextLine());
					Empleado ea = new EmpleadoAsalariado(pNomEA, aPatEA, NSSEA, salarioEA);
					empleados.put(NSSEA, ea);
					System.out.println("Empleado asalariado ingresado con �xito");
					break;
				case "2":
					System.out.print("Primer nombre: ");
					String pNomEH = sc.nextLine();
					System.out.print("Apellido paterno: ");
					String aPatEH = sc.nextLine();
					System.out.print("N�mero de Seguro Social: ");
					String NSSEH = sc.nextLine();
					System.out.print("Sueldo por horas: ");
					double sueldoEH = Double.parseDouble(sc.nextLine());
					System.out.print("Horas trabajadas: ");
					int horas = Integer.parseInt(sc.nextLine());
					Empleado eh = new EmpleadoPorHoras(pNomEH, aPatEH, NSSEH, sueldoEH, horas);
					empleados.put(NSSEH, eh);
					System.out.println("Empleado por horas ingresado con �xito");
					break;
				case "3":
					System.out.print("Primer nombre: ");
					String pNomEC = sc.nextLine();
					System.out.print("Apellido paterno: ");
					String aPatEC = sc.nextLine();
					System.out.print("N�mero de Seguro Social: ");
					String NSSEC = sc.nextLine();
					System.out.print("Ventas brutas: ");
					int ventas = Integer.parseInt(sc.nextLine());
					System.out.print("Tarifa de comisi�n: ");
					double tarifa = Integer.parseInt(sc.nextLine());
					Empleado ec = new EmpleadoPorComision(pNomEC, aPatEC, NSSEC, ventas, tarifa);
					empleados.put(NSSEC, ec);
					System.out.println("Empleado por comisi�n ingresado con �xito");
					break;
				case "4":
					System.out.print("Primer nombre: ");
					String pNomEBC = sc.nextLine();
					System.out.print("Apellido paterno: ");
					String aPatEBC = sc.nextLine();
					System.out.print("N�mero de Seguro Social: ");
					String NSSEBC = sc.nextLine();
					System.out.print("Ventas brutas: ");
					int ventasBC = Integer.parseInt(sc.nextLine());
					System.out.print("Tarifa de comisi�n: ");
					double tarifaBC = Integer.parseInt(sc.nextLine());
					System.out.print("Salario base: ");
					double salarioBC = Double.parseDouble(sc.nextLine());
					Empleado ebc = new EmpleadoBaseMasComision(pNomEBC, aPatEBC, NSSEBC, ventasBC, tarifaBC, salarioBC);
					empleados.put(NSSEBC, ebc);
					System.out.println("Empleado base m�s comisi�n ingresado con �xito");
					break;
				default: System.out.println("ERROR: Por favor, introduzca una opci�n v�lida."); error=true;
			}
		} while(error);
			
		System.out.println("");
	}
		
	/**
	 * M�todo que permite listar los distintos empleados de la colecci�n
	 */
	public static void listarEmpleados() {
		if(empleados.isEmpty()) {
			System.out.println("No existen empleados ingresados");
		} else {
			empleados.values().stream().forEach(System.out::println);
		}

		System.out.println("");
	}
		
	/**
	 * M�todo que permite eliminar a un empleado de la colecci�n mediante su n�mero de seguro social
	 */
	public static void eliminarEmpleado() {
		System.out.print("Introduzca el N�mero de Seguro Social del empleado que desea eliminar: ");
		String NSS = sc.nextLine();
		Empleado e = empleados.get(NSS);
		
		if(empleados.isEmpty()) {
			System.out.println("No hay empleados registrados");
		} else if(e == null) {
				System.out.println("ERROR: No existen coincidencias");
		} else {
			empleados.remove(NSS, e);
			System.out.println("Empleado eliminado");
		}

		System.out.println("");
	}
		
	/**
	 * M�todo que permite mostrar los ingresos de un empleado introduciendo su n�mero de seguro social
	 */
	public static void mostrarIngresos() {
		System.out.print("Introduzca el N�mero de Seguro Social del empleado del cual desea ver sus ingresos: ");
		String NSS = sc.nextLine();
		Empleado e = empleados.get(NSS);
		
		if(empleados.isEmpty()) {
			System.out.println("No hay empleados registrados");
		} else if(e == null) {
			System.out.println("ERROR: No existen coincidencias");
		} else {
			System.out.println("Los ingresos del empleado " + e.obtenerPrimerNombre() + " " + e.obtenerApellidoPaterno() + " son de " + e.ingresos() + "�");
		}
		
	}
}
