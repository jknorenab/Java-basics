/**
 * 
 */
package cajon.mundo;

import java.util.*;

/**
 * Clase que modela un caj�n de figuras.
 * @author Cristian David Herrera
 *
 */
public class CajonFiguras {

	private ArrayList<Figura> figuras;
	
	//----------------
	// Constructor
	//----------------
	
	//TODO: Escribir el c�digo del constructor que genere el ArrayList figuras
	// vac�o. Se debe documentar. No debe recibir nada por par�metro.
	
	
	//----------------
	// M�todos
	//----------------
	
	//TODO: No es necesario crear m�todos getter y setter en este caso.
	
	/**
	 * Determina la figura con mayor per�metro dentro del ArrayList figuras.
	 * @return N�mero de lados, per�metro y posici�n dentro del ArrayList.
	 */
	public String figuraConMayorPerimetro ( ) {
		//TODO: Completar el m�todo de acuerdo a la documentaci�n.
		return " ";
	}
	
	/**
	 * Determina la figura con mayor per�metro entre dos figuras dadas por
	 * par�metro.
	 * @param pFigura1, pFigura2 Figuras a comparar
	 * @return N�mero de lados, per�metro y n�mero de figura (Figura 1 o Figura 2).
	 */
	public String figuraConMayorPerimetro ( Figura pFigura1, Figura pFigura2) {
		//TODO: Completar el m�todo de acuerdo a la documentaci�n.
		return "";
	}
	
	/**
	 * Calcula la cantidad de figuras que hay en el ArrayList figuras.
	 * @return N�mero de figuras.
	 */
	public int calcularNumFiguras() {
		//TODO: Completar el m�todo de acuerdo a la documentaci�n.
		return 0;
	}
	
	/**
	 * Calcula la cantidad de figuras de n�mero de lados dado por par�metro
	 * que hay en el ArrayList figuras 
	 * @param pNumLados N�mero de lados de las figuras que se buscan
	 * @return N�mero de figuras.
	 */
	public int calcularNumFiguras(int pNumLados) {
		//TODO: Completar el m�todo de acuerdo a la documentaci�n.
		return 0;
	}
	
	/**
	 * Adiciona una figura al ArrayList figuras.
	 * @param pFigura Figura a adicionar
	 */
	public void adicionarFigura ( Figura pFigura) {
		//TODO: Completar el m�todo de acuerdo a la documentaci�n.
	}
	
	/**
	 * Adiciona una figura al ArrayList figuras.
	 * @param pNumLados N�mero de lados de la figura a adicionar
	 * @param puntos Array primitivo con la lista de v�rtices de la figura. Debe coincidir con el n�mero de lados de la figura
	 */
	public void adicionarFigura (int pNumLados, Punto[] puntos) {
		//TODO: Completar el m�todo de acuerdo a la documentaci�n.
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
		Figura figura1 = new Figura();
		
	}

}
