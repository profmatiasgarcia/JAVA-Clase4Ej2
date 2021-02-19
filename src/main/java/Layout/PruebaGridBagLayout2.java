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

public class PruebaGridBagLayout2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		Container container = f.getContentPane();
		container.setLayout(new GridBagLayout());
		((JPanel) container).setBorder(BorderFactory.createTitledBorder("Prueba de GridBagLayout"));
		GridBagConstraints c = new GridBagConstraints();
		JToolBar toolbar = new JToolBar();
		for (int i = 0; i < 10; i++)
			toolbar.add(new JButton("<" + i + ">"));
		JScrollPane panelArbol = new JScrollPane(new JTree());
		panelArbol.setBorder(BorderFactory.createTitledBorder("Arbol"));
		JScrollPane panelLista = new JScrollPane(new JList());
		panelLista.setBorder(BorderFactory.createTitledBorder("Lista"));
		JTextField statusBar = new JTextField();
		statusBar.setEnabled(false);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1.0;
		c.weighty = 0.0;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = 1;
		container.add(new JToolBar(), c);
		c.fill = GridBagConstraints.NONE;
		c.insets = new Insets(2, 2, 6, 2);
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.anchor = GridBagConstraints.EAST;
		container.add(new JLabel("Servidor"), c);
		c.gridx = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		container.add(new JTextField(), c);
		c.gridx = 2;
		c.fill = GridBagConstraints.NONE;
		c.anchor = GridBagConstraints.EAST;
		container.add(new JLabel("Puerto"), c);
		c.gridx = 3;
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		container.add(new JTextField(), c);
		c.gridx = 4;
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = GridBagConstraints.RELATIVE;
		c.anchor = GridBagConstraints.EAST;
		container.add(new JLabel("Estado:"), c);
		c.gridx = 5;
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.anchor = GridBagConstraints.WEST;
		container.add(new JLabel("Desconectado"), c);
		c.gridx = 0;
		c.gridy = 2;
		c.weighty = 1.0;
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 2;
		c.gridheight = GridBagConstraints.RELATIVE;
		container.add(panelArbol, c);
		c.gridx = 2;
		c.gridwidth = GridBagConstraints.REMAINDER;
		container.add(panelLista, c);
		c.weighty = 0.0;
		c.gridx = 0;
		c.gridy = 3;
		c.gridheight = GridBagConstraints.REMAINDER;
		container.add(statusBar, c);
		f.setSize(800, 600);
		f.setTitle("Prueba de GridBagLayout");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
