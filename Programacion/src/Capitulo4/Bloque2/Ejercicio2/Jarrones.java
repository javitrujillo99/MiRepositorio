package Capitulo4.Bloque2.Ejercicio2;

public class Jarrones extends Antiguedad {
	
	private String forma;

	/**
	 * 
	 */
	public Jarrones() {
		super();
	}

	
	/**
	 * 
	 * @param a�oFabricacion
	 * @param origen
	 * @param precio
	 * @param forma
	 */
	public Jarrones(int a�oFabricacion, String origen, float precio, String forma) {
		super(a�oFabricacion, origen, precio);
		this.forma = forma;
	}


	public String getForma() {
		return forma;
	}


	public void setForma(String forma) {
		this.forma = forma;
	}


	@Override
	public String toString() {
		return "Jarrones [forma=" + forma + ", getA�oFabricacion()=" + getA�oFabricacion() + ", getOrigen()="
				+ getOrigen() + ", getPrecio()=" + getPrecio() + "]";
	}
	
	

}
