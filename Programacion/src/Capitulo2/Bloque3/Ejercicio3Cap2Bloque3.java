package Capitulo2.Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio3Cap2Bloque3 {

	public static void main(String[] args) {
		String menu = "                        MEN�\n"  //NO FUNCIONA EL \t Y LO HE HECHO CON ESPACIOS.
				+ "1.-C�lculo de la hipotenusa de un tri�ngulo.\n"
				+ "2.-C�lculo de la superficie de una circunferencia.\n"
				+ "3.-C�lculo del per�metro de una circunferencia.\n"
				+ "4.-C�lculo del �rea de un rect�ngulo.\n"
				+ "5.-C�lculo del �rea de un tri�ngulo.\n"
				+ "0.-Salir de la aplicaci�n.";

		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		

	}

}
