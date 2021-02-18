package interfaz;

import javax.swing.*;
import java.awt.*;

public class VentanaEmpleado extends JFrame{
	
	PanelPrincipal panel1;
	PanelBotones panel2;
	
	public VentanaEmpleado() {
		panel1 = new PanelPrincipal();
		panel2 = new PanelBotones();
		
		setTitle("Compañía");
		setSize(300, 300);
		setLocation(100,100);
		setLayout(new BorderLayout());
		
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.WEST);
		
		
	}

	
	public static void main(String[] args) {
		VentanaEmpleado ventana = new VentanaEmpleado();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}
}
