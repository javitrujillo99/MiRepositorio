package Capitulo2.Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio2bloque2Cap2 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("N�mero 1: ");
		int var1 = Integer.parseInt(str);
		System.out.println("N�mero 1: " + var1 );
		
		str = JOptionPane.showInputDialog("N�mero 2: ");
		int var2 = Integer.parseInt(str);
		System.out.println("N�mero 2: " + var2 );
		
		str = JOptionPane.showInputDialog("N�mero 3: ");
		int var3 = Integer.parseInt(str);
		System.out.println("N�mero 3: " + var3 );
		
		str = JOptionPane.showInputDialog("N�mero 4: ");
		int var4 = Integer.parseInt(str);
		System.out.println("N�mero 4: " + var4 );
		
		str = JOptionPane.showInputDialog("N�mero 5: ");
		int var5 = Integer.parseInt(str);
		System.out.println("N�mero 5: " + var5 );
		int suma2 = 0;
		int suma3 = 0;
		int suma4 = 0;
		
			if (var1 < 0 || var2 < 0 || var3 < 0 || var4 < 0 || var5 < 0 ) {
				JOptionPane.showMessageDialog(null,"ERROR. Los n�meros deben de ser 0 o mayores que 0");
			}
			else {	
				 {
					 	if (var1 <= 25) {
							 suma2 = suma2 + 1;	//	Lo mismo m�s corto ser�a suma2 ++ var1;
						}
						else {
						if (var1 <= 250) {
							 suma3 = suma3 + 1;
						}
						else {
							 suma4 = suma4 + 1;
					}
					}
				}
		 {
			 			if (var2 <= 25) {
			 			suma2 = suma2 + 1;		
			}
			else {
						if (var2 <= 250) {
						suma3 = suma3 + 1;
			}
			else {
						suma4 = suma4 + 1;
		}
		}
	}
		
		  {
			  			if (var3 <= 25) {
			  			suma2 = suma2 + 1;		
			}
			else {
						if (var3 <= 250) {
						suma3 = suma3 + 1;
			}
			else {
						suma4 = suma4 + 1;
		}
		}
	}
		  {
			  			if (var4 <= 25) {
			  			suma2 = suma2 + 1;		
			}
			else {
						if (var4 <= 250) {
						suma3 = suma3 + 1;
			}
			else {
						suma4 = suma4 + 1;

		}
		}
	}
		
		  {
			if (var5 <= 25) {
				 suma2 = suma2 + 1;		
			}
				else {
					if (var5 <= 250) {
				 suma3 = suma3 + 1;
			}
					else {
				 suma4 = suma4 + 1;
		}
		}
	}
		
		System.out.println("\nSe han introducido " + suma2 + " n�meros entre 0 y 25");
		System.out.println("Se han introducido " + suma3 + " n�meros entre 25 y 250" );
		System.out.println("Se han introducido " + suma4 + " n�meros mayores que 250");
		}
		
	}
	}

