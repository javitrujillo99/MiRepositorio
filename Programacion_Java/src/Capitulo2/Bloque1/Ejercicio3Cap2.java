package Capitulo2.Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio3Cap2 {

	public static void main(String[] args) {
		/*Repetir el ejercicio 1� de este bloque de ejercicios, pero pidiendo al usuario cinco variables.
		 Es decir, se pedir�n al usuario cinco variables y se mostrar� el mayor valor en pantalla. */
		String str = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
		int var1 = Integer.parseInt(str);
		System.out.println("Primer n�mero: " + var1);
		
		str = JOptionPane.showInputDialog("Introduzca otro n�mero entero: ");
		int var2 = Integer.parseInt(str);
		System.out.println("Segundo n�mero: " + var2);
		
		str = JOptionPane.showInputDialog("Introduzca otro n�mero entero: ");
		int var3 = Integer.parseInt(str);
		System.out.println("Tercer n�mero: " + var3);
		
		str = JOptionPane.showInputDialog("Introduzca otro n�mero entero: ");
		int var4 = Integer.parseInt(str);
		System.out.println("Cuarto n�mero: " + var4);
		
		str = JOptionPane.showInputDialog("Introduzca otro n�mero entero: ");
		int var5 = Integer.parseInt(str);
		System.out.println("Quinto n�mero: " + var5);
		
		if (var1 == var2 && var2 == var3 && var3 == var4 && var4 == var5) {
			System.out.println("\nLos cinco n�meros son iguales a " + var1);
		}
		
		else if (var1 >= var2 && var1 >= var3 && var1 >= var4 && var1 >= var5) {
			System.out.println("\nEl n�mero mayor es el " + var1);
		}
		else if (var2 >= var1 && var2 >= var3 && var2 >= var4 && var2 >= var5) {
			System.out.println("\nEl n�mero mayor es el " + var2);
		}
		else if (var3 >= var1 && var3 >= var2 && var3 >= var4 && var3 >= var5) {
			System.out.println("\nEl n�mero mayor es el " + var3);
		}
		else if (var4 >= var1 && var4 >= var3 && var4 >= var2 && var4 >= var5) {
			System.out.println("\nEl n�mero mayor es el " + var4);
		}
		else if (var5 >= var1 && var5 >= var3 && var5 >= var4 && var5 >= var2) {
			System.out.println("\nEl n�mero mayor es el " + var5);
		}

	}

}
