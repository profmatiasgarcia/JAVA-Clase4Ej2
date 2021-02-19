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

public class PruebaOverlayLayout {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		Container container = f.getContentPane();
		container.setLayout(new OverlayLayout(container));
		((JPanel) container).setBorder(BorderFactory.createTitledBorder("Demo OverlayLayout"));
		JButton jbGrande = new JButton("Grande");
		JButton jbMediano = new JButton("Mediano");
		JButton jbPequeño = new JButton("Pequeño");
		jbGrande.setMaximumSize(new Dimension(400, 300));
		jbMediano.setMaximumSize(new Dimension(200, 150));
		jbPequeño.setMaximumSize(new Dimension(100, 75));
		container.add(jbPequeño);
		container.add(jbMediano);
		container.add(jbGrande);
		f.setSize(400, 300);
		f.setTitle("Prueba OverlayLayout");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
