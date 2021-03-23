package act6;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;
/**
 * Clase abstracta Curso
 * 
 * @author Lourdes
 *
 */
public abstract class Curso {
	/**
	 * Atributo T�tulo del curso (tipo String)
	 */
	protected String titulo;
	/**
	 * Atributos Fecha de inicio y Fecha de finalizaci�n del curso (tipo LocalDate)
	 */
	protected LocalDate fechaInicio, fechaFin;
	/**
	 * Atributos N�mero de d�as de clase y N�mero de alumnos matriculados (tipo int)
	 */
	protected int dias, numAlumnos;
	/**
	 * Atributo Precio del curso (tipo double)
	 */
	protected double precio;
	/**
	 * Colecci�n de alumnos que se han matriculado en el curso
	 */
	protected Set<Alumno> alumnos;
	
	/**
	 * Constructor que admite 5 par�metros e inicializa el n�mero de alumnos matriculados a 0 y la colecci�n de alumnos matriculados
	 * @param titulo T�tulo del curso
	 * @param fechaInicio Fecha de inicio del curso
	 * @param fechaFin Fecha de finalizaci�n del curso
	 * @param dias N�mero de d�as de clase
	 * @param precio Precio del curso
	 */
	public Curso(String titulo, LocalDate fechaInicio, LocalDate fechaFin, int dias, double precio) {
		this.titulo=titulo;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.dias=dias;
		this.precio=precio;
		alumnos= new TreeSet<>();
		this.numAlumnos=0;
	}

	//Getters
	public String getTitulo() {
		return titulo;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public int getDias() {
		return dias;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public double getPrecio() {
		return precio;
	}
	
	public Set<Alumno> getAlumnos() {
		return alumnos;
	}

	/**
	 * M�todo que permite matricular a un alumno en un curso. Para que el alumno se pueda matricular debe tener saldo suficiente y no estar ya matriculado
	 * @param a Alumno que queremos matricular
	 */
	public void matricularAlumno(Alumno a) {
		if (a.getSaldo()>=precio && !alumnos.contains(a)) {
			a.decrementaSaldo(precio);
			alumnos.add(a);
			numAlumnos++;
			System.out.println("Alumno matriculado con �xito");
		} else {
			System.err.println("No se ha podido matricular al alumno");
		}
	}
	
	/**
	 * M�todo abstracto que permite expedir el t�tulo de un alumno
	 * @param a Alumno del que queremos expedir su t�tulo
	 * @return Diploma
	 */
	public abstract String expedirTitulo(Alumno a);
	
}
