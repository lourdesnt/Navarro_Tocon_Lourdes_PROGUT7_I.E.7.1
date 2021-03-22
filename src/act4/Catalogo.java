package act4;

import java.util.HashMap;
import java.util.Map;
/**
 * Clase Cat�logo del museo, donde se van a definir distintos servicios
 * 
 * @author Lourdes
 *
 */
public class Catalogo {
	/**
	 * Colecci�n de obras art�sticas
	 */
	Map<Integer, Obra> catalogo = new HashMap<>();
	
	/**
	 * M�todo que permite a�adir una nueva obra art�stica al cat�logo
	 * @param ob Obra art�stica que se va a a�adir
	 * @return <ul>
	 * 				<li>true: la obra se ha a�adido con �xito</li>
	 * 				<li>false: la obra no se ha podido a�adir, ya existe en el cat�logo</li>
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
	 * M�todo que permite eliminar del cat�logo la obra art�stica dada por el n�mero de inventario
	 * @param nI N�mero de inventario de la obra que queremos eliminar
	 * @return <ul>
	 * 				<li>true: la obra se ha eliminado con �xito</li>
	 * 				<li>false: la obra no se ha podido eliminar, no existe en el cat�logo</li>
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
	 * M�todo que permite buscar en el cat�logo la obra art�stica dada por el n�mero de inventario
	 * @param nI N�mero de inventario de la obra que queremos buscar
	 * @return Obra
	 */
	public Obra buscaObra(int nI) {
		return catalogo.values().stream().filter(o -> o.getNumInventario()== nI).findAny().get();
	}

	/**
	 * M�todo que calcula la suma de las superficies de las pinturas que posee el museo
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
	 * M�todo que averigua cu�l es la escultura m�s alta que posee el museo
	 * @return N�mero de inventario de la escultura m�s alta
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
