/**
 * 
 */
package cajon.mundo;

/**
 * Clase que modela una figura.
 * @author Cristian David Herrera
 *
 */
public class Figura implements Comparable <Figura> {
	
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
		//Asignando a cada uno de los lados dos puntos consecutivos por medio de un ciclo for
		//Para no tener conflicto con los �ndices al iniciar de nuevo el conteo, 
		// se us� el operador m�dulo %
		for (int i = 0; i < this.numLados; i++) {
			lados[i] = new Lado(puntos[i%numLados], puntos[(i+1)%numLados]);			
		}
	}
	
	//		Se crea un nuevo constructor que crea un tri�ngulo
	// 		con par�metros numLados y las coordenadas de cada uno de los puntos.
		
	public Figura (int pNumLados, Punto pPunto1, Punto pPunto2, Punto pPunto3) {
		this.colorFigura = new Color();
		this.numLados = pNumLados;
		this.puntos = new Punto[this.numLados];
		this.puntos[0] = pPunto1;
		this.puntos[1] = pPunto2;
		this.puntos[2] = pPunto3;
		this.lados = new Lado[this.numLados];
		for (int i = 0; i < this.numLados; i++) {
			this.lados[i] = new Lado(this.puntos[i%this.numLados], this.puntos[(i+1)%this.numLados]);			
		}
	}
	
	// Se crea un nuevo constructor de un triangulo con par�metros numLados y  los enteros de las coordenadas
	public Figura(int pNumLados, int coord1, 
			int coord2, int coord3, int coord4, int coord5, int coord6) {
		this.colorFigura = new Color();
		this.numLados = pNumLados;
		this.puntos = new Punto[this.numLados];
		this.puntos[0] = new Punto(coord1, coord2);
		this.puntos[1] = new Punto(coord3, coord4);
		this.puntos[2] = new Punto(coord5, coord6);
		this.lados = new Lado[this.numLados];
		for (int i = 0; i < this.numLados; i++) {
			this.lados[i] = new Lado(this.puntos[i%this.numLados], this.puntos[(i+1)%this.numLados]);			
		}		
	}
	

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
		//      Recuerde que cada uno de los lados tiene un m�todo
		//		para calcular su longitud.
		double perimetro = 0.0;
		for(int i = 0; i < this.numLados; i++) {
			perimetro += lados[i].getLongitud();
		}
		return perimetro;
	}
	
	/**
	 * Determina si la figura es un tri�ngulo
	 * @return True si la figura es un tri�ngulo
	 */
	public boolean esTriangulo() {
		boolean triangulo = false;
		if(this.numLados == 3) triangulo = true;
		return triangulo;
	}
	
	/**
	 * Determina el tipo de tri�ngulo de acuerdo a la longitud de sus lados.
	 * Si la figura no es un tri�ngulo, retorna el tipo OTRO.
	 * @return Tipo de tri�ngulo seg�n sus lados. Si no es tri�ngulo, retorna Tipo.OTRO
	 */
	public Tipo determinarTipoTriangulo() {
		//      Antes de determinar qu� tipo de tri�ngulo es, se determina
		//      si la figura es un tri�ngulo, usando el m�todo anterior.
		
		Tipo fig = Tipo.OTRO;
		if(esTriangulo()) {
			if (lados[0].getLongitud() == lados[1].getLongitud() 
					&& lados[1].getLongitud() == lados[2].getLongitud()) fig = Tipo.EQUILATERO;
			else if (lados[0].getLongitud() != lados[1].getLongitud() 
					&& lados[1].getLongitud() != lados[2].getLongitud() 
					&& lados[2].getLongitud() != lados[0].getLongitud()) fig = Tipo.ESCALENO;
			else fig = Tipo.ISOSCELES;
		}		
		return fig;
	}

	@Override
	/**
	 * M�todo toString() para la clase Figura.
	 */
	public String toString( ) {
		// Nos permite imprimir caracter�sticas espec�ficas del objeto. 
		return "La figura tiene " + getNumLados() + " lados" ;
	}

	@Override
	
	/**
	 * M�todo para comparar figuras seg�n su per�metro
	 * @param Figura con la cual se quiere comparar
	 * @return Resta de los per�metros de las figuras en comparaci�n
	 */
	// Aqu� elegimos que la caracter�stica de las figuras con la cual queremos compararla es el per�metro
	//Este m�todo arroja negativo si el per�metro de this.figura es mayor que el per�metro de la figura con que se quiere comparar
	// Arroja positivo si el per�metro del par�metro otro es m�s grande
	//O arroja cero si resultan iguales
	public int compareTo(Figura otro) {
		// Este m�todo se gener� automaticamente cuando a�adimos:
		//implements Comparable al inicio de la clase Figura. 
		// Orden descendente
		// El int entre par�ntesis convierte lo que la expresi�n 
		//double:(otro.calcularPerimetro() - this.calcularPerimetro()) a int 
		return (int) (otro.calcularPerimetro() - this.calcularPerimetro()); 
	}
	
	
}
