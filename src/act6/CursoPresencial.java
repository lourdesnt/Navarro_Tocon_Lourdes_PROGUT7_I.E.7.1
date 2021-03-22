package act6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CursoPresencial extends Curso {

	private int cupo;
	private int horasDiarias;
	private int numMinAsis;
	private int plazasLibres;
	private Map<Integer, List<Alumno>> asistencias;
	
	public CursoPresencial(String titulo, LocalDate fechaInicio, LocalDate fechaFin, int dias, double precio, int cupo, int horasDiarias, int numMinAsis) {
		super(titulo, fechaInicio, fechaFin, dias, precio);
		this.cupo=cupo;
		this.horasDiarias=horasDiarias;
		this.numMinAsis=numMinAsis;
		asistencias = new HashMap<>();
	}

	public void matricularAlumno(Alumno a) {
		if(alumnos.size()<cupo) {
			super.matricularAlumno(a);
		} else {
			System.err.println("No se cumplen los requisitos");
		}
		
	}
	
	public void registrarAsistencia(int dia, Alumno a) {
		if(dia <= dias && alumnos.contains(a)) {
			if(!asistencias.containsKey(dia)) {
				asistencias.put(dia, new ArrayList<>());
			}
			asistencias.get(dia).add(a);
		}
	}

	public String expedirTitulo(Alumno a) {
		if(asistencias.values().stream().filter(list -> list.contains(a)).count() >= numMinAsis && fechaFin.compareTo(LocalDate.now()) < 0 && alumnos.contains(a) && !a.cursoRealizado(this)) {
			a.getCursosMatriculados().remove(this);
			a.getCursosCompletos().add(this);
			return "D/Da "+a.getNombre()+" ha realizado con aprovechamiento el curso: "+this.getTitulo()+" en la modalidad PRESENCIAL, con una duración de "+(horasDiarias*dias)+" horas.";
		} else { 
			return "No se ha podido expedir el título";
		}
	}
	
	@Override
	public String toString() {
		return "Curso Presencial " + titulo + " con fecha de inicio " + fechaInicio
				+ " y fecha de finalización " + fechaFin + ". Dias de clase: " + dias + ". Horas diarias: "+horasDiarias;
	}
	
	
	
	
}
