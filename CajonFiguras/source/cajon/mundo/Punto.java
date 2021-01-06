package cajon.mundo;

/**
 * Clase que modela un punto de una figura.
 * @author Cristian David Herrera
 *
 */
public class Punto {
	
	//---------------
	// Atributos
	//---------------
	
	private int dimensionEspacio;
	private int[] coordenadas;
	
	//---------------
	// Constructores
	//---------------
	/**
	 * Crea un punto por defecto con dimension 2 y coordenadas (0,0)
	 */
	public Punto( ) {
		dimensionEspacio = 2;
		coordenadas = new int[dimensionEspacio];
		for ( int i = 0; i < dimensionEspacio; i++) {
			coordenadas[i] = 0;
		}
	}
	
	public Punto( int x1, int x2) {
		dimensionEspacio = 2;
		coordenadas = new int[dimensionEspacio];
		coordenadas[0] = x1;
		coordenadas[1] = x2;
	}

	
			
	//TODO: (Opcional) Generar un constructor que reciba por par�metro la
	//      dimensi�n del espacio y un array primitivo con las coordenadas
	//      del punto y lo asigne al array de coordenadas.
	
	
	//-----------------------------
	// M�todos
	//---------------------------
	
	/**
	 * Retorna un array con las coordenadas de acuerdo a la dimensi�n del espacio.
	 * @return Array con coordenadas
	 */
	public int[] getCoordenadas() {
		return coordenadas;
	}
	
	/**
	 * Retorna la coordenada en la posici�n indicada.
	 * <b> Pre: </b> La coordenada indicada debe ser menor a la dimensi�n del espacio.
	 * @param pPosicionCoordenada Posici�n de coordenada que se desea retornar
	 * @return Coordenada de la posici�n pedida.
	 */
	public int getCoordenadas( int pPosicionCoordenada) {
		// TODO: Completar este m�todo de acuerdo a la documentaci�n.
		return 0;
	}
	
	/**
	 * Cambia las coordenadas de un punto con par�metro recibido.
	 * @param coordenadas Coordenadas a asignar
	 */
	public void setCoordenadas(int[] coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	/**
	 * Cambia la coordenada indicada por pPosici�n con el valor dado en pCoordenada.
	 * @param pPosicion Posici�n de coordenada a cambiar
	 * @param pCoordenada Valor de coordenada a asignar
	 */
	public void setCoordenadas(int pPosicion, int pCoordenada) {
		//TODO: Completar este m�todo de acuerdo a la documentaci�n.
	}

	/**
	 * Retorna la dimensi�n del espacio.
	 * @return Dimensi�n del espacio
	 */
	public int getDimensionEspacio() {
		return dimensionEspacio;
	}
	
	/**
	 * Determina el cuadrante en que est� el punto si la dimensi�n del
	 * espacio es 2. Retorna 0 si no es de dimensi�n 2.
	 * @return Cuadrante del punto o 0 en caso de tener dimension != 2.
	 */
	public int determinarCuadrante() {
		// Determina si la dimension del espacio es distinta de 2.
		if (getDimensionEspacio() != 2) {
			return 0;
		}
		
		//TODO: Completar el m�todo para que retorne el cuadrante del punto.
		//      Leer la documentaci�n.
		return 1;
	}
}