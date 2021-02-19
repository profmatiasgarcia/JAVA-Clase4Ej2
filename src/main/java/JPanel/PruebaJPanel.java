package JPanel;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
import javax.swing.*;
import java.awt.*;

public class PruebaJPanel extends JFrame {
	public PruebaJPanel() {
		super("Añadir usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,150);
		// Panel de fecha
		JPanel panelFecha = new JPanel();
		panelFecha.setLayout(new FlowLayout());
		panelFecha.add(new JTextField(2));
		panelFecha.add(new JLabel("/"));
		panelFecha.add(new JTextField(2));
		panelFecha.add(new JLabel("/"));
		panelFecha.add(new JTextField(2));
		// Panel de datos
		JPanel panelDatos = new JPanel();
		GridLayout gl = new GridLayout(3, 2, 0, 5);
		panelDatos.setLayout(gl);
		panelDatos.add(new JLabel("Nombre:"));
		panelDatos.add(new JTextField(10));
		panelDatos.add(new JLabel("DNI:"));
		panelDatos.add(new JTextField(10));
		panelDatos.add(new JLabel("Fecha de nacimiento: "));
		panelDatos.add(panelFecha);
		// Panel de botones
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout());
		panelBotones.add(new JButton("Aceptar"));
		panelBotones.add(new JButton("Cancelar"));
		
                Container cp = getContentPane();
		cp.add(panelDatos, BorderLayout.CENTER);
		cp.add(panelBotones, BorderLayout.SOUTH);
	}

	public static void main(String args[]) {
		PruebaJPanel pj = new PruebaJPanel();
		pj.setVisible(true);
	}
}
