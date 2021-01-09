package cajon.mundo;

/**
 * Clase que modela un lado de una figura.
 * @author Cristian David Herrera
 *
 */
public class Lado {
	
	public final static int PUNTOS_POR_LADO = 2;
	//------------------
	// Atributos
	//------------------
	private double longitud;
	private Color color;
	private Punto[] puntos;
	
	
	//---------------
	// Constructores
	//---------------
	/**
	 * Construye un lado de color negro con los puntos (0,0) y (1,1).
	 */
	public Lado() {
		color = new Color();
		puntos = new Punto[PUNTOS_POR_LADO];
		//longitud = calcularLongitud();
		//Si pusiéramos calcular longitud aquí arriba, habría un error
		// Puesto que calcular longitud depende de que existan los puntos
		puntos[0] = new Punto(0,0);
		puntos[1] = new Punto(1,1);
		// Aquí puedo llamar a calcularLongitud sin haberla definido antes?
		// Sí, porque antes definimos y creamos el arreglo puntos, del cual depende la función/método calcularLongitud
		longitud = calcularLongitud(); 
	} 
	
	/**
	 * Construye un lado de color negro con los puntos recibidos por parámetros
	 * <b> Pre: </b> Los puntos recibidos por parámetro deben ser de la misma dimensión.
	 * @param pPuntos Vértices del lado
	 */
	public Lado(Punto[] pPuntos) {
		color = new Color();
		// Asignamos el arreglo puntos a un nuevo arreglo de Puntos de tamaño Puntos_POR_LADO
		puntos = new Punto[PUNTOS_POR_LADO];
		puntos = pPuntos;
		longitud = calcularLongitud();
	}
	
	/**
	 * Construye un lado con el color y los puntos indicados por parámetro.
	 * <b> Pre: </b> Los puntos recibidos por parámetro deben ser de la misma dimensión.
	 * @param pPuntos Vértices del lado
	 * @param pColor Color en código RGB
	 */
	public Lado(Punto[] pPuntos, Color pColor) {
		// Asignamos el arreglo puntos a un nuevo arreglo de Puntos de tamaño Puntos_POR_LADO
		puntos = new Punto[PUNTOS_POR_LADO];
		//Aquí, debemos poner un if para verificar que los puntos sean de la misma dimensión?
		puntos = pPuntos;
		color = pColor;
		longitud = calcularLongitud();
	}
	
	/**
	 * Construye un lado con el color y los puntos indicados por parámetro.
	 * <b> Pre: </b> Los puntos recibidos por parámetro deben ser de la misma dimensión.
	 * @param punto1 Vértice del lado
	 * @param punto2 Vértice del lado
	 */
	public Lado(Punto punto1, Punto punto2) {
		// Asignamos el arreglo puntos a un nuevo arreglo de Puntos de tamaño Puntos_POR_LADO
		puntos = new Punto[PUNTOS_POR_LADO];
		puntos[0] = punto1;
		puntos[1] = punto2;
		color = new Color();
		// Asignamos el atributo longitud por medio de la función calcularLongitud
		longitud = calcularLongitud();
	}
	
	/**
	 * Construye un lado con el color y los puntos indicados por parámetro.
	 * <b> Pre: </b> Los puntos recibidos por parámetro deben ser de la misma dimensión.
	 * @param punto1 Vértice del lado
	 * @param punto2 Vértice del lado
	 */
	public Lado(Punto punto1, Punto punto2, Color pColor) {
		// Asignamos el arreglo puntos a un nuevo arreglo de Puntos de tamaño Puntos_POR_LADO
		puntos = new Punto[PUNTOS_POR_LADO];
		puntos[0] = punto1;
		puntos[1] = punto2;
		color = pColor;
		// Asignamos el atributo longitud por medio de la función calcularLongitud
		longitud = calcularLongitud();	
	}
	//------------------------
	// Métodos
	//------------------------
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setPuntos(Punto[] puntos) {
		this.puntos = puntos;
		this.longitud = calcularLongitud();
	}
	
	//Calcula la longitud euclideana del lado.
	
	/**
	 * Calcula la longitud de un lado de acuerdo a la distancia euclidiana
	 * @return longitud del lado
	 */

	//      Para calcular potencias, use la función Math.pow y para raíces use
	//      Math.sqrt. Con el fin de hacerlo lo más general posible, trate de usar
	//      un ciclo for sobre la dimension del espacio.

	private double calcularLongitud( ) {
		double longitud = 0.0;
		double y = 0.0;
		for(int j = 0; j < puntos[0].getDimensionEspacio() ; j++) {
			int a = 0;
			y += Math.pow(puntos[a+1].getCoordenadas(j) - puntos[a].getCoordenadas(j), 2);
			longitud = Math.sqrt(y);
		}		
		return longitud;
	}
}
