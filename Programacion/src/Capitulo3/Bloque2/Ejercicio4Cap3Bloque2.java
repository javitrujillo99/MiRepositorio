package Capitulo3.Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio4Cap3Bloque2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero: "));
		int limite = Integer.parseInt(JOptionPane.showInputDialog("Introduzca l�mite: "));
		int multiplos = 0;
		System.out.println("Los m�ltiplos del n�mero " + n + " hasta el " + limite + " son:");
		for (int i = 0; i <= 100; i++) {
			 multiplos = n * i;
			 if (multiplos <= limite) {
				 System.out.println(n + " x " + i + " = " + multiplos);
			 }
		}

	}

}
