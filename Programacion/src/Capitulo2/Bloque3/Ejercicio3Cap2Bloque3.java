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
		if (opcion != 0) {
				switch (opcion) {
				case 1: //C�lculo de la hipotenusa de un tri�ngulo.
					float cateto1 = Integer.parseInt(JOptionPane.showInputDialog("Cateto 1: "));
					float cateto2 = Integer.parseInt(JOptionPane.showInputDialog("Cateto 2: "));
					float hipotenusa =  (float) Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
					JOptionPane.showMessageDialog(null, "Resultado = " + hipotenusa);
					break;
				case 2: //C�lculo de la superficie de una circunferencia.
					float radio = Integer.parseInt(JOptionPane.showInputDialog("Radio de la circunferencia: "));
					float area = (float) (Math.PI * Math.pow(radio, 2));
					JOptionPane.showMessageDialog(null, "Resultado = " + area);
					break;
				case 3: //C�lculo del per�metro de una circunferencia.
					float radio1 = Integer.parseInt(JOptionPane.showInputDialog("Radio de la circunferencia: "));
					float perimetro = (float) (2 * Math.PI * radio1);
					JOptionPane.showMessageDialog(null, "Resultado = " + perimetro);
					break;
				case 4: //C�lculo del �rea de un rect�ngulo.
					float base = Integer.parseInt(JOptionPane.showInputDialog("Base del rect�ngulo: "));
					float altura = Integer.parseInt(JOptionPane.showInputDialog("Altura del rect�ngulo: "));
					float area1 = base * altura;
					JOptionPane.showMessageDialog(null, "Resultado = " + area1);
					break;
				case 5: //C�lculo del �rea de un tri�ngulo.
					float base1 = Integer.parseInt(JOptionPane.showInputDialog("Base del tri�ngulo: "));
					float altura1 = Integer.parseInt(JOptionPane.showInputDialog("Altura del tri�ngulo: "));
					float area2 = base1 * altura1 / 2;
					JOptionPane.showMessageDialog(null, "Resultado = " + area2);
					break;
				case 0: //Salir de la aplicaci�n.
					JOptionPane.showMessageDialog(null, "Gracias por usar la calculadora.");
					System.exit(0);
					default:JOptionPane.showMessageDialog(null,"Opci�n incorrecta") ;
				}
		}
	}
	}
