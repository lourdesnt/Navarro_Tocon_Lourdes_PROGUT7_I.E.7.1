package act6;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class CursoOnline extends Curso {
	
	private List<String> cursosRequeridos;
	
	public CursoOnline(String titulo, LocalDate fechaInicio, LocalDate fechaFin, int dias, double precio, String...cursos) {
		super(titulo, fechaInicio, fechaFin, dias, precio);
		cursosRequeridos = List.of(cursos);
	}

	public void matricularAlumno(Alumno a) {
		if(a.getCursosCompletos().stream().map(c -> c.getTitulo()).collect(Collectors.toList()).containsAll(cursosRequeridos)) {
			super.matricularAlumno(a);
		} else {
			System.err.println("No se cumplen los requisitos");
		}
	}
	
	public String expedirTitulo(Alumno a) {
		if(fechaFin.compareTo(LocalDate.now()) < 0 && alumnos.contains(a) && !a.cursoRealizado(this)) {
			a.getCursosMatriculados().remove(this);
			a.getCursosCompletos().add(this);
			return "D/Da "+a.getNombre()+" ha realizado con aprovechamiento el curso: "+this.getTitulo()+" en la modalidad ONLINE, con una duración de "+dias+" días.";
		} else { 
			return "No se ha podido expedir el título";
		}
	}

	@Override
	public String toString() {
		return "Curso Online " + titulo + "con fecha de inicio " + fechaInicio + " y fecha de finalización " + fechaFin + ". Dias de clase: "+dias;
	}
	
	
}
