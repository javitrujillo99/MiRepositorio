package Capitulo2.Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio1Cap2 {

	public static void main(String[] args) {
		/*Realiza un ejercicio en C que pida dos variables al usuario, tras lo cual,
		muestre en pantalla el n�mero mayor de los dos introducidos.
		*/
		String str = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
		int var1 = Integer.parseInt(str);
		System.out.println("Primer n�mero: " + var1);
		
		str = JOptionPane.showInputDialog("Introduzca otro n�mero entero: ");
		int var2 = Integer.parseInt(str);
		System.out.println("Segundo n�mero: " + var2);
		
		if (var1 > var2) {
			System.out.println("\nEl n�mero mayor es el " + var1);
		}
		else {
			if (var1 == var2) {
				System.out.println("\nLos dos n�meros son iguales a " + var1);
			}
			else {
			System.out.println("\nEl n�mero mayor es el " + var2);
			}
		}
		

	}

}
