package ApuntesExamen;

import javax.swing.JOptionPane;

public class MENUS {

	public static void main(String[] args) {
		// Declaraci�n de todas la variables necesarias
		String mensaje = null;		
		int num1, num2, opcion;
		String menu = "MENU\n"
				+ "1.- \n"
				+ "2.- \n"
				+ "3.- \n"
				+ "4.- \n"
				+ "5.- \n"
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
		case 5: 
			break;
		case 0: // Salir
			System.exit(0);
		
		// Saca la informaci�n al usuario
		JOptionPane.showMessageDialog(null, mensaje);
	
		}
	}
}
