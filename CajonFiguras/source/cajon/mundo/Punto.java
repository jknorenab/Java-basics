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
		// Esto también se hubiera podido hacer manual no? Como coordenadas[0] y coordenadas[1], no?
		// Sí, pero no hubiera podido generalizarse en los casos en que la dimensión no sea 2.
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

	

	/**
	 *  Constructor de puntos 
	 * @param pDimensionEspacio 
	 * @param pCoordenadas Arreglo con las coordenadas del punto
	 */
	
	public Punto(int pDimensionEspacio, int[] pCoordenadas) {
		this.dimensionEspacio = pDimensionEspacio;
		this.coordenadas = pCoordenadas;
	}
	
	
	//-----------------------------
	// Métodos
	//---------------------------
	
	/**
	 * Retorna un array con las coordenadas de acuerdo a la dimensión del espacio.
	 * @return Array con coordenadas
	 */
	public int[] getCoordenadas() {
		return coordenadas;
	}
	
	/**
	 * Retorna la coordenada en la posición indicada.
	 * <b> Pre: </b> La coordenada indicada debe ser menor a la dimensión del espacio.
	 * @param pPosicionCoordenada Posición de coordenada que se desea retornar
	 * @return Coordenada de la posición pedida.
	 */
	public int getCoordenadas( int pPosicionCoordenada) {
		int posicionCoordenada = 0;  //Cómo retornar que hubo un error si el parametro posicionCoordenada es mayor que la dimensión?
		if(pPosicionCoordenada < this.dimensionEspacio) {
			posicionCoordenada = this.coordenadas[pPosicionCoordenada];
		}
		return posicionCoordenada;
	}
	
	/**
	 * Cambia las coordenadas de un punto con parámetro recibido.
	 * @param coordenadas Coordenadas a asignar
	 */
	public void setCoordenadas(int[] coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	/**
	 * Cambia la coordenada indicada por pPosición con el valor dado en pCoordenada.
	 * @param pPosicion Posición de coordenada a cambiar
	 * @param pCoordenada Valor de coordenada a asignar
	 */
	public void setCoordenadas(int pPosicion, int pCoordenada) {
		if(pPosicion < this.dimensionEspacio) {
			this.coordenadas[pPosicion] = pCoordenada;
		} // Qué pasa si pPosicion es mayor que dimensionEspacio?
	}

	/**
	 * Retorna la dimensión del espacio.
	 * @return Dimensión del espacio
	 */
	public int getDimensionEspacio() {
		return dimensionEspacio;
	}
	
	/**
	 * Determina el cuadrante en que está el punto si la dimensión del
	 * espacio es 2. Retorna 0 si no es de dimensión 2.
	 * @return Cuadrante del punto o 0 en caso de tener dimension != 2.
	 */
	public int determinarCuadrante() {
		// Determina si la dimension del espacio es distinta de 2.
		
		int cuadrante = 0;
		//El método retorna el cuadrante del punto, si la dimensión del espacio es 2.
		if (getDimensionEspacio() != 2) {
			cuadrante = 0;
		} else {
			if(this.coordenadas[0] > 0 && this.coordenadas[1] > 0) cuadrante = 1;
			if(this.coordenadas[0] < 0 && this.coordenadas[1] > 0) cuadrante = 2;
			if(this.coordenadas[0] < 0 && this.coordenadas[1] < 0) cuadrante = 3;
			if(this.coordenadas[0] > 0 && this.coordenadas[1] < 0) cuadrante = 4;
		}
		return cuadrante;
	}
}