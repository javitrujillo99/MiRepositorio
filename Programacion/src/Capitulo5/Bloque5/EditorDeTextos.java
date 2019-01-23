package Capitulo5.Bloque5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class EditorDeTextos {
	
	private static int opcion;
	private static List<String> linea = new ArrayList<String>();
	
	public static void main(String[] args) {
		do {
		//imprimirMenu();
		//desarrollarLista(opcion);
			opcion = Integer.parseInt(JOptionPane.showInputDialog(" 1) A�adir una l�nea al texto. \n" + 
					" 2) Insertar una l�nea en cualquier posici�n del texto.\n" + 
					" 3) Editar una l�nea (reescribir su contenido).\n" + 
					" 4) Borrar una l�nea.\n" + 
					" 5) Cortar un conjunto de l�neas, (marcadas por su posici�n inicial y final).\n" + 
					" 6) Pegar un conjunto de l�neas cortadas en una determinada posici�n.\n" + 
					" 7) Imprimir el texto. Cada l�nea aparecer� numerada. \n" +
					" 0) Salir."));
			switch (opcion) {
			case 1:
				agregarLinea();
				break;
			case 2:
				insertarLinea();
				break;
			case 3:
				//editarLinea();
				break;
			case 4:
				borrarLinea();
				break;
			case 5:
				//cortarLineas();
				break;
			case 6:
				//pegarLineas();
				break;
			case 7:
				imprimeList(linea);
				break;
			}
		}while (opcion != 0);
	}
	
	/**
	 * 
	 */
	
	/*private static void imprimirMenu() {
		opcion = Integer.parseInt(JOptionPane.showInputDialog(null, " 1) A�adir una l�nea al texto. \n" + 
				" 2) Insertar una l�nea en cualquier posici�n del texto.\n" + 
				" 3) Editar una l�nea (reescribir su contenido).\n" + 
				" 4) Borrar una l�nea.\n" + 
				" 5) Cortar un conjunto de l�neas, (marcadas por su posici�n inicial y final).\n" + 
				" 6) Pegar un conjunto de l�neas cortadas en una determinada posici�n.\n" + 
				" 7) Imprimir el texto. Cada l�nea aparecer� numerada. \n" +
				" 0) Salir."));
		}
	
	/**
	 * 
	 */
	/*
	private static void desarrollarLista (int opcion) {
		switch (opcion) {
		case 1: 
			agregarLinea();
			break;
		case 2:
			insertarLinea();
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		}
	}
	*/
	
	/*
	 * 
	 */
	private static void agregarLinea() {
		String lineaUsuario = JOptionPane.showInputDialog("Introduzca l�nea a a�adir: ");
		linea.add(lineaUsuario);
	}
	
	private static void borrarLinea() {
		int posicionLinea = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca l�nea a borrar:"));
		linea.remove(posicionLinea);
	}
	
	/**
	 * 
	 */
	private static void insertarLinea() {
		int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca en que posici�n quiere a�adir la l�nea:"));
		String lineaUsuario = JOptionPane.showInputDialog("Introduzca l�nea:");
		linea.add(posicion, lineaUsuario);
	}
	
	
	/**
	 * 
	 */
	private static void editarLinea() {
		String lineaUsuario = JOptionPane.showInputDialog("Introduzca l�nea a a�adir: ");
	}
	/**
	 * 
	 * @param lista
	 */
	private static void imprimeList (List<String> linea) {
		for (int i = 0; i < linea.size(); i++) {
			System.out.println(linea.get(i).toString());
		}
	}
	

}
