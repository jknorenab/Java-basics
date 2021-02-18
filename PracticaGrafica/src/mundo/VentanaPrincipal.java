package mundo;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
	
	public VentanaPrincipal() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500,300);
		setLocation(100,200);
	
	
	/*
	 * Aquí ponemos el panel que va dentro de la ventana
	 */

		PanelJuego panel = new PanelJuego();
		add(panel);
	}

	
	public static void main(String[] args) {
		VentanaPrincipal ventana = new VentanaPrincipal();
	}
}
