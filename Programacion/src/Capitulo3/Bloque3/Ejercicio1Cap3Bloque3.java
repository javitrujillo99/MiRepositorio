package Capitulo3.Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio1Cap3Bloque3 {

	public static void main(String[] args) {
		int numero = 1, sumatorio = 0;
		String mensaje = "Introduzca n�mero (0 -> Terminar)";
		
		for (int i = 1; numero != 0; i++) {
			if (i == 1) { // Primera iteraci�n
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				sumatorio += numero;
			}
			else {
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				sumatorio += numero;
			}
		}
		
		JOptionPane.showMessageDialog(null, "La suma de todos los n�meros es : " + sumatorio);
		
	}

}
