package Capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio4cap1 {

	public static void main(String[] args) {
		//C�lculo de la media de 3 n�meros  que pedir�n al usuario.
		/*Entero entre entero va a dar un entero por mucho que pongamos float, por lo tanto ponemos un casting float o
		suma la ponemos como float, como es el caso. 
		*/
		
		String str = JOptionPane.showInputDialog("Introduzca un n�mero entero");
		int var1 = Integer.parseInt(str);
		System.out.println("N�mero introducido: " + var1);
		
		str = JOptionPane.showInputDialog("Introduzca otro n�mero entero");
		int var2 = Integer.parseInt(str);
		System.out.println("N�mero introducido: " + var2);
		
		str = JOptionPane.showInputDialog("Introduzca otro n�mero entero");
		int var3 = Integer.parseInt(str);
		System.out.println("N�mero introducido: " + var3);
		
		float suma = var1 + var2 + var3;
		float media = suma / 3;
		System.out.println("La media de los tres n�meros es: " + media);
				

	}

}
