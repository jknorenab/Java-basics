package celular.interfaz;

import javax.swing.*;
import java.awt.*;


public class PanelBotones extends JPanel {
	
	/*
	 * Atributos
	 */
	
	JButton boton1;
	JCheckBox miPrimerCheckBox;
	
	
	public PanelBotones() {
		this.setPreferredSize(new Dimension (30,30));
		this.setLayout(new GridLayout(2,2));
	
		
		boton1 = new JButton();
		miPrimerCheckBox = new JCheckBox();
		
		
		this.add(boton1);
		this.add(miPrimerCheckBox);
	}

}
