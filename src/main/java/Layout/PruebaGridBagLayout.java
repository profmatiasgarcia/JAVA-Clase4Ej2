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

public class PruebaGridBagLayout {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		Container container = f.getContentPane();
		container.setLayout(new GridBagLayout());
		((JPanel) container).setBorder(BorderFactory.createTitledBorder("Entrada al sistema"));
		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 0.4;
		c.weighty = 1.0;
		c.gridwidth = GridBagConstraints.RELATIVE;
		c.gridheight = GridBagConstraints.RELATIVE;
		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.WEST;
		c.insets = new Insets(2, 5, 2, 0);
		container.add(new JLabel("Usuario"), c);
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = GridBagConstraints.RELATIVE;
		c.weightx = 1.0;
		c.insets = new Insets(2, 0, 2, 5);
		container.add(new JTextField(), c);
		c.gridwidth = GridBagConstraints.RELATIVE;
		c.gridheight = GridBagConstraints.REMAINDER;
		c.weightx = 0.4;
		c.insets = new Insets(2, 5, 2, 0);
		container.add(new JLabel("Contraseña"), c);
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = GridBagConstraints.REMAINDER;
		c.weightx = 1.0;
		c.insets = new Insets(2, 0, 2, 5);
		container.add(new JTextField(), c);
		f.setSize(220, 110);
		f.setTitle("Login");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}