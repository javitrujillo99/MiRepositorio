package Capitulo3.Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio3Cap3 {

	public static void main(String[] args) {
		int i, contadorNumerosPositivos = 0, contadorNumerosNegativos = 0;
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el n�mero de variables que quiere que le pidan: "));
		
		for (i = 1; i <= n; i++ ) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero " + i));
			
			if (numero >= 0) {
				contadorNumerosPositivos += 1; 
			}
			else {
				contadorNumerosNegativos += 1; 
			}
		}
		
		JOptionPane.showMessageDialog(null, "N�meros positivos: " + contadorNumerosPositivos + "\n"
				+ "N�meros negativos: " + contadorNumerosNegativos);

	}

}
