package Capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio1cap1 {

	public static void main(String[] args) {
		/*
		Realiza un programa que pida al usuario tres n�meros: uno de tipo entero, otro de tipo flotante
		y otro de tipo doble. A continuaci�n se tienen que mostrar en pantalla los tres n�meros en una
		sola fila de la consola de salida. 
		 */
		String str = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
		int var1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un n�mero de tipo float: ");
		float var2 = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduzca un n�mero de tipo double: ");
		double var3 = Double.parseDouble(str);
		
		System.out.println("Los n�meros introducidos son: " + var1 + ", " + var2 + "y " + var3);

	}

}
