package Capitulo2.Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio7Cap2 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
		int var1 = Integer.parseInt(str);
		System.out.println("N�mero: " + var1); 
		
		if ((var1 & 1) == 1) {
			System.out.println("El n�mero " + var1 + " es impar.");
		}
		else {
			System.out.println("El n�mero " + var1 + " es par.");
		}

	}

}
