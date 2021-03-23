package act6;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Clase Curso online, que hereda de la clase Curso
 * 
 * @author Lourdes
 *
 */
public class CursoOnline extends Curso {
	/**
	 * Lista de cursos que el alumno ha tenido que realizar previamente
	 */
	private List<String> cursosRequeridos;
	
	/**
	 * Constructor que admite 6 par�metros
	 * @param titulo T�tulo del curso online
	 * @param fechaInicio Fecha de inicio del curso online
	 * @param fechaFin Fecha de finalizaci�n del curso online
	 * @param dias D�as de clase del curso online
	 * @param precio Precio del curso online
	 * @param cursos T�tulo de los cursos que se deben de haber realizado previamente
	 */
	public CursoOnline(String titulo, LocalDate fechaInicio, LocalDate fechaFin, int dias, double precio, String...cursos) {
		super(titulo, fechaInicio, fechaFin, dias, precio);
		cursosRequeridos = List.of(cursos);
	}

	/**
	 * M�todo que permite matricular a un alumno en un curso. Para que el alumno se pueda matricular debe tener saldo suficiente, no estar ya matriculado y haber realizado una serie de cursos previamente
	 * @param a Alumno que queremos matricular
	 */
	public void matricularAlumno(Alumno a) {
		if(a.getCursosCompletos().stream().map(c -> c.getTitulo()).collect(Collectors.toList()).containsAll(cursosRequeridos)) {
			super.matricularAlumno(a);
		} else {
			System.err.println("No se cumplen los requisitos");
		}
	}
	
	/**
	 * M�todo que permite expedir el t�tulo de un alumno. Para un curso online, se considera que la duraci�n corresponde con el n�mero de d�as establecidos y que no existen requisitos de aprovechamiento
	 * @param a Alumno del que queremos expedir su t�tulo
	 * @return Diploma o mensaje de error
	 */
	public String expedirTitulo(Alumno a) {
		if(fechaFin.compareTo(LocalDate.now()) < 0 && alumnos.contains(a) && !a.cursoRealizado(this)) {
			a.getCursosMatriculados().remove(this);
			a.getCursosCompletos().add(this);
			return "D/Da "+a.getNombre()+" ha realizado con aprovechamiento el curso: "+this.getTitulo()+" en la modalidad ONLINE, con una duraci�n de "+dias+" d�as.";
		} else { 
			return "No se ha podido expedir el t�tulo";
		}
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Curso Online " + titulo + "con fecha de inicio " + fechaInicio + " y fecha de finalizaci�n " + fechaFin + ". Dias de clase: "+dias;
	}
	
	
}
