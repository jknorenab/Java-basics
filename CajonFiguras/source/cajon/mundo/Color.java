package cajon.mundo;

/**
 * Clase que modela un color en formato RGB.
 * @author Cristian David Herrera
 */

public class Color {
	
	//------------------
	// Atributos
	//------------------
	
	private int r;
	private int g;
	private int b;
	
	//------------------
	// Constructores
	//------------------
	
	/**
	 * Construye por defecto color RGB negro.
	 */
	public Color () {
		r = 0;
		g = 0;
		b = 0;
	}
	
	/**
	 * Construye un color en formato RGB de acuerdo a par�metros
	 * @param pR Rojo
	 * @param pG Verde
	 * @param pB Azul
	 */
	public Color(int pR, int pG, int pB) {
		r = pR;
		g = pG;
		b = pB;
	}
	
	//----------------
	// M�todos
	//----------------
	
	//TODO: Agregar m�todos getter y setter y agregar un m�todo que retorne 
	//     un array primitivo de tama�o 3 con los atributos r, g, b
	//     Para mayor informaci�n sobre el modelo RGB revisar
	//     https://es.wikipedia.org/wiki/RGB
}
