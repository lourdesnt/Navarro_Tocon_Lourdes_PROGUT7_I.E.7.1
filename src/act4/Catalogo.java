package act4;

import java.util.HashMap;
import java.util.Map;
/**
 * Clase Catálogo del museo, donde se van a definir distintos servicios
 * 
 * @author Lourdes
 *
 */
public class Catalogo {
	/**
	 * Colección de obras artísticas
	 */
	Map<Integer, Obra> catalogo = new HashMap<>();
	
	/**
	 * Método que permite añadir una nueva obra artística al catálogo
	 * @param ob Obra artística que se va a añadir
	 * @return <ul>
	 * 				<li>true: la obra se ha añadido con éxito</li>
	 * 				<li>false: la obra no se ha podido añadir, ya existe en el catálogo</li>
	 *			</ul>
	 */
	public boolean aniadeObra(Obra ob) {
		if(!catalogo.containsKey(ob.getNumInventario())) {
			catalogo.put(ob.getNumInventario(), ob);
			return true;
		}
		return false;
	}
	
	/**
	 * Método que permite eliminar del catálogo la obra artística dada por el número de inventario
	 * @param nI Número de inventario de la obra que queremos eliminar
	 * @return <ul>
	 * 				<li>true: la obra se ha eliminado con éxito</li>
	 * 				<li>false: la obra no se ha podido eliminar, no existe en el catálogo</li>
	 *			</ul>
	 */
	public boolean eliminaObra(int nI) {
		if(catalogo.containsKey(nI)) {
			catalogo.remove(nI);
			return true;
		}
		return false;
	}
	
	/**
	 * Método que permite buscar en el catálogo la obra artística dada por el número de inventario
	 * @param nI Número de inventario de la obra que queremos buscar
	 * @return Obra
	 */
	public Obra buscaObra(int nI) {
		return catalogo.values().stream().filter(o -> o.getNumInventario()== nI).findAny().get();
	}

	/**
	 * Método que calcula la suma de las superficies de las pinturas que posee el museo
	 * @return Suma de las superficies de todas las pinturas
	 */
	public double superficie() {
		double total=0;
		for(Obra o: catalogo.values()) {
			if(o instanceof Pintura) {
				total =+ (((Pintura) o).getAlto() * ((Pintura) o).getAncho());
			}
		}
		return total;
	}
	
	/**
	 * Método que averigua cuál es la escultura más alta que posee el museo
	 * @return Número de inventario de la escultura más alta
	 */
	public int masAlta() {
		double maxAltura = catalogo.values().stream().filter(o -> o instanceof Escultura).map(o -> ((Escultura) o).getAltura()).reduce((c, o) -> Math.max(c, o)).get();
		return catalogo.values().stream().filter(o -> o instanceof Escultura && maxAltura == ((Escultura) o).getAltura()).findAny().get().getNumInventario();
//		return catalogo.values().stream().filter(o -> o instanceof Escultura).max((c, o) -> (int)(((Escultura)o).getAltura()-((Escultura)c).getAltura())).get().getNumInventario();
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return catalogo.values().stream().map(o -> o.toString()).reduce((c, o) -> c + "\n" + o).get();
	}

}
