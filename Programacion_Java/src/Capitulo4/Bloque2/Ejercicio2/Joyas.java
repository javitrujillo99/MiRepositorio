package Capitulo4.Bloque2.Ejercicio2;

public class Joyas extends Antiguedad {
	
	private String materialFabricacion;

	
	/**
	 * 
	 */
	public Joyas() {
		super();
	}

	
	/**
	 * 
	 * @param aņoFabricacion
	 * @param origen
	 * @param precio
	 * @param materialFabricacion
	 */
	public Joyas(int aņoFabricacion, String origen, float precio, String materialFabricacion) {
		super(aņoFabricacion, origen, precio);
		this.materialFabricacion = materialFabricacion;
	}


	public String getMaterialFabricacion() {
		return materialFabricacion;
	}


	public void setMaterialFabricacion(String materialFabricacion) {
		this.materialFabricacion = materialFabricacion;
	}


	@Override
	public String toString() {
		return "Joyas [materialFabricacion=" + materialFabricacion + ", getAņoFabricacion()=" + getAņoFabricacion()
				+ ", getOrigen()=" + getOrigen() + ", getPrecio()=" + getPrecio() + "]";
	}
	
	
	
	
	
	
	
}
