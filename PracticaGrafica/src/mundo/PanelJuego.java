package mundo;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

public class PanelJuego extends JPanel {
	
	public PanelJuego() {
		setLayout(new GridLayout(5,5));
		setBorder(new LineBorder(Color.BLUE, 2));
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j< 5; j++) {
				// PanelCasilla casilla = newPanelCasilla(i+j)
				// add(casilla)
				
				JButton boton = new JButton("Botoni");
				add(boton);
			}
		}

	}
	

}
