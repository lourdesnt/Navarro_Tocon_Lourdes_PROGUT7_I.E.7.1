package act6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Clase Curso presencial, que hereda de la clase Curso
 * 
 * @author Lourdes
 *
 */
public class CursoPresencial extends Curso {
	/**
	 * Atributo Número max de alumnos que pueden matricularse (cupo) (tipo int)
	 */
	private int cupo;
	/**
	 * Atributo Hora al día de clase presencial (tipo int)
	 */
	private int horasDiarias;
	/**
	 * Atributo Número mínimo de asistencias (tipo int)
	 */
	private int numMinAsis;
	/**
	 * Atributo Plazas libres, que es igual al cupo menos el número de alumnos matriculados (tipo int)
	 */
	private int plazasLibres=cupo-alumnos.size();
	/**
	 * Colección de alumnos que se registran cada día
	 */
	private Map<Integer, List<Alumno>> asistencias;
	
	/**
	 * Constructor que admite 8 parámetros e inicializa la colección de asistencias
	 * @param titulo Título del curso presencial
	 * @param fechaInicio Fecha de inicio del curso presencial
	 * @param fechaFin Fecha de finalización del curso presencial
	 * @param dias Días de clase del curso presencial
	 * @param precio Precio del curso presencial
	 * @param cupo Cupo del curso presencial
	 * @param horasDiarias Horas al día de curso presencial
	 * @param numMinAsis Número mínimo de asistencia al curso presencial
	 */
	public CursoPresencial(String titulo, LocalDate fechaInicio, LocalDate fechaFin, int dias, double precio, int cupo, int horasDiarias, int numMinAsis) {
		super(titulo, fechaInicio, fechaFin, dias, precio);
		this.cupo=cupo;
		this.horasDiarias=horasDiarias;
		this.numMinAsis=numMinAsis;
		asistencias = new HashMap<>();
	}

	/**
	 * Método que permite matricular a un alumno en un curso. Para que el alumno se pueda matricular debe tener saldo suficiente, no estar ya matriculado y haber plazas libres en el curso
	 * @param a Alumno que queremos matricular
	 */
	public void matricularAlumno(Alumno a) {
		if(plazasLibres>0) {
			super.matricularAlumno(a);
		} else {
			System.err.println("No se cumplen los requisitos");
		}
		
	}
	
	/**
	 * Método para registrar la asistencia de los alumnos. El número de día tiene que estar dentro de los días de duración del curso y el alumno debe estar matriculado
	 * @param dia Número de día en el que queremos comprobar la asistencia
	 * @param a Alumno que queremos registrar
	 */
	public void registrarAsistencia(int dia, Alumno a) {
		if(dia <= dias && alumnos.contains(a)) {
			if(!asistencias.containsKey(dia)) {
				asistencias.put(dia, new ArrayList<>());
			}
			asistencias.get(dia).add(a);
		}
	}

	/**
	 * Método que permite expedir el título de un alumno. Para un curso presencial, se considera que un alumno ha superado con aprovechamiento el curso si ha asistido, al menos, al número de días mínimo establecido
	 * @param a Alumno del que queremos expedir su título
	 * @return Diploma o mensaje de error
	 */
	public String expedirTitulo(Alumno a) {
		if(asistencias.values().stream().filter(list -> list.contains(a)).count() >= numMinAsis && fechaFin.compareTo(LocalDate.now()) < 0 && alumnos.contains(a) && !a.cursoRealizado(this)) {
			a.getCursosMatriculados().remove(this);
			a.getCursosCompletos().add(this);
			return "D/Da "+a.getNombre()+" ha realizado con aprovechamiento el curso: "+this.getTitulo()+" en la modalidad PRESENCIAL, con una duración de "+(horasDiarias*dias)+" horas.";
		} else { 
			return "No se ha podido expedir el título";
		}
	}
	
	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Curso Presencial " + titulo + " con fecha de inicio " + fechaInicio
				+ " y fecha de finalización " + fechaFin + ". Dias de clase: " + dias + ". Horas diarias: "+horasDiarias;
	}
	
	
	
	
}
