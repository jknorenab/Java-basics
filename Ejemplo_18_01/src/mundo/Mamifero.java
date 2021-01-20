package mundo;

public class Mamifero extends Animal {
	// Atributos
	private String raza;
	
	
	// Constructor
	
	public Mamifero (String pNombreDuenho, int pEdad, String pColor, String pRaza) {
		super(pNombreDuenho, pEdad, pColor);
		this.raza = pRaza;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	

}
