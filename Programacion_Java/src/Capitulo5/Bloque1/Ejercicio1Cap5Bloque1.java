package Capitulo5.Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio1Cap5Bloque1 {

	public static void main(String[] args) {
		int array [] = new int [150], i = 0;
		int limiteInferior = Integer.parseInt(JOptionPane.showInputDialog("Introduzca l�mite inferior: "));
		int limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog("Introduzca l�mite superior: "));
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (limiteSuperior - limiteInferior) + limiteInferior);
			System.out.println("N�mero [" + i + "] " + "= " + array[i]);
		}
	}

}
