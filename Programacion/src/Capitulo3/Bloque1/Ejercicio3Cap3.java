package Capitulo3.Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio3Cap3 {

	public static void main(String[] args) {
		int i, acumuladorNumerosPositivos = 0, acumuladorNumerosNegativos = 0;
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el n�mero de variables que quiere que le pidan: "));
		for (i = 1; i <= n; i++ ) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero " + i));
			
			if (numero >= 0) {
				acumuladorNumerosPositivos += 1; 
			}
			else {
				acumuladorNumerosNegativos += 1; 
			}
		}
		
		JOptionPane.showMessageDialog(null, "N�meros positivos: " + acumuladorNumerosPositivos + "\n"
				+ "N�meros negativos: " + acumuladorNumerosNegativos);

	}

}
