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
	 * Construye un color en formato RGB de acuerdo a parámetros
	 * @param pR Rojo
	 * @param pG Verde
	 * @param pB Azul
	 */
	public Color(int pR, int pG, int pB) {
		r = pR;
		g = pG; //Porqué no ponemos en estos métodos this.r. etc...
		b = pB;
	}
	
	//----------------
	// Métodos
	//----------------
	
	//TODO: Agregar métodos getter y setter y agregar un método que retorne 
	//     un array primitivo de tamaño 3 con los atributos r, g, b
	//     Para mayor información sobre el modelo RGB revisar
	//     https://es.wikipedia.org/wiki/RGB
	
	//Métodos getter & setter ~Solución
	
	public int getR(){  // ~Recuerda que los métodos deben ser públicos para que otras clases tengan la capacidad de preguntarle a esta clase y esta, de dar su respuesta
		return this.r;
	}
	
	public int getG() {
		return this.g;
	}
	
	public int getB() {
		return this.b;
	}
	
	public void setR(int pR) { // Es void porque no retorna nada, sólo cambia el valor del parámetro
		this.r = pR;
	}
	
	public void setG(int pG) {
		this.g = pG;
	}
	
	public void setB(int pB) {
		this.b = pB;
	}
	
	// Recuerda que se pueden añadir automáticamente los métodos getter y setter, yendo a Source/Generate Getters and Setters
	// :) <3
	
	public int[] colorSet(int pR, int pG, int pB) {
		int[] colorsettings = new int[3];
		colorsettings[0] = pR;
		colorsettings[1] = pG;
		colorsettings[2] = pB;
		return colorsettings;
	}
	
}
