package Componentes;
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
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JSeparator;

public class Ventanita extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField pwdAbc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanita frame = new Ventanita();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventanita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 352);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JLabel lblMenu = new JLabel("Menu");
		menuBar.add(lblMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane_1);

		JLabel lblJbutton = new JLabel("JButton");
		lblJbutton.setHorizontalAlignment(SwingConstants.CENTER);
		splitPane_1.setRightComponent(lblJbutton);

		JButton btnAceptar = new JButton("Aceptar");
		splitPane_1.setLeftComponent(btnAceptar);

		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane);

		textField = new JTextField();
		splitPane.setLeftComponent(textField);
		textField.setColumns(10);

		JLabel lblJtextfield = new JLabel("JTextField");
		lblJtextfield.setHorizontalAlignment(SwingConstants.CENTER);
		splitPane.setRightComponent(lblJtextfield);

		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane_2);

		JLabel lblJcombobox = new JLabel("JComboBox");
		lblJcombobox.setHorizontalAlignment(SwingConstants.CENTER);
		splitPane_2.setRightComponent(lblJcombobox);

		JComboBox comboBox = new JComboBox();
		splitPane_2.setLeftComponent(comboBox);

		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane_3);

		JLabel lblJlist = new JLabel("JCheckBox");
		lblJlist.setHorizontalAlignment(SwingConstants.CENTER);
		splitPane_3.setRightComponent(lblJlist);

		JCheckBox chckbxOpcion = new JCheckBox("Opcion 1");
		splitPane_3.setLeftComponent(chckbxOpcion);

		JSplitPane splitPane_4 = new JSplitPane();
		splitPane_4.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane_4);

		JRadioButton rdbtnOpcion = new JRadioButton("Opcion 2");
		splitPane_4.setLeftComponent(rdbtnOpcion);

		JLabel lblJradiobutton = new JLabel("JRadioButton");
		lblJradiobutton.setHorizontalAlignment(SwingConstants.CENTER);
		splitPane_4.setRightComponent(lblJradiobutton);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(separator);

		JSplitPane splitPane_7 = new JSplitPane();
		contentPane.add(splitPane_7);
		splitPane_7.setOrientation(JSplitPane.VERTICAL_SPLIT);

		pwdAbc = new JPasswordField();
		pwdAbc.setText("abc");
		splitPane_7.setLeftComponent(pwdAbc);

		JLabel lblJpassword = new JLabel("JPasswordField");
		splitPane_7.setRightComponent(lblJpassword);

		JSplitPane splitPane_6 = new JSplitPane();
		contentPane.add(splitPane_6);
		splitPane_6.setOrientation(JSplitPane.VERTICAL_SPLIT);

		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setMinimumSize(new Dimension(200, 0));
		scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
		splitPane_6.setLeftComponent(scrollBar_1);

		JLabel lblJscrollbar = new JLabel("         JScrollBar       ");
		lblJscrollbar.setHorizontalAlignment(SwingConstants.CENTER);
		splitPane_6.setRightComponent(lblJscrollbar);

		JSplitPane splitPane_5 = new JSplitPane();
		contentPane.add(splitPane_5);
		splitPane_5.setOrientation(JSplitPane.VERTICAL_SPLIT);

		JLabel lblTextoEtiqueta = new JLabel("Texto etiqueta");
		splitPane_5.setLeftComponent(lblTextoEtiqueta);

		JLabel lblJlabel = new JLabel("JLabel");
		lblJlabel.setHorizontalAlignment(SwingConstants.CENTER);
		splitPane_5.setRightComponent(lblJlabel);

		JList list = new JList();
		contentPane.add(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "item1", "item2", "item3", "JList" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});

		JSplitPane splitPane_8 = new JSplitPane();
		splitPane_8.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane_8);

		JTextArea txtrTexto = new JTextArea();
		txtrTexto.setText("Texto 1\nTexto 2");
		splitPane_8.setLeftComponent(txtrTexto);

		JLabel lblJtextarea = new JLabel("JTextArea");
		splitPane_8.setRightComponent(lblJtextarea);
	}
}
