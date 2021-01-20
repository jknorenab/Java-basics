package mundo;

public class Animal {
	
	// Atributos
	
	private int edad; 
	private String nombreDuenho;
	private String color;
	
	
	//Constructor
	
	public Animal(String pNombreDuenho, int pEdad, String pColor) {
		this.edad = pEdad;
		this.nombreDuenho = pNombreDuenho;
		this.color = pColor;
	}
	
	

	//Métodos


	public String getDatos() {
		return "La edad del animal es " +this.edad + "y su color es " +this.color;
	}
	
	//Overload
	
	public String getDatos(String pcualidad) {
		return "La edad del animal es " +this.edad + "y su color es " +this.color + 
				"el nombre de su dueño es " +this.nombreDuenho + "y su cualidad es "+
				pcualidad; 
	}
	
	
	
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombreDuenho() {
		return nombreDuenho;
	}


	public void setNombreDuenho(String nombreDuenho) {
		this.nombreDuenho = nombreDuenho;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	

}
