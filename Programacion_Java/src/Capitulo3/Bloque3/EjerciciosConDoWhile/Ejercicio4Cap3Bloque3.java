package Capitulo3.Bloque3.EjerciciosConDoWhile;

import javax.swing.JOptionPane;

public class Ejercicio4Cap3Bloque3 {

	public static void main(String[] args) {
		int menor, numero = 1;
		String mensaje = "Introduzca n�mero (0 -> Terminar)";
		numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		menor = numero;
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
			if (numero < menor && numero != 0) {
			menor = numero;
			}
		}
		while (numero != 0);
		JOptionPane.showMessageDialog(null, "El menor es: " + menor);
	}
}