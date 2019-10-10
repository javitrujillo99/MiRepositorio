package PrimerExamenProgramacion2018;

import javax.swing.JOptionPane;

public class MainEjercicioB {

	public static void main(String[] args) {
		//Declaraci�n de variables array, liminf y limSup
		int array [] = new int [100], i = 0;
		int limInf = Integer.parseInt(JOptionPane.showInputDialog("Escriba l�mite inferior: "));
		int limSup = Integer.parseInt(JOptionPane.showInputDialog("Escriba l�mite superior: "));
		
		System.out.println("Array en orden normal:");
		//Generaci�n e impresi�n en pantalla del array entre los l�mites establecidos en orden normal
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (limSup - limInf) + limInf);
			System.out.println("Array [" + i + "] = " + array[i]);
		}
		System.out.println("\nArray en orden invertido:");
		//Generaci�n e impresi�n en pantalla del array entre los l�mites establecidos en orden invertido
		for (i = array.length - 1; i >= 0; i--) {
			System.out.println("Array [" + i + "] = " + array[i]);
		}
	}
}
