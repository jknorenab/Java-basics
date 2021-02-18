package mundo;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
	/*
	 * Atributos
	 */
	private JButton boton1;
	private JButton boton2;
	
	public VentanaPrincipal() {
		setSize(400, 500);
		setLocation(100, 100);
		BorderLayout borde = new BorderLayout();
		setLayout(borde);
		boton1 = new JButton("Boton 1");

		//Otra forma de darle nombre al boton
		//boton1.setText("Boton 1");
		
		boton1.addActionListener(this);
		boton2 = new JButton("Boton 2");
		
		Oyente o = new Oyente(); // Oyente hereda el constructor de la clase Object = Omnipresente, dios
		boton2.addMouseListener(o); // POngo adentro del paréntesis el objeto que está oyendo
		
		add(boton1, BorderLayout.WEST);
		add(boton2, BorderLayout.SOUTH);
	}
	
	// Para cuando yo oprimo el boton, si quiero que sea
	// cuando pase el mouse por encima debe ser otra interfaz la que se implementa
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Holita");
	}

	
	
	
	public static void main(String[] args) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
	}
}

class Oyente implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Dandole con toda");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


