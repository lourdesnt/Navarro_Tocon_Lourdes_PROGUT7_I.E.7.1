package act4;

import java.time.LocalDate;
/**
 * Clase Artista
 * 
 * @author Lourdes
 *
 */
public class Artista {
	/**
	 * Atributo Nombre del artista (tipo String)
	 */
	private String nombre;
	/**
	 * Atributo Lugar de nacimiento del artista (tipo String)
	 */
	private String lugarNacimiento;
	/**
	 * Atributo Fecha de nacimiento del artista (tipo LocalDate)
	 */
	private LocalDate fechaNacimiento;
	/**
	 * Atributo Fecha de fallecimiento del artista (tipo LocalDate)
	 */
	private LocalDate fechaFallecimiento;
	
	/**
	 * Constructor predeterminado
	 */
	public Artista() {}
	
	/**
	 * Constructor que admite 4 par�metros
	 * @param nombre Nombre del artista
	 * @param lugarNacimiento Lugar de nacimiento del artista
	 * @param fechaNacimiento Fecha de nacimiento del artista
	 * @param fechaFallecimiento Fecha de fallecimiento del artista
	 */
	public Artista(String nombre, String lugarNacimiento, LocalDate fechaNacimiento, LocalDate fechaFallecimiento) {
		this.nombre=nombre;
		this.lugarNacimiento=lugarNacimiento;
		this.fechaNacimiento=fechaNacimiento;
		this.fechaFallecimiento=fechaFallecimiento;
	}

	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDate getFechaFallecimiento() {
		return fechaFallecimiento;
	}

	public void setFechaFallecimiento(LocalDate fechaFallecimiento) {
		this.fechaFallecimiento = fechaFallecimiento;
	}

	/**
	 * M�todo que muestra la informaci�n del artista
	 */
	public void muestra() {
		System.out.println("EL artista " + nombre + " naci� en " + lugarNacimiento + " en el a�o " + fechaNacimiento + ". Falleci� en el a�o " + fechaFallecimiento);
	}

	/**
	 * equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		if (fechaFallecimiento == null) {
			if (other.fechaFallecimiento != null)
				return false;
		} else if (!fechaFallecimiento.equals(other.fechaFallecimiento))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (lugarNacimiento == null) {
			if (other.lugarNacimiento != null)
				return false;
		} else if (!lugarNacimiento.equals(other.lugarNacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Artista " + nombre + " (" + lugarNacimiento + ", "
				+ fechaNacimiento + " - " + fechaFallecimiento + ")";
	}

}
