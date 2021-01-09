/**
 * 
 */
package cajon.mundo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import javax.swing.*;


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
		cargarFiguras(); 
		cargarTriangulos();
	}
	
	
	//----------------
	// Métodos
	//----------------
	
	// No es necesario crear métodos getter y setter en este caso.
	
	public ArrayList darFiguras() {
		return figuras;
	}
	
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
		
	private void cargarTriangulos () {
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
	
	/**
	 * Lee los datos de un archivo csv, 
	 * crea las figuras correspondientes y las añade al ArrayList de figuras
	 */
	
	// Los métodos de lectura no necesariamente deben ser públicos. Principio de encasuplación
	// Dado que, no es necesario que otras clases llamen este método. 
	
	private void cargarFiguras() {
		try {
			BufferedReader br = new BufferedReader( new FileReader("data/figuras.csv") );
			String linea;
			
			linea = br.readLine(); // Leí la primera línea
			while( linea != null) {
				String[] datos = linea.split(";");
				int numLados = Integer.parseInt(datos[0]);
				Punto[] puntos = new Punto[numLados];
				int posicion = 0;
				for (int i = 1; i < datos.length; i = i+2) {
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
	/**
	 * Este método crea un arreglo en el que las figuras están ordenadas de mayor a menor perímetro
	 * @return  String Mensaje con los valores de los tres mayores perímetros
	 */
	
	public String figurasConMayorPerimetro() {
		// Clona el vector figuras asegurándose que lo convierte en un array list
		// Esto para tener un arreglo de figuras ordenadas y uno con las figuras tal y cómo se cargaron
		// Es decir, no afectamos el original
		ArrayList<Figura> figurasOrdenadas = (ArrayList<Figura>) figuras.clone();
		//Ordeno las figuras según su perímetro. 
		// Este método, va a figura y le pregunta usted cómo compara? 
		//Para eso creamos el metodo compareTo en figura
		//Luego, con esa característica los ordena de mayor a menor y los añade al arreglo
		Collections.sort(figurasOrdenadas);
		//Collections.reverse(figuras); Para ordenarlos de menor a mayor
		// Obtenemos las primeras tres posiciones del array
		// Las cuales albergan los tres mayores perímetros
		String mensaje = figurasOrdenadas.get(0).calcularPerimetro() + "\n"; 
		// Al Añadir las comillas al final hacemos cast, convirtiendo double en string
		mensaje += figurasOrdenadas.get(1).calcularPerimetro() + "\n ";
		mensaje += figurasOrdenadas.get(2).calcularPerimetro() + "\n ";
		return mensaje;
	}

	
	// |8 |7|9  a>b, a<b a=b c>b 
 	
	//-----------------
	// Main del proyecto
	//-----------------
	
	/**
	 * Main del proyecto CajonFiguras.
	 * @param args No es necesario.
	 */
	public static void main(String[] args) {
		//Alguien dentro del main no puede llamar un método que sea privado.
		//Este main en particular, puede llamar los métodos privados porque está dentro del
		//mismo archivo en el que se definen los métodos privados. No debería hacerlo, pero puede.
		CajonFiguras cajon = new CajonFiguras();
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
		JOptionPane.showMessageDialog(null, "Holi :)");
		
		
	}

}
