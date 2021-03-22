package act4;

import java.time.LocalDate;
/**
 * Clase Museo, donde vamos a probar los distintos m�todos del cat�logo
 * 
 * @author Lourdes
 *
 */
public class Museo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Catalogo c = new Catalogo();
		
		System.out.println("**A�ADIMOS 4 OBRAS ART�STICAS AL CAT�LOGO DEL MUSEO**");
		
		Artista a1 = new Artista("Vincent van Gogh", "Zundert (Paises Bajos)", LocalDate.of(1853, 3, 30), LocalDate.of(1890, 7, 29));
		Obra p1 = new Pintura("La noche estrellada", 1, a1 , 1889, 74, 92, "lienzo");
		c.aniadeObra(p1);
		
		Artista a2 = new Artista("Sandro Botticelli", "Florencia", LocalDate.of(1445, 3, 1), LocalDate.of(1510, 5, 17));
		Obra p2 = new Pintura("El nacimiento de Venus", 2, a2 , 1482, 172, 278, "lienzo");
		c.aniadeObra(p2);
		
		Artista a3 = new Artista("Gian Lorenzo Bernini", "N�poles (Italia)", LocalDate.of(1598, 12, 7), LocalDate.of(1680, 11, 28));
		Obra e1 = new Escultura("El rapto de Proserpina", 3, a3, 1621, "m�rmol", 2.25);
		c.aniadeObra(e1);
		
		Obra e2 = new Escultura("Apolo y Dafne", 4, a3, 1622, "m�rmol", 2.43);
		c.aniadeObra(e2);
		
		System.out.println("");
		
		System.out.println("**COLECCI�N DESPU�S DE A�ADIR LAS OBRAS**");
		System.out.println(c.toString());
		
		System.out.println("");
		
		System.out.println("**PROBAMOS EL M�TODO MUESTRA CON LA SEGUNDA OBRA**");
		c.buscaObra(2).muestra();
		
		System.out.println("");
		
		System.out.println("**PROBAMOS EL M�TODO MASALTA**");
		System.out.println("N� inventario de la escultura m�s alta del cat�logo: " + c.masAlta());
		
		System.out.println("");
		
		System.out.println("**ELIMINAMOS LA �LTIMA OBRA A�ADIDA**");
		c.eliminaObra(4);
		
		System.out.println("");
		
		System.out.println("**COLECCI�N DESPU�S DEL ELIMINAR LA OBRA**");
		System.out.println(c.toString());
		
		System.out.println("");
		
		System.out.println("**BUSCAMOS LA PRIMERA OBRA DEL CAT�LOGO**");
		System.out.println(c.buscaObra(1).toString());
		
		System.out.println("");
		
		System.out.println("**PROBAMOS EL M�TODO SUPERFICIE**");
		System.out.println("Suma total de las superficies de las pinturas del cat�logo: " + c.superficie() + "cm^2");
		
	}

}
