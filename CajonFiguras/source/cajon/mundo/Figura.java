/**
 * 
 */
package cajon.mundo;

/**
 * Clase que modela una figura.
 * @author Cristian David Herrera
 *
 */
public class Figura {
	
	public enum Tipo {
		EQUILATERO,
		ISOSCELES,
		ESCALENO,
		OTRO
	}
	
	private int numLados;
	private Color colorFigura;
	private Lado[] lados;
	private Punto[] puntos;
	
	//---------------------------
	// Constructores
	//--------------------------
	
	/**
	 * Construye por defecto un triangulo con color RGB negro con v�rtices fijos.
	 */
	public Figura ( ) {
		numLados = 3;
		colorFigura = new Color();
		
		//Primero, creo el array de puntos y le asigno tama�o
		puntos = new Punto[numLados];
		//Segundo, adiciono los puntos al array de acuerdo al n�mero de lados.
		puntos[0] = new Punto(0,0);
		puntos[1] = new Punto(0,3);
		puntos[2] = new Punto(4,0);
		
		//En tercer lugar, creo el array de lados y le asigno tama�o.
		lados = new Lado[numLados];
		//Y en cuarto lugar, creo los lados de acuerdo a los puntos de la figura.
		lados[0] = new Lado(puntos[0], puntos[1]);
		lados[1] = new Lado(puntos[1], puntos[2]);
		lados[2] = new Lado(puntos[2], puntos[0]);
	}
	
	public Figura( int pNumLados, Punto[] pPuntos) {
		colorFigura = new Color();
		numLados = pNumLados;
		
		//Primero, creo el array de puntos y le asigno tama�o
		puntos = new Punto[numLados];
		//Segundo, adiciono los puntos al array de acuerdo al n�mero de lados.
		puntos = pPuntos;
		//Tercero, creo el array de lados y le asigno tama�o
		lados = new Lado[numLados];
		//Cuarto, creo los lados de acuerdo a los puntos de la figura.
		//TODO: Asignar a cada uno de los lados de la figura dos puntos consecutivos
		//      en un ciclo for. Para no tener conflicto con los �ndices al iniciar
		//		de nuevo el conteo, use el operador m�dulo %
	}
	
	//TODO: (Opcional) Crear un constructor que cree un tri�ngulo
	// 		con par�metros numLados y las coordenadas de cada uno de los puntos.
	//		
	

	//---------------------------
	// M�todos
	//--------------------------
	
	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	public Color getColorFigura() {
		return colorFigura;
	}

	public void setColorFigura(Color colorFigura) {
		this.colorFigura = colorFigura;
	}

	public Lado[] getLados() {
		return lados;
	}

	public void setLados(Lado[] lados) {
		this.lados = lados;
	}

	public Punto[] getPuntos() {
		return puntos;
	}

	public void setPuntos(Punto[] puntos) {
		this.puntos = puntos;
	}
	
	/**
	 * Calcula el per�metro de una figura con la distancia euclideana 
	 * @return Per�metro de la figura
	 */
	public double calcularPerimetro() {
		//TODO: Completar el m�todo de acuerdo a la documentaci�n.
		//      Recuerde que cada uno de los lados tiene un m�todo
		//		para calcular su longitud.
		return 0;
	}
	
	/**
	 * Determina si la figura es un tri�ngulo
	 * @return True si la figura es un tri�ngulo
	 */
	public boolean esTriangulo() {
		//TODO: Completar el m�todo de acuerdo a la documentacion.
		return true;
	}
	
	/**
	 * Determina el tipo de tri�ngulo de acuerdo a la longitud de sus lados.
	 * Si la figura no es un tri�ngulo, retorna el tipo OTRO.
	 * @return Tipo de tri�ngulo seg�n sus lados. Si no es tri�ngulo, retorna Tipo.OTRO
	 */
	public Tipo determinarTipoTriangulo() {
		//TODO: Completar el m�todo de acuerdo a la documentaci�n.
		//      Antes de determinar qu� tipo de tri�ngulo es, debe determinar
		//      si la figura es un tri�ngulo. Puede usar el m�todo anterior.
		
		return null;
	}

	@Override
	/**
	 * M�todo toString() para la clase Figura.
	 */
	public String toString( ) {
		if ( esTriangulo( ) )
			return "La figura es un tri�ngulo " + determinarTipoTriangulo().toString() + " de per�metro " + calcularPerimetro() + ".\n"; 
		else
			return "La figura tiene " + getNumLados() + " lados y tiene un perimetro de " + calcularPerimetro()  + ".\n";
	}
	
	
}
