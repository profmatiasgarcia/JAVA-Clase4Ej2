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

public class PruebaSpringLayout {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		Container container = f.getContentPane();
		JButton[] botones = new JButton[] { new JButton("botón 1"), new JButton("botón 2"),
				new JButton("un botón grande"), new JButton("botón 4") };
		SpringLayout layout = new SpringLayout();
		container.setLayout(layout);
		Spring xPad = Spring.constant(5);
		Spring ySpring = Spring.constant(5);
		Spring xSpring = xPad;
		Spring maxHeightSpring = Spring.constant(0);
		for (int i = 0; i < botones.length; i++) {
			container.add(botones[i]);
			SpringLayout.Constraints cons = layout.getConstraints(botones[i]);
			cons.setX(xSpring);
			xSpring = Spring.sum(xPad, cons.getConstraint("East"));
			cons.setY(ySpring);
			maxHeightSpring = Spring.max(maxHeightSpring, cons.getConstraint("South"));
		}
		SpringLayout.Constraints pCons = layout.getConstraints(container);
		pCons.setConstraint("East", xSpring);
		pCons.setConstraint("South", Spring.sum(maxHeightSpring, ySpring));
		f.setTitle("Prueba SpringLayout");
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
