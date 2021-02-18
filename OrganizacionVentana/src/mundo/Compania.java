package mundo;

import java.util.*;

public class Compania {
	
	private List<Ventana> listaEmpleados;

	private String nombre;
	private long nit;
	
	public Compania(String nombre) {
		listaEmpleados = new ArrayList<Ventana>();
		nit = 1;
		this.nombre = nombre; 
		
		
	}

}
