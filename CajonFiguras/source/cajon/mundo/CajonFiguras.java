/**
 * 
 */
package cajon.mundo;

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
		double per = 0.0;
		int numLados = 0;
		int ciclo = 0;
		int posicion = 0;		
		for(Figura f: figuras) {
			if(f.calcularPerimetro()> per) {
				per = f.calcularPerimetro();
				numLados = f.getNumLados();
				posicion = ciclo;
				ciclo += 1;
			}
		}
		return "La figura con mayor perímetro tiene " +numLados +" lados, el valor de su perimetro es " +per +" y su posicion en la lista es " +posicion  ;
	}
	
	/**
	 * Determina la figura con mayor perímetro entre dos figuras dadas por
	 * parámetro.
	 * @param pFigura1, pFigura2 Figuras a comparar
	 * @return Número de lados, perímetro y número de figura (Figura 1 o Figura 2).
	 */
	public String figuraConMayorPerimetro ( Figura pFigura1, Figura pFigura2) {
		if ( figuras.isEmpty()) return "No hay figuras";
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
	
	
	//-----------------
	// Main del proyecto
	//-----------------
	
	/**
	 * Main del proyecto CajonFiguras.
	 * @param args No es necesario.
	 */
	public static void main(String[] args) {
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
		
	}

}
