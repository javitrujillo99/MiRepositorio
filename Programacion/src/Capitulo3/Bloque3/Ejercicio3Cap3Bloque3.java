package Capitulo3.Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio3Cap3Bloque3 {

	public static void main(String[] args) {
		int mayor = 0, numero = 1;
		String mensaje = "Introduzca n�mero (0 -> Terminar)";
		
		for (int i = 1; numero != 0; i++) {
			if (i == 1) { //Primera iteraci�n
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				mayor = numero;
			}
			else {
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero > mayor && numero != 0) {
				mayor = numero;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "El mayor es: " + mayor);

	}

}
