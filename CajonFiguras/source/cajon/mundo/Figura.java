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
	 * Construye por defecto un triangulo con color RGB negro con vértices fijos.
	 */
	public Figura ( ) {
		numLados = 3;
		colorFigura = new Color();
		
		//Primero, creo el array de puntos y le asigno tamaño
		puntos = new Punto[numLados];
		//Segundo, adiciono los puntos al array de acuerdo al número de lados.
		puntos[0] = new Punto(0,0);
		puntos[1] = new Punto(0,3);
		puntos[2] = new Punto(4,0);
		
		//En tercer lugar, creo el array de lados y le asigno tamaño.
		lados = new Lado[numLados];
		//Y en cuarto lugar, creo los lados de acuerdo a los puntos de la figura.
		lados[0] = new Lado(puntos[0], puntos[1]);
		lados[1] = new Lado(puntos[1], puntos[2]);
		lados[2] = new Lado(puntos[2], puntos[0]);
	}
	
	public Figura( int pNumLados, Punto[] pPuntos) {
		colorFigura = new Color();
		numLados = pNumLados;
		
		//Primero, creo el array de puntos y le asigno tamaño
		puntos = new Punto[numLados];
		//Segundo, adiciono los puntos al array de acuerdo al número de lados.
		puntos = pPuntos;
		//Tercero, creo el array de lados y le asigno tamaño
		lados = new Lado[numLados];
		//Cuarto, creo los lados de acuerdo a los puntos de la figura.
		//Asignando a cada uno de los lados dos puntos consecutivos por medio de un ciclo for
		//Para no tener conflicto con los índices al iniciar de nuevo el conteo, 
		// se usó el operador módulo %
		for (int i = 0; i < this.numLados; i++) {
			lados[i] = new Lado(puntos[i%numLados], puntos[(i+1)%numLados]);			
		}
	}
	
	//		Se crea un nuevo constructor que crea un triángulo
	// 		con parámetros numLados y las coordenadas de cada uno de los puntos.
		
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
	
	// Se crea un nuevo constructor de un triangulo con parámetros numLados y  los enteros de las coordenadas
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
	// Métodos
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
	 * Calcula el perímetro de una figura con la distancia euclideana 
	 * @return Perímetro de la figura
	 */
	public double calcularPerimetro() {
		//      Recuerde que cada uno de los lados tiene un método
		//		para calcular su longitud.
		double perimetro = 0.0;
		for(int i = 0; i < this.numLados; i++) {
			perimetro += lados[i].getLongitud();
		}
		return perimetro;
	}
	
	/**
	 * Determina si la figura es un triángulo
	 * @return True si la figura es un triángulo
	 */
	public boolean esTriangulo() {
		boolean triangulo = false;
		if(this.numLados == 3) triangulo = true;
		return triangulo;
	}
	
	/**
	 * Determina el tipo de triángulo de acuerdo a la longitud de sus lados.
	 * Si la figura no es un triángulo, retorna el tipo OTRO.
	 * @return Tipo de triángulo según sus lados. Si no es triángulo, retorna Tipo.OTRO
	 */
	public Tipo determinarTipoTriangulo() {
		//      Antes de determinar qué tipo de triángulo es, se determina
		//      si la figura es un triángulo, usando el método anterior.
		
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
	 * Método toString() para la clase Figura.
	 */
	public String toString( ) {
		// Nos permite imprimir características específicas del objeto. 
		return "La figura tiene " + getNumLados() + " lados" ;
	}

	@Override
	
	/**
	 * Método para comparar figuras según su perímetro
	 * @param Figura con la cual se quiere comparar
	 * @return Resta de los perímetros de las figuras en comparación
	 */
	// Aquí elegimos que la característica de las figuras con la cual queremos compararla es el perímetro
	//Este método arroja negativo si el perímetro de this.figura es mayor que el perímetro de la figura con que se quiere comparar
	// Arroja positivo si el perímetro del parámetro otro es más grande
	//O arroja cero si resultan iguales
	public int compareTo(Figura otro) {
		// Este método se generó automaticamente cuando añadimos:
		//implements Comparable al inicio de la clase Figura. 
		// Orden descendente
		// El int entre paréntesis convierte lo que la expresión 
		//double:(otro.calcularPerimetro() - this.calcularPerimetro()) a int 
		return (int) (otro.calcularPerimetro() - this.calcularPerimetro()); 
	}
	
	
}
