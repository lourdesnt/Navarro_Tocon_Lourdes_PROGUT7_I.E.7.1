package act6;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase Alumno
 * 
 * @author Lourdes
 *
 */
public class Alumno implements Comparable<Alumno> {

	/**
	 * Atributos Nombre y DNI del alumno (tipo String)
	 */
	private String nombre, dni;
	/**
	 * Atributo Saldo disponible del alumno (tipo double)
	 */
	private double saldo;
	/**
	 * Lista de los cursos que el alumno ha realizado
	 */
	private List<Curso> cursosCompletos;
	/**
	 * Lista de los cursos en los que el alumno está matriculado actualmente
	 */
	private List<Curso> cursosMatriculados;
	
	/**
	 * Constructor que admite 2 parámetros e inicializa el saldo a 100 por defecto y las distintas listas de cursos
	 * @param nombre Nombre del alumno
	 * @param dni DNI del alumno
	 */
	public Alumno(String nombre, String dni) {
		this.nombre=nombre;
		this.dni=dni;
		this.saldo=100;
		cursosCompletos = new ArrayList<>();
		cursosMatriculados = new ArrayList<>();
	}
	
	/**
	 * Constructor que admite 3 parámetros e inicializa las distintas listas de cursos
	 * @param nombre Nombre del alumno
	 * @param dni DNI del alumno
	 * @param saldo Saldo disponible del alumno
	 */
	public Alumno(String nombre, String dni, double saldo) {
		this.nombre=nombre;
		this.dni=dni;
		this.saldo=saldo;
		cursosCompletos = new ArrayList<>();
		cursosMatriculados = new ArrayList<>();
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	public List<Curso> getCursosCompletos() {
		return cursosCompletos;
	}

	public List<Curso> getCursosMatriculados() {
		return cursosMatriculados;
	}
	
	/**
	 * Método que incrementa el saldo disponible en una cantidad
	 * @param s Cantidad a incrementar
	 */
	public void incrementaSaldo(double s) {
		saldo+=s;
	}
	
	/**
	 * Método que decrementa el saldo disponible en una cantidad
	 * @param s Cantidad a decrementar
	 */
	public void decrementaSaldo(double s) {
		saldo-=s;
	}

	/**
	 * Método para consultar si el alumno ha realizado un curso
	 * @param curso Curso que queremos saber si el alumno ha realizado
	 * @return <ul>
	 * 				<li>true: el alumno ha realizado el curso</li>
	 * 				<li>false: el alumno no ha realizado el curso</li>
	 *			</ul>
	 */
	public boolean cursoRealizado(Curso curso) {
		return cursosCompletos.contains(curso);
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Alumno "+ nombre + " con dni " + dni + ", saldo " + saldo;
	}
	
	/**
	 * compareTo
	 */
	public int compareTo(Alumno o) {
		return this.dni.compareTo(o.dni);
	}
}
