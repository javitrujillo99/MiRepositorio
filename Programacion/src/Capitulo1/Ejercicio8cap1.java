package Capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio8cap1 {

	public static void main(String[] args) {
/* Realiza un programa en C que pida al usuario tres n�meros enteros,
y localice e imprima en pantalla el mayor y el menor de los tres introducidos.
*/
		String str = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
		int var1 = Integer.parseInt(str);
		System.out.println("El n�mero que has elegido es el " + var1);
		str = JOptionPane.showInputDialog("Introduzca otro n�mero entero: ");
		int var2 = Integer.parseInt(str);
		System.out.println("El n�mero que has elegido es el " + var2);
		str = JOptionPane.showInputDialog("Introduzca otro n�mero entero: ");
		int var3 = Integer.parseInt(str);
		System.out.println("El n�mero que has elegido es el " + var3);
		
		if (var1 > var2 && var1 > var3) {
			System.out.println("El n�mero mayor es el " + var1);
		}
		else if (var2 > var1 && var2 > var3) {
			System.out.println("El n�mero mayor es el " + var2);
	    }
		else if (var3 > var1 && var3 > var2) {
			System.out.println("El n�mero mayor es el " + var3);
		}
		
	    if (var1 < var2 && var1 < var3) {
			System.out.println("El n�mero menor es el " + var1);
	    }
	    else if (var2 < var1 && var2 < var3) {
			System.out.println("El n�mero menor es el " + var2);
	    }
	    else if (var3 < var1 && var3 < var2) {
			System.out.println("El n�mero menor es el " + var3);
			
	    }
	    if (var1 == var2 && var2 == var3) {
	    	System.out.println("El n�mero mayor es el " + var1);
	    	System.out.println("El n�mero menor es el " + var1);
	    }
	    
	    if (var1 == var2 && var3 > var1) {
	    	System.out.println("El n�mero menor es el " + var1);	    	
	    }
	    else if (var1 == var3 && var2 > var1) {
	    	System.out.println("El n�mero menor es el " + var1);
	    }
	    else if (var2 == var3 && var1 > var2) {
	    	System.out.println("El n�mero menor es el " + var2);
	    }
	    if (var1 == var2 && var3 < var1) {
	    	System.out.println("El n�mero mayor es el " + var1);
	    	}
	    else if (var1 == var3 && var2 < var1) {
	    	System.out.println("El n�mero mayor es el " + var3);
	    	}
	    else if (var2 == var3 && var1 < var2) {
	    	System.out.println("El n�mero mayor es el " + var2);
	}
	    
	}
}
	    
	    