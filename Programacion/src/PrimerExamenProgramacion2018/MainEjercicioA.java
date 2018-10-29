package PrimerExamenProgramacion2018;

import javax.swing.JOptionPane;

public class MainEjercicioA {

	public static void main(String[] args) {
		//Declaraci�n de variables array, media e i
		int array [] = new int [100], i = 0;
		float media = 0;
		//Inicializaci�n del array de n�meros aleatorios entre los l�mites e impresi�n en pantalla de dicho array
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);
			System.out.println("Array[" + i + "] = " + array[i]);
		}
		
		//Declaraci�n de variables sumatorio, media y menor
		int sumatorio = array[0];
		int mayor = array [0];
		int menor = array[0];
		
		//Inicializaci�n del array en el que vamos a calcular la suma,
		//el mayor y el menor de dicho array
		for (i = 1; i < array.length; i++) {
			//C�lculo del sumatorio
			sumatorio += array[i];
			//Generaci�n del n�mero mayor del array
			if (array[i] > mayor) {
				mayor = array[i];
			}
			//Generaci�n del n�mero menor del array
			if (array[i] < menor) {
				menor = array[i];
			}
		}
		//C�lculo de la media
		media = (float) sumatorio / array.length;
		//Impresi�n en pantalla de los resultados
		JOptionPane.showMessageDialog(null, "La suma de todos los n�meros es: " + sumatorio + "\n"
				+ "La media es: " + media + "\n"
						+ "El valor m�ximo es el " + mayor + "\n"
								+ "El valor m�nimo es el " + menor);
	}
}
