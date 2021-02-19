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
import java.awt.*;
import javax.swing.*;

public class PruebaBoxLayout {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		Container container = f.getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
		((JPanel) container).setBorder(BorderFactory.createTitledBorder("Demo BoxLayout"));
		JPanel panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder("Panel1"));
		JPanel panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createTitledBorder("Panel2"));
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		for (int i = 0; i < 3; i++) {
			panel1.add(new JButton("Botón número " + i));
			panel2.add(new JButton("Botón número " + i));
		}
		container.add(panel1);
		container.add(panel2);
		f.setSize(350, 300);
		f.setTitle("Prueba BoxLayout");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
