package Capitulo4.Bloque2.Ejercicio2;

public class Antiguedad {
	private int a�oFabricacion;
	private String origen;
	private float precio;
	
	
	/**
	 * 
	 */
	public Antiguedad() {
		super();
	}
	
	
	/**
	 * 
	 * @param a�oFabricacion
	 * @param origen
	 * @param precio
	 */
	public Antiguedad(int a�oFabricacion, String origen, float precio) {
		super();
		this.a�oFabricacion = a�oFabricacion;
		this.origen = origen;
		this.precio = precio;
	}


	public int getA�oFabricacion() {
		return a�oFabricacion;
	}


	public void setA�oFabricacion(int a�oFabricacion) {
		this.a�oFabricacion = a�oFabricacion;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}	
}
