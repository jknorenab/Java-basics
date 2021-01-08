/**
 * 
 */
package cajon.mundo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


/**
 * Clase que modela un cajón de figuras.
 * @author Cristian David Herrera
 *
 */
public class CajonFiguras {

	private ArrayList<Figura> figuras;
	
	//----------------
	// Constructor
	//----------------
	/**
	 * Esta clase modela un cajon donde se almacenan figuras con distintas características
	 */
	
	public CajonFiguras() {
		// El constructo de la calse genera un ArrayList de figuras  vacío, sin recibir nada por parámetro
		figuras = new ArrayList<Figura>();
	}
	
	
	//----------------
	// Métodos
	//----------------
	
	// No es necesario crear métodos getter y setter en este caso.
	
	/**
	 * Determina la figura con mayor perímetro dentro del ArrayList figuras.
	 * @return Número de lados, perímetro y posición dentro del ArrayList.
	 */
	public String figuraConMayorPerimetro ( ) {
		if ( figuras.isEmpty()) return "No hay figuras";
		double per = 0.0;
		int numLados = 0;
		int ciclo = 0;
		int posicion = 0;		
		for(Figura f: figuras) {
			if(f.calcularPerimetro()> per) {
				per = f.calcularPerimetro();
				numLados = f.getNumLados();
				posicion = ciclo;
			}
			ciclo += 1;
		}
		return "La figura con mayor perímetro tiene " +numLados +" lados, el valor de su perimetro es " +per +" y su posicion en la lista es " +posicion  ;
	}
	
		/**
		 * Determina la figura con menor perímetro en el Arreglo de figuras.
		 * @return Número de lados, perímetro y posición dentro del ArrayList. 
		 */
		
		public String figuraConMenorPerimetro () {
			if ( figuras.isEmpty()) return "No hay figuras";
			double per = figuras.get(0).calcularPerimetro();
			int numLados = figuras.get(0).getNumLados();
			int ciclo = 0;
			int posicion = 0;		
			for(Figura f: figuras) {
				if(f.calcularPerimetro() < per) {
					per = f.calcularPerimetro();
					numLados = f.getNumLados();
					posicion = ciclo;
				}
				ciclo += 1;
			}	
			return "La figura con menor perimetro tiene " +numLados + "lados, el valor de su perimetro es " +per + " y se encuentra en la posición " +posicion;
		}
		
	
	/**
	 * Determina la figura con mayor perímetro entre dos figuras dadas por
	 * parámetro.
	 * @param pFigura1, pFigura2 Figuras a comparar
	 * @return Número de lados, perímetro y número de figura (Figura 1 o Figura 2).
	 */
	public String figuraConMayorPerimetro ( Figura pFigura1, Figura pFigura2) {
		double per = 0.0;
		int numlados = 0;
		if(pFigura1.calcularPerimetro() != pFigura2.calcularPerimetro()) {
			if(pFigura1.calcularPerimetro()>pFigura2.calcularPerimetro()) {
				per = pFigura1.calcularPerimetro();
				numlados = pFigura1.getNumLados();
				return " La figura 1, con número de lados " +numlados+ " tiene el mayor perimetro, de valor " +per;
			}else {
				per = pFigura2.calcularPerimetro();
				numlados = pFigura2.getNumLados();
				return " La figura 2, con número de lados " +numlados+ " tiene el mayor perimetro, de valor " +per;
			}
		} else {
			per = pFigura1.calcularPerimetro();
			return "Las figuras tienen el mismo perímetro de valor" +per;
		}
	}
	
	
	/**
	 * Calcula la cantidad de figuras que hay en el ArrayList figuras.
	 * @return Número de figuras.
	 */
	public int calcularNumFiguras() {
		int ciclo = 0;
		for(Figura f: figuras) {
			ciclo += 1;
			}
		return ciclo;
	}
	
	/**
	 * Calcula la cantidad de figuras de número de lados dado por parámetro
	 * que hay en el ArrayList figuras 
	 * @param pNumLados Número de lados de las figuras que se buscan
	 * @return Número de figuras.
	 */
	public int calcularNumFiguras(int pNumLados) {
		int fig = 0;
		for(Figura f: figuras) {
			if(f.getNumLados() == pNumLados) fig += 1;
		}
		return fig;
		}
	
	/**
	 * Determina el número de figuras que tienen mayor perímetro al dado por parámetro
	 * @param pPerimetroQuerido Perimetro mínimo que se quiere evaluar
	 * 
	 * @return Número de figuras con la característica solicitada
	 * 
	 */
	
	public int contarFigurasConPerimetroMayorA (double pPerimetroQuerido) {
		int contador = 0;
		for(Figura f: figuras) {
			if(f.calcularPerimetro() > pPerimetroQuerido) contador += 1;
		}
		return contador;
	}
	
	
	/**
	 * Adiciona una figura al ArrayList figuras.
	 * @param pFigura Figura a adicionar
	 */
	public void adicionarFigura ( Figura pFigura) {
		figuras.add(pFigura);		
	}
	
	/**
	 * Adiciona una figura al ArrayList figuras.
	 * @param pNumLados Número de lados de la figura a adicionar
	 * @param puntos Array primitivo con la lista de vértices de la figura. Debe coincidir con el número de lados de la figura
	 */
	public void adicionarFigura (int pNumLados, Punto[] puntos) {
		Figura nueva = new Figura(pNumLados, puntos);
		figuras.add(nueva);
		}
	
	/**
	 * Método para cargar la información del archivo triangulos.csv
	 */
		
	public void cargarTriangulos () {
		try {
			BufferedReader br = new BufferedReader( new FileReader("data/triangulos.csv") );
			String linea;
			
			linea = br.readLine(); // Leí la primera línea
			while( linea != null) {
				String[] datos = linea.split(";");  
				//¿¿¿En la línea anterio se está haciendo a la vez: 
				//Crear el arreglo y rellenarlo conlos datos separados por comas???
				//Poruqué no tenemos que darle tamaño como sí hacemos con la siguiente línea???
				int[] params = new int[7]; 
				// Como todos los datos son enteros convierto los strings a enteros con un for 
				//y los voy guardando en un arreglo params, de tamaño específico pues
				// ya sabemos que son triangulos
				for(int i = 0; i < 7; i++) {
					params[i] = Integer.parseInt(datos[i]);
				}
				Figura t = new Figura(params[0], params[1], params[2],params[3], params[4], params[5], params[6] );
				adicionarFigura(t);		
				linea = br.readLine(); //Lee la siguiente linea
			}
		} catch (Exception excepcion) {
			System.out.println("Hubo error en la carga de datos");
		}	
		
	}
	
	public void cargarFiguras() {
		try {
			BufferedReader br = new BufferedReader( new FileReader("data/figuras.csv") );
			String linea;
			
			linea = br.readLine(); // Leí la primera línea
			while( linea != null) {
				String[] datos = linea.split(";");
				int numLados = Integer.parseInt(datos[0]);
				Punto[] puntos = new Punto[numLados];
				int posicion = 0;
				for (int i = 1; i <= datos.length; i = i+2) {
					int x = Integer.parseInt(datos[i]);
					int y = Integer.parseInt(datos[i+1]);
					Punto coord = new Punto(x,y);
					puntos[posicion] = coord;
					posicion += 1;
				}
				Figura t = new Figura( numLados, puntos);
				adicionarFigura(t);		
				linea = br.readLine(); //Lee la siguiente linea
			}
		} catch (Exception excepcion) {
			System.out.println("Hubo error en la carga de datos");
		}	
		
	}
	
	
	
	//-----------------
	// Main del proyecto
	//-----------------
	
	/**
	 * Main del proyecto CajonFiguras.
	 * @param args No es necesario.
	 */
	public static void main(String[] args) {
		CajonFiguras cajon = new CajonFiguras();
		cajon.cargarTriangulos();
		cajon.cargarFiguras();
		System.out.println(cajon.figuraConMayorPerimetro());
		Figura figura1 = new Figura();
		System.out.println(figura1);
		cajon.adicionarFigura(figura1);
		figura1 = new Figura(3, 0,0, 0, 5, 5,0);
		System.out.println(figura1);
		cajon.adicionarFigura(figura1);
		figura1 = new Figura(3, 0,3,6,-3,-2,-5);
		System.out.println(figura1);
		cajon.adicionarFigura(figura1);
		System.out.println("Hay " + cajon.calcularNumFiguras() + " figuras.");
		System.out.println(cajon.figuraConMayorPerimetro());
		System.out.println(cajon.figuraConMenorPerimetro());
		
		
	}

}
