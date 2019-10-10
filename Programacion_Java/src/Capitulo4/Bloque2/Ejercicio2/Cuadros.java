package Capitulo4.Bloque2.Ejercicio2;

public class Cuadros extends Antiguedad {
	
	private String autor;

	
	/**
	 * 
	 */
	public Cuadros() {
		super();
	}

	
	/**
	 * 
	 * @param a�oFabricacion
	 * @param origen
	 * @param precio
	 * @param autor
	 */
	public Cuadros(int a�oFabricacion, String origen, float precio, String autor) {
		super(a�oFabricacion, origen, precio);
		this.autor = autor;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "Cuadros [autor=" + autor + ", getA�oFabricacion()=" + getA�oFabricacion() + ", getOrigen()="
				+ getOrigen() + ", getPrecio()=" + getPrecio() + "]";
	}
	
	

}
