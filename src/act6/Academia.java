package act6;

import java.time.LocalDate;

public class Academia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1 = new Alumno("Pepe", "34678904");
		Alumno a2 = new Alumno("Andrea", "17679456", 125);
		
		CursoPresencial dBBDD = new CursoPresencial("Diseño de Bases de Datos", LocalDate.of(2018, 3, 12), LocalDate.of(2018, 3, 12), 1, 50, 20, 8, 1);
		CursoOnline aBBDD = new CursoOnline("Administración de Bases de Datos", LocalDate.of(2018, 3, 19), LocalDate.of(2018, 3, 21), 5, 50, dBBDD.getTitulo());
		
		dBBDD.matricularAlumno(a1);
		dBBDD.matricularAlumno(a2);
		
		dBBDD.registrarAsistencia(1, a1);
		
		System.out.println(dBBDD.expedirTitulo(a1));
		System.out.print(dBBDD.expedirTitulo(a2));
		
		aBBDD.matricularAlumno(a1);
	}
	
}
