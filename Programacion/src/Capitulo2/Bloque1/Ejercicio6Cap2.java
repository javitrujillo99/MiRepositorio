package Capitulo2.Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio6Cap2 {

	public static void main(String[] args) {
		/*Realizar un ejercicio en C que pida un n�mero al usuario e indique en pantalla si se trata
		 * de un n�mero par o impar. Recuerda que un n�mero par es aquel cuyo resto de su divisi�n 
		 * entre dos sea siempre cero, y recuerda que un n�mero impar es aquel cuyo
		 * resto de su divisi�n entre dos sea siempre uno. 
		 */
		String str = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
		int var1 = Integer.parseInt(str);
		System.out.println("N�mero: " + var1);
		
		if (var1 % 2 == 0) {
			System.out.println("El n�mero " + var1 + " es par.");
		}
		else {
			System.out.println("El n�mero " + var1 + " es impar.");
		}

	}

}
