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
	 * @param aņoFabricacion
	 * @param origen
	 * @param precio
	 * @param forma
	 */
	public Jarrones(int aņoFabricacion, String origen, float precio, String forma) {
		super(aņoFabricacion, origen, precio);
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
		return "Jarrones [forma=" + forma + ", getAņoFabricacion()=" + getAņoFabricacion() + ", getOrigen()="
				+ getOrigen() + ", getPrecio()=" + getPrecio() + "]";
	}
	
	

}
