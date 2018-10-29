package PrimerExamenProgramacion2018;

public class MainEjercicioE {

	public static void main(String[] args) {
		//Declaraci�n de las variables array, i,  y repetido
		int array [] = new int [20], i = 0;		
		//Generaci�n del array con 20 n�meros al azar entre 0 y 40
		for (i = 0; i < array.length; i++) {
			boolean repetido = false;
			array[i] = (int) Math.round(Math.random() * 40);
			//Generaci�n de una variable j que lee el array y comprueba si est� repetido el n�mero generado al azar
			for (int j = 0; j < i; j++) {
				//Condici�n en el caso en el que el n�mero generado est� repetido
				if (array[j] == array[i]) {
					repetido = true;
				}
				//Condici�n en el caso en el que el n�mero generado no est� repetido, en tal caso a�adimos el valor
				else {
					array [i] = array[i];
				}
			}
			//Generaci�n de otro n�mero al azar en caso de que se repita
			if (repetido == true) {
			array[i] = (int) Math.round(Math.random() * 40);
			}
		}
		//Impresi�n en pantalla del array
		for (i = 0; i < array.length; i++) {
			System.out.println("Array [" + i + "] = " + array[i]);
		}
	}
}
