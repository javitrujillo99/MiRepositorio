package PrimerExamenProgramacion2018;

public class MainEjercicioD {

	public static void main(String[] args) {
		//Declaraci�n de las variables longitudArray, array1, array2 y repetido
		int longitudArray = 5, i = 0;
		int array1 [] = new int [longitudArray];
		int array2 [] = new int [longitudArray];
		
		//Generaci�n del array1 e impresi�n en pantalla
		System.out.println("Array 1:");
		for (i = 0; i < array1.length; i++) {
			array1[i] = (int) Math.round(Math.random() * 100);
			System.out.println("Array [" + i + "] = " + array1[i]);
		}
		//Generaci�n del array2
		System.out.println("\nArray 2:");
		for (i = 0; i < array2.length; i++) {
			boolean repetido = false;
			//Declaraci�n de la variable lugar que indica en qu� posici�n se pondr� del array1 en el array2
			int lugar = (int) Math.round(Math.random() * (longitudArray - 1));
			//Generaci�n de una variable j que lea el array
			for (int j = 0; j < array2.length; j++) {
				//Condici�n de que las variables del array2 s� est�n repetidas
				if (array2[j] == array1[i]) {
					repetido = true;
				}
				//Condici�n en la que las variables del array2 no est�n repetidas, en tal caso copiamos la variable en el array2
				else {
					array2[i] = array1[lugar];
				}
			}
			//Generaci�n de otro lugar al azar en caso de que se repita
			if (repetido == true) {
				lugar = (int) Math.round(Math.random() * (longitudArray - 1));
			}
		}
		//Impresi�n en pantalla del array
		for (i = 0; i < array2.length; i++) {
			System.out.println("Array [" + i + "] = " + array2[i]);
		}
	}
}
