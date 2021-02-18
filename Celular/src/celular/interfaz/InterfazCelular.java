package celular.interfaz;

import javax.swing.*;
import java.awt.*;

public class InterfazCelular extends JFrame {
	
	
	 // Creamos una suerte de matriz dentro de la interfaz
	// Dentro de esta matriz con 2 filas y 3 columnas
	/*
	 * Atributos
	 */
	
	JLabel nombre; // crea etiquetas dentro del panel
	JTextField cuadroDeTexto; // Crea cuadro de texto
	JButton boton; // crea un boton
	
	PanelBotones panel1;
	
	/*
	 * Constructor
	 */
	
	public InterfazCelular() {
		this.setLayout(new GridLayout(2,3));
		this.setBounds(200, 200, 300, 500);
		
		nombre = new JLabel("Katherine"); //  Creo el nombre y debo añadirlo a la ventana
		cuadroDeTexto = new JTextField(); // Creo el cuadro de texto
		//cuadroDeTexto.setSize( new Dimension(30,15));  // Para darle el tamaño al cuadro de texto
		// debo crear un nuev objeto de la clase Dimension la cual recibe entradas enteras
		
		
		//otras formas de cuadrar el tamaño
		Dimension d = new Dimension(300,150);
		cuadroDeTexto.setPreferredSize(d);
		
		boton = new JButton();
		panel1 = new PanelBotones();
		
		this.add(cuadroDeTexto);
		this.add(nombre); // Aquí lo añado a la ventana
		this.add(boton);
		this.add(panel1);
	}
	
	
	/*
	 * Métodos
	 */
	
	public static void main(String[] args) {
		InterfazCelular i = new InterfazCelular();
		i.setVisible(true);
		i.setTitle("Celular");
	}
	

}
