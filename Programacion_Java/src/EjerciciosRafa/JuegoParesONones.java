package EjerciciosRafa;

import javax.swing.JOptionPane;

public class JuegoParesONones {

	public static void main(String[] args) {
		int manoIzPC, manoDerPC, manoIzUsuario, manoDerUsuario;
		manoIzPC = (int) Math.round(Math.random() * 5);
		manoDerPC = (int) Math.round(Math.random() * 5);
		int decision = Integer.parseInt(JOptionPane.showInputDialog("Elige pares o nones. \nPARES = 0 \n NONES = 1"));
		
		if (decision < 0 || decision > 1) {
			JOptionPane.showMessageDialog(null, "ERROR, DEBES COGER 0 O 1. Reinicie el juego");
		}
		else {
			manoIzUsuario = Integer.parseInt(JOptionPane.showInputDialog("MANO IZQUIERDA. Introduzca cu�ntos dedos quiere sacar: "));
			manoDerUsuario = Integer.parseInt(JOptionPane.showInputDialog("MANO DERECHA. Introduzca cu�ntos dedos quiere sacar: "));
			if ((manoIzUsuario >= 0 && manoIzUsuario <= 5) && (manoDerUsuario >= 0 && manoDerUsuario <= 5)) {
			JOptionPane.showMessageDialog(null, "Dedos de la mano izquierda del ordenador: " + manoIzPC);
			JOptionPane.showMessageDialog(null, "Dedos de la mano derecha del ordenador: " + manoDerPC);
			}
			else {
				JOptionPane.showMessageDialog(null, "TIENES 5 DEDOS, IMB�CIL");
				System.exit(0);
			}
			int suma = manoIzUsuario + manoDerUsuario + manoIzPC + manoDerPC;
			if (decision == 0 && suma % 2 == 0) {
				JOptionPane.showMessageDialog(null, "ENHORABUENA!!! Sali� pares, ganas t�");
			}
			if (decision == 1 && suma % 2 != 0) {
				JOptionPane.showMessageDialog(null, "ENHORABUENA!!! Sali� nones, ganas t�");
			}
			if (decision == 0 && suma % 2 != 0) {
				JOptionPane.showMessageDialog(null, "Sali� nones, has perdido pringao");
			}
			if (decision == 1 && suma % 2 == 0) {
				JOptionPane.showMessageDialog(null, "Sali� pares, has perdido pringao");
			}
		}
	}
}
