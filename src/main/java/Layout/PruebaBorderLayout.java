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

public class PruebaBorderLayout extends JFrame {
	public static void main(String[] args) {
		PruebaBorderLayout frame = new PruebaBorderLayout();
		Container panel = frame.getContentPane();
		JButton norte = new JButton("Norte");
		JButton sur = new JButton("Sur");
		JButton este = new JButton("Este");
		JButton oeste = new JButton("Oeste");
		JButton centro = new JButton("Centro");
		panel.add(norte, BorderLayout.NORTH);
		panel.add(sur, BorderLayout.SOUTH);
		panel.add(este, BorderLayout.EAST);
		panel.add(oeste, BorderLayout.WEST);
		panel.add(centro, BorderLayout.CENTER);
		frame.setSize(400, 300);
		frame.setTitle("Prueba de BorderLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
