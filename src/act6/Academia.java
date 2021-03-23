package act6;

import java.time.LocalDate;
/**
 * Clase Academia donde vamos a probar las distintas funcionalidades
 * 
 * @author Lourdes
 *
 */
public class Academia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("**Declaramos dos alumnos**");
		System.out.println("");

		Alumno a1 = new Alumno("Pepe", "34678904");
		Alumno a2 = new Alumno("Andrea", "17679456", 125);
		
		System.out.println("**Declaramos dos cursos**");
		System.out.println("");
		
		CursoPresencial dBBDD = new CursoPresencial("Diseño de Bases de Datos", LocalDate.of(2018, 3, 12), LocalDate.of(2018, 3, 12), 1, 50, 20, 8, 1);
		CursoOnline aBBDD = new CursoOnline("Administración de Bases de Datos", LocalDate.of(2018, 3, 19), LocalDate.of(2018, 3, 21), 5, 50, dBBDD.getTitulo());
		
		System.out.println("**Matriculamos a los dos alumnos en el curso presencial**");
		System.out.println("");
		
		dBBDD.matricularAlumno(a1);
		dBBDD.matricularAlumno(a2);
		
		System.out.println("");
		
		System.out.println("**Registramos la asistencia del alumno Pepe en el día 1 del curso presencial**");
		System.out.println("");
		
		dBBDD.registrarAsistencia(1, a1);
		
		System.out.println("**Expedimos el título de todos los alumnos del curso presencial**");
		System.out.println("");
		
		System.out.println(dBBDD.expedirTitulo(a1));
		System.out.println(dBBDD.expedirTitulo(a2));
		
		System.out.println("");
		
		System.out.println("**Matriculamos al alumno Pepe en el curso online**");
		System.out.println("");
		
		aBBDD.matricularAlumno(a1);
	}
	
}
