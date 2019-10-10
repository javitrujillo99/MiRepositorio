package Capitulo6.Bloque1HashMap.Ejercicio1Bloque1Cap6;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque1Cap6 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		int num1, num2, opcion;
		String codBarras;
		String estante;
		String descripcion;
		do {
			String menu = "MENU\n"
					+ "1.- A�adir art�culo nuevo\n"
					+ "2.- Borrar art�culo\n"
					+ "3.- Actualizar estante de un art�culo\n"
					+ "4.- Imprimir art�culos\n"
					+ "0.- Salir\n";
			
			String mensaje = "";
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
					
			// Resoluci�n de la operaci�n seg�n el tipo de operaci�n pedido por el usuario
			switch (opcion) {
			case 1:
				codBarras = JOptionPane.showInputDialog("Introduzca codigo de barras:");
				estante = JOptionPane.showInputDialog("Introduzca estante:");
				descripcion = JOptionPane.showInputDialog("Introduzca descripcion:");
				hm.put(codBarras, new Articulo(codBarras, estante, descripcion));
				mensaje = "Articulo a�adido";
				break;
			case 2:
				System.out.println("\nArticulos disponibles:");
				Object claves[] = hm.keySet().toArray();
				for (int i = 0; i < claves.length; i++) {
					System.out.println("C�digo de barras: " + claves[i].toString() + ". Estante y descripcion: "  + hm.get(claves[i].toString()));
				}
				codBarras = JOptionPane.showInputDialog("Introduzca codigo de barras del articulo a borrar:");
				hm.remove(codBarras);
				mensaje = "Articulo borrado";
				break;
			case 3:
				codBarras = JOptionPane.showInputDialog("Introduzca codigo de barras del articulo a cambiar el estante:");
				estante = JOptionPane.showInputDialog("Introduzca estante nuevo:");
				descripcion = JOptionPane.showInputDialog(null, "Introduzca descripcion del nuevo estante:");
				hm.replace(codBarras, new Articulo(codBarras, estante, descripcion));
				mensaje = "Articulo actualizado";
				break;
			case 4:
				System.out.println("\nArticulos disponibles:");
				claves = hm.keySet().toArray();
				for (int i = 0; i < claves.length; i++) {
					System.out.println("C�digo de barras: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i].toString()));
					mensaje = "Articulos mostrados en pantalla";
				}
				break;
			case 0: // Salir
				System.exit(0);
			}
			JOptionPane.showMessageDialog(null, mensaje);
		} while (opcion != 0);
	}
}
