package interfaz;

import javax.swing.*;
import java.awt.*;

import javax.swing.border.*;

public class PanelPrincipal extends JPanel{
	
	/*
	 *Atributos
	 */
	JTextArea texto;

	/*
	 * Constructor
	 */
	
	public PanelPrincipal(JTextArea texto) {
		super();
		this.texto = texto;
		inicializar();
	}
	
	public PanelPrincipal() {
		super();
		this.texto = new JTextArea();
		inicializar();
	}
	
	private void inicializar() {
		setBorder(new LineBorder(Color.RED));
		setSize(200,200);
		setLayout(new GridLayout(1,1));
		add(texto);
		setVisible(true);
	}
	

}
