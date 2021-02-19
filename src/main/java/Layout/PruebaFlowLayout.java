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

public class PruebaFlowLayout extends JFrame {

	public static void main(String[] args) {
		PruebaFlowLayout frame = new PruebaFlowLayout();
		JPanel panel = new JPanel();
		JButton boton1 = new JButton("botón 1");
		JButton boton2 = new JButton("Este es el botón 2");
		JButton boton3 = new JButton("botón 3");
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		frame.setContentPane(panel);
		frame.setSize(400, 150);
		frame.setTitle("Prueba de FlowLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
