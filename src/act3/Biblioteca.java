package act3;

import java.util.ArrayList;
/**
 * Clase Biblioteca donde vamos crear una lista de publicaciones y vamos a crear y probar distintos métodos 
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
		
		//Creamos dos libros y los añadimos a la lista de publicaciones
		Publicacion l1 = new Libro("ENV", "El nombre del viento", 2009);
		publicaciones.add(l1);
		Publicacion l2 = new Libro("OYP", "Orgullo y prejuicio", 1813);
		publicaciones.add(l2);
		//Creamos dos revistas y los añadimos a la lista de publicaciones
		Publicacion r1 = new Revista("EMB", "Advances in enzymology and related areas of molecular biology", 1941, 78);
		publicaciones.add(r1);
		Publicacion r2 = new Revista("ACT", "A Contratiempo", 1987, 29);
		publicaciones.add(r2);
		
		//Prestamos el primer libro que hemos añadido
		((Libro) l1).prestar();
		
		//Mostramos los datos almacenados en la colección
		publicaciones.stream().forEach(System.out::println);
		
		//Mostramos cuántas publicaciones hay anteriores al 2010
		System.out.println("Total de publicaciones con fecha anterior a 2010: " + publicacionesAnterioresA(publicaciones.toArray(), 2010));
		//Mostramos cuántas publicaciones hay prestadas
		System.out.println("Total de publicaciones prestadas: " + cuentaPrestados(publicaciones.toArray()));
		
	}
	
	/**
	 * Método que recibe un array de objetos y devuelve cuántos de ellos están prestados
	 * @param array Array de objetos (Publicaciones)
	 * @return Total de publicaciones que están prestadas
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
	 * Método que recibe un array de objetos y un año y devuelve cuántas publicaciones tienen fecha anterior al año recibido
	 * @param array Array de objetos (Publicaciones)
	 * @param anio Año del cuál queremos saber cuántas publicaciones hay anterior a él
	 * @return Total de publicaciones anteriores al año recibido por parámetro
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
