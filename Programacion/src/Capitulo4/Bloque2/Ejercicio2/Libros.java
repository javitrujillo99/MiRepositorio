package Capitulo4.Bloque2.Ejercicio2;

public class Libros extends Antiguedad {
	
	private String autor;
	private String titulo;
	
	/**
	 * 
	 */
	public Libros() {
		super();
	}

	
	/**
	 * 
	 * @param a�oFabricacion
	 * @param origen
	 * @param precio
	 * @param autor
	 * @param titulo
	 */
	public Libros(int a�oFabricacion, String origen, float precio, String autor, String titulo) {
		super(a�oFabricacion, origen, precio);
		this.autor = autor;
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	@Override
	public String toString() {
		return "Libros [autor=" + autor + ", titulo=" + titulo + ", getA�oFabricacion()=" + getA�oFabricacion()
				+ ", getOrigen()=" + getOrigen() + ", getPrecio()=" + getPrecio() + "]";
	}
	
	
	
	
	
	

}
