package interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelBotones extends JPanel {
	
	JButton boton1;
	JButton boton2;
	
	public PanelBotones() {
		boton1 = new JButton("Botón 1");
		boton2 = new JButton("Boton 2");
		
		setBackground(Color.GREEN);
		GridLayout gl = new GridLayout(1, 2);
		setLayout(gl);
		
		setVisible(true);
		
		
		add(boton1);
		add(boton2);
	}

}
