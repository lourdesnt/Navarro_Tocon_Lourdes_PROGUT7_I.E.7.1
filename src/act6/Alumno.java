package act6;

import java.util.ArrayList;
import java.util.List;

public class Alumno implements Comparable<Alumno> {

	private String nombre, dni;
	private double saldo;
	private List<Curso> cursosCompletos;
	private List<Curso> cursosMatriculados;
	
	public Alumno(String nombre, String dni) {
		this.nombre=nombre;
		this.dni=dni;
		this.saldo=100;
		cursosCompletos = new ArrayList<>();
		cursosMatriculados = new ArrayList<>();
	}
	
	public Alumno(String nombre, String dni, double saldo) {
		this.nombre=nombre;
		this.dni=dni;
		this.saldo=saldo;
		cursosCompletos = new ArrayList<>();
		cursosMatriculados = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public double getSaldo() {
		return saldo;
	}

	public void incrementaSaldo(double s) {
		saldo+=s;
	}
	
	public void decrementaSaldo(double s) {
		saldo-=s;
	}

	public List<Curso> getCursosCompletos() {
		return cursosCompletos;
	}

	public List<Curso> getCursosMatriculados() {
		return cursosMatriculados;
	}

	public boolean cursoRealizado(Curso curso) {
		return cursosCompletos.contains(curso);
	}

	@Override
	public String toString() {
		return "Alumno "+ nombre + " con dni " + dni + ", saldo " + saldo;
	}
	
	public int compareTo(Alumno o) {
		return this.dni.compareTo(o.dni);
	}
}
