package Capitulo3.Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio3Cap3Bloque2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero: "));
		int multiplos = 0;
		System.out.println("Los m�ltiplos del n�mero " + n + " hasta el 100 son:");
		for (int i = 0; i <= 100; i++) {
			 multiplos = n * i;
			 if (multiplos <= 100) {
			 System.out.println(n + " x " + i + " = " + multiplos);
			 }
		}
	}

}
