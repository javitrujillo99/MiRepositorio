package Capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio2cap1 {

	public static void main(String[] args) {
		/*
		 Realiza un programa igual al anterior, con la particularidad de que ahora se debe mostrar
		 cada n�mero justo a continuaci�n del momento en que ha sido introducido.
		 */
		
		String str = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
		int var1 = Integer.parseInt(str);
		System.out.println("El n�mero introducido es: " + var1);
		
		str = JOptionPane.showInputDialog("Introduzca un n�mero de tipo float: ");
		float var2 = Float.parseFloat(str);
		System.out.println("El n�mero introducido es: " + var2);
		
		str = JOptionPane.showInputDialog("Introduzca un n�mero de tipo double: ");
		double var3 = Double.parseDouble(str);
		System.out.println("El n�mero introducido es: " + var3);
	
	}

}
