package Capitulo2.Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio2Cap2Bloque3 {

	public static void main(String[] args) {
		//NO ENTIENDO POR QU� NO SALE BIEN LA RA�Z C�BICA Y LA RA�Z EN�SIMA, PREGUNTAR A RAFA.
		
		
		String menu = "                        MEN�\n"
				+ "1.-Suma de dos n�meros\n"
				+ "2.-Resta de dos n�meros\n"
				+ "3.-Multiplicaci�n de dos n�meros\n"
				+ "4.-Divisi�n de dos n�meros\n"
				+ "5.-Ra�z cuadrada de un n�mero\n"
				+ "6.-Ra�z c�bica de un n�mero\n"
				+ "7. Ra�z en�sima de un n�mero\n"
				+ "8. Cuadrado de un n�mero\n"
				+ "9. N�mero elevado al cubo\n"
				+ "10.-N�mero elevado a lo que indique el usuario";
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		if (opcion < 1 || opcion > 10) {
			JOptionPane.showMessageDialog(null,"SYNTAX ERROR");
			System.exit(0);
		}
		if (opcion >= 1 && opcion <= 4) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca primer n�mero: ")); 
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca segundo n�mero: "));
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2;
		int division = num1 / num2;
		int resto = num1 % num2;
		
		
		switch (opcion) {
		
		case 1: //Suma de dos n�meros
			JOptionPane.showMessageDialog(null, "Resultado = " + suma);
			break;
		case 2: //Resta de dos n�meros
			JOptionPane.showMessageDialog(null, "Resultado = " + resta);
			break;
		case 3: //Multiplicaci�n de dos n�meros
			JOptionPane.showMessageDialog(null, "Resultado = " + multiplicacion);
			break;
		case 4: //Divisi�n de dos n�meros
			JOptionPane.showMessageDialog(null, "Resultado = " + division + "\nResto = " + resto);
			break;
		}
		}
		else {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n�mero: "));
		int raiz = (int) Math.sqrt(num);
		int raizcubica= (int) Math.pow(num, (1/3));
		int cuadrado = num * num;
		int cubo = cuadrado * num;
		
		switch (opcion) {
		case 5: //Ra�z cuadrada de un n�mero
			JOptionPane.showMessageDialog(null, "Resultado = " + raiz);
			break;	
		case 6: //Ra�z c�bica de un n�mero
			JOptionPane.showMessageDialog(null, "Resultado = " + raizcubica);
			break;
		case 7: //La ra�z en�sima de un n�mero, n lo indica el usuario.
			int n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el �ndice de la ra�z: "));
			int raizenesima = (int) Math.pow(num, (1/n));
			JOptionPane.showMessageDialog(null, "Resultado = " + raizenesima);
			break;
		case 8: //Un n�mero elevado al cuadrado
			JOptionPane.showMessageDialog(null, "Resultado = " + cuadrado);
			break;	
		case 9: //Un n�mero elevado al cubo
			JOptionPane.showMessageDialog(null, "Resultado = " + cubo);
			break;
		case 10: //Un n�mero elevado a un n�mero que indique el usuario
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca a qu� n�mero quiere elevar: "));
			int potencia = (int) Math.pow(num, num2);
			JOptionPane.showMessageDialog(null, "Resultado = " + potencia);
			break;
		}
		}
	}

}
