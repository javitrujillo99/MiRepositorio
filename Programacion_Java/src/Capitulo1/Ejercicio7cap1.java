package Capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio7cap1 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
		int num1 = Integer.parseInt(str);
		System.out.println("El n�mero que has escrito es: " + num1);
		int num2 = ~num1;
		int resultado = num2 + 1;
		System.out.println("El complemento a dos del n�mero " + num1 + " es: " + resultado);
		

	}

}
