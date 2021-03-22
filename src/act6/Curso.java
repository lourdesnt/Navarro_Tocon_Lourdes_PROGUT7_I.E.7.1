package act6;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public abstract class Curso {

	protected String titulo;
	protected LocalDate fechaInicio, fechaFin;
	protected int dias, numAlumnos;
	protected double precio;
	protected Set<Alumno> alumnos;
	
	public Curso(String titulo, LocalDate fechaInicio, LocalDate fechaFin, int dias, double precio) {
		this.titulo=titulo;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.dias=dias;
		this.precio=precio;
		alumnos= new TreeSet<>();
		this.numAlumnos=0;
	}

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

	public void matricularAlumno(Alumno a) {
		if (a.getSaldo()>=precio && !alumnos.contains(a)) {
			a.decrementaSaldo(precio);
			alumnos.add(a);
			numAlumnos++;
			System.out.println("Alumno matriculado con éxito");
		} else {
			System.err.println("No se ha podido matricular al alumno");
		}
	}
	
	public abstract String expedirTitulo(Alumno a);
	
}
