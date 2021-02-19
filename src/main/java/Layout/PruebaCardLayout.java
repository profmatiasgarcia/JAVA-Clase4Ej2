package Layout;
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
import java.awt.event.*;

public class PruebaCardLayout extends JFrame {
	public static void main(String[] args) {
		PruebaCardLayout frame = new PruebaCardLayout();
		Container container = frame.getContentPane();
		JButton siguiente = new JButton("siguiente");
		container.add(siguiente, BorderLayout.NORTH);
		JLabel label1 = new JLabel("Componente 1");
		JLabel label2 = new JLabel("Componente 2");
		JLabel label3 = new JLabel("Componente 3");
		JLabel label4 = new JLabel("Componente 4");
		JPanel panelComponentes = new JPanel();
		CardLayout layout = new CardLayout();
		panelComponentes.setLayout(layout);
		panelComponentes.add(label1, "1");
		panelComponentes.add(label2, "2");
		panelComponentes.add(label3, "3");
		panelComponentes.add(label4, "4");
		container.add(panelComponentes, BorderLayout.CENTER);
		siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.next(panelComponentes);
			}
		});
		frame.setSize(400, 300);
		frame.setTitle("Prueba de CardLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}