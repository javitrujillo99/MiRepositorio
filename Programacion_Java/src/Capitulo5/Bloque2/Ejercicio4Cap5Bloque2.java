package Capitulo5.Bloque2;

public class Ejercicio4Cap5Bloque2 {

	public static void main(String[] args) {
		int array [] = new int [5], i = 0, numero;
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.println("N�mero [" + i + "] " + "= " + array[i]);
		}
		numero = array[array.length - 1];
		System.out.println("\nDESPLAZAMIENTO CIRCULAR:");
		for (i = array.length - 1; i > 0; i--) {
		array[i] = array[i - 1];	
		}
		array[0] = numero;
		for (i = 0; i < array.length; i++) {
			System.out.println("N�mero [" + i + "] " + "= " + array[i]);
		}
	}
}
