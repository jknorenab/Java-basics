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
		g = pG; //Porqu� no ponemos en estos m�todos this.r. etc...
		b = pB;
	}
	
	//----------------
	// M�todos
	//----------------
	
	//TODO: Agregar m�todos getter y setter y agregar un m�todo que retorne 
	//     un array primitivo de tama�o 3 con los atributos r, g, b
	//     Para mayor informaci�n sobre el modelo RGB revisar
	//     https://es.wikipedia.org/wiki/RGB
	
	//M�todos getter & setter ~Soluci�n
	
	public int getR(){  // ~Recuerda que los m�todos deben ser p�blicos para que otras clases tengan la capacidad de preguntarle a esta clase y esta, de dar su respuesta
		return this.r;
	}
	
	public int getG() {
		return this.g;
	}
	
	public int getB() {
		return this.b;
	}
	
	public void setR(int pR) { // Es void porque no retorna nada, s�lo cambia el valor del par�metro
		this.r = pR;
	}
	
	public void setG(int pG) {
		this.g = pG;
	}
	
	public void setB(int pB) {
		this.b = pB;
	}
	
	// Recuerda que se pueden a�adir autom�ticamente los m�todos getter y setter, yendo a Source/Generate Getters and Setters
	// :) <3
	
	public int[] colorSet(int pR, int pG, int pB) {
		int[] colorsettings = new int[3];
		colorsettings[0] = pR;
		colorsettings[1] = pG;
		colorsettings[2] = pB;
		return colorsettings;
	}
	
}
