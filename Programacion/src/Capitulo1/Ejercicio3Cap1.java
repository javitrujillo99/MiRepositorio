package Capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio3Cap1 {

	public static void main(String[] args) {
		// Realiza un programa que pida al usuario tres n�meros y calcule y muestre en pantalla la suma de los tres.
		
		String x = JOptionPane.showInputDialog("Introduzca un n�mero entero");
		int var1 = Integer.parseInt(x);
		System.out.println("N�mero introducido: " + var1);
		
		String y = JOptionPane.showInputDialog("Introduzca otro n�mero entero");
		int var2 = Integer.parseInt(y);
		System.out.println("N�mero introducido: " + var2);
		
		String z = JOptionPane.showInputDialog("Introduzca otro n�mero entero");
		int var3 = Integer.parseInt(z);
		System.out.println("N�mero introducido: " + var3);
		
		int suma = var1 + var2 + var3;
		System.out.println("La suma de los tres n�meros es: " + suma);
		
		

	}

}
