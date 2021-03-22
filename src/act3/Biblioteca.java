package act3;

import java.util.ArrayList;
/**
 * Clase Biblioteca donde vamos crear una lista de publicaciones y vamos a crear y probar distintos m�todos 
 * 
 * @author Lourdes
 *
 */
public class Biblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Lista de publicaciones de la biblioteca
		 */
		ArrayList<Publicacion> publicaciones = new ArrayList<>();
		
		//Creamos dos libros y los a�adimos a la lista de publicaciones
		Publicacion l1 = new Libro("ENV", "El nombre del viento", 2009);
		publicaciones.add(l1);
		Publicacion l2 = new Libro("OYP", "Orgullo y prejuicio", 1813);
		publicaciones.add(l2);
		//Creamos dos revistas y los a�adimos a la lista de publicaciones
		Publicacion r1 = new Revista("EMB", "Advances in enzymology and related areas of molecular biology", 1941, 78);
		publicaciones.add(r1);
		Publicacion r2 = new Revista("ACT", "A Contratiempo", 1987, 29);
		publicaciones.add(r2);
		
		//Prestamos el primer libro que hemos a�adido
		((Libro) l1).prestar();
		
		//Mostramos los datos almacenados en la colecci�n
		publicaciones.stream().forEach(System.out::println);
		
		//Mostramos cu�ntas publicaciones hay anteriores al 2010
		System.out.println("Total de publicaciones con fecha anterior a 2010: " + publicacionesAnterioresA(publicaciones.toArray(), 2010));
		//Mostramos cu�ntas publicaciones hay prestadas
		System.out.println("Total de publicaciones prestadas: " + cuentaPrestados(publicaciones.toArray()));
		
	}
	
	/**
	 * M�todo que recibe un array de objetos y devuelve cu�ntos de ellos est�n prestados
	 * @param array Array de objetos (Publicaciones)
	 * @return Total de publicaciones que est�n prestadas
	 */
	public static int cuentaPrestados(Object[] array) {
		int cont = 0;
		for(Object o: array) {
			if(o instanceof Prestable && ((Prestable) o).prestado()) {
				cont++;
			}
		}
		return cont;
	}
	
	/**
	 * M�todo que recibe un array de objetos y un a�o y devuelve cu�ntas publicaciones tienen fecha anterior al a�o recibido
	 * @param array Array de objetos (Publicaciones)
	 * @param anio A�o del cu�l queremos saber cu�ntas publicaciones hay anterior a �l
	 * @return Total de publicaciones anteriores al a�o recibido por par�metro
	 */
	public static int publicacionesAnterioresA(Object[] array, int anio) {
		int cont = 0;
		for(Object p: array) {
			if(((Publicacion) p).getAnio()<anio) {
				cont++;
			}
		}
		return cont;
	}

}
