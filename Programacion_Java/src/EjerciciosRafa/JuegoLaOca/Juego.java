package EjerciciosRafa.JuegoLaOca;

public class Juego {

	// Array de posibles nombres de jugadores, m�ximo de 6
	private String nombresJugadores[] = new String[] {"Rafa", "Joaqu�n", "Pedro", "Marta", "Sof�a", "Laura"};
	// Array de objetos de tipo "Jugador"
	private Jugador jugadores[] = null;
	// Singleton
	private static Juego juego = null;
	
	/**
	 * 
	 */
	public Juego () {
		super();
		// Inicializaci�n del array de jugadores
		jugadores = new Jugador[6];
		// Construcci�n de los objetos de tipo "Jugador"
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugador(nombresJugadores[i]);
		}
	}
	
	
	/**
	 * Singleton
	 * @return
	 */
	public static Juego getJuego() {
		if (juego == null) {
			juego = new Juego();
		}
		return juego;
	}
	
	
	
	/**
	 * 
	 */
	public void comienzaJuego () {
		// Bucle principal del juego
		do { // El bucle act�a mientras alg�n jugador siga en activo
			for (int i = 0; i < jugadores.length; i++) {
				// Mientras el jugador no haya terminado realizar� su jugada
				if (!jugadores[i].isTerminado()) {
					// Imprimimos el nombre del jugador en pantalla
					System.out.println(jugadores[i].getNombre());
					// El jugador tira el dado y se traslada hasta el lugar que le
					// corresponda
					jugadores[i].tirarDado();
					// Si el jugador ha terminado se le dar� un n�mero de "podium"
					if (jugadores[i].isTerminado()) {
						jugadores[i].setPodium(getMaximoValorEnPodium() + 1);
					}
				}
			}
		} while (!estaJuegoTerminado()); // Se juega mientras quede un s�lo jugador activo
		
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	private boolean estaJuegoTerminado () {
		// Se recorre el array de jugadores buscando que alguno a�n no haya terminado el juego
		for (int i = 0; i < jugadores.length; i++) {
			if (!jugadores[i].isTerminado()) {
				// El jugador de �ndice "i" a�n no ha terminado el juego
				return false;
			}
		}
		// Si llegamos a este punto significar� que todos los jugadores han terminado
		return true;
	}

	
	/**
	 * 
	 * @return
	 */
	public int getMaximoValorEnPodium () {
		// Este m�todo obtiene el m�ximo valor de podium del conjunto de jugadores.
		// Si ning�n jugador ha llegado a la meta, todos los jugadores tendr�n en su
		// "podium" el valor "0".
		int maxValor = 0;
		
		// Comprobamos que el array tenga al menos un elemento
		if (jugadores.length > 0) {
			maxValor = jugadores[0].getPodium(); // Asignamos el m�ximo valor de podium al que tenga el primer jugador
			// Recorremos todos los jugadores, buscando un valor de podium m�s alto,
			// comenzando por el segundo jugador y llegando hasta el �ltimo.
			for (int i = 1; i < jugadores.length; i++) {
				if (jugadores[i].getPodium() > maxValor) {
					maxValor = jugadores[i].getPodium();
				}
			}
		}
		return maxValor;
	}
	

	/**
	 * 
	 * @param jugadores
	 */
	public void ordenaArrayJugadoresPorPodium () {
		// Ordenaci�n por el m�todo de la burbuja, para que los jugadores queden
		// ordenados por orden de llegada a la meta
		for (int i = jugadores.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (jugadores[j].getPodium() > jugadores[j+1].getPodium()) {
					Jugador aux = jugadores[j];
					jugadores[j] = jugadores[j+1];
					jugadores [j+1] = aux;
				}
			}
		}		
	}

	
	/**
	 * 
	 */
	public void imprimeJugadores () {
		// Imprimo array de jugadores
		System.out.println("\n\nPodium de jugadores");
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println(jugadores[i].toString());
		}
	}
}
