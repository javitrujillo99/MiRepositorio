package Capitulo6.Bloque1.Ejercicio1Bloque1Cap6;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque1Cap6 {

	public static void main(String[] args) {
		String mensaje;		
		int num1, num2, opcion;
		String menu = "MENU\n"
				+ "1.- A�adir art�culo nuevo\n"
				+ "2.- Borrar art�culo\n"
				+ "3.- Actualizar estante de un art�culo\n"
				+ "4.- Imprimir art�culos\n"
				+ "0.- Salir\n";
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				
		// Resoluci�n de la operaci�n seg�n el tipo de operaci�n pedido por el usuario
		switch (opcion) {
		case 1: 
			break;
		case 2: 
			break;
		case 3: 
			break;
		case 4: 
			break;
		case 0: // Salir
			System.exit(0);
		
		}
	}
}
