import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Ventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtCalle;
	private JTextField txtJhonDoe;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 589, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Datos del cliente");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setBounds(36, 101, 79, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 573, 71);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en java - NetBeans - ArrayList y POO");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(22, 11, 420, 20);
		panel.add(lblNewLabel);
		
		JLabel lblsinBaseDe = new JLabel("[Sin base de datos]");
		lblsinBaseDe.setForeground(Color.WHITE);
		lblsinBaseDe.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblsinBaseDe.setBounds(22, 40, 156, 20);
		panel.add(lblsinBaseDe);
		
		JLabel lblNewLabel_2_1 = new JLabel("Documento:");
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1.setBounds(56, 135, 59, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Dirección:");
		lblNewLabel_2_1_1.setOpaque(true);
		lblNewLabel_2_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1.setBounds(56, 173, 59, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Nombres:");
		lblNewLabel_2_1_1_1.setOpaque(true);
		lblNewLabel_2_1_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_1.setBounds(287, 135, 59, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Teléfono:");
		lblNewLabel_2_1_1_1_1.setOpaque(true);
		lblNewLabel_2_1_1_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_1_1.setBounds(287, 173, 59, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		textField = new JTextField();
		textField.setText("123456");
		textField.setBounds(125, 132, 113, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtCalle = new JTextField();
		txtCalle.setText("Calle 1 #123");
		txtCalle.setColumns(10);
		txtCalle.setBounds(125, 170, 113, 20);
		frame.getContentPane().add(txtCalle);
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setText("Jhon Doe");
		txtJhonDoe.setColumns(10);
		txtJhonDoe.setBounds(351, 132, 114, 20);
		frame.getContentPane().add(txtJhonDoe);
		
		textField_3 = new JTextField();
		textField_3.setText("5554433");
		textField_3.setColumns(10);
		textField_3.setBounds(351, 170, 114, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setBounds(28, 107, 505, 105);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Datos de factura");
		lblNewLabel_2_2.setOpaque(true);
		lblNewLabel_2_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_2.setBounds(38, 220, 86, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Nº Factura:");
		lblNewLabel_2_1_1_2.setOpaque(true);
		lblNewLabel_2_1_1_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2.setBounds(36, 255, 68, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("1");
		lblNewLabel_2_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_2_1.setOpaque(true);
		lblNewLabel_2_1_1_2_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_1.setBounds(114, 255, 21, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_2_2 = new JLabel("Fecha:");
		lblNewLabel_2_1_1_2_2.setOpaque(true);
		lblNewLabel_2_1_1_2_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_2.setBounds(317, 255, 39, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_2);
		
		JLabel lblNewLabel_2_1_1_2_1_1 = new JLabel("2021/50/21");
		lblNewLabel_2_1_1_2_1_1.setOpaque(true);
		lblNewLabel_2_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_2_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_1_1.setBounds(358, 255, 79, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_1.setBounds(28, 227, 505, 59);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\krip1\\Downloads\\ImgMenu.png"));
		lblNewLabel_3.setBounds(50, 307, 29, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1_1_2_3 = new JLabel("Ver listado de facturas");
		lblNewLabel_2_1_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1_2_3.setOpaque(true);
		lblNewLabel_2_1_1_2_3.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_3.setBounds(84, 312, 154, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_3);
		
		JLabel lblNewLabel_5 = new JLabel("Añadir");
		lblNewLabel_5.setBounds(379, 312, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\krip1\\Downloads\\ImgEliminar.png"));
		lblNewLabel_6.setBounds(435, 307, 30, 30);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\krip1\\Downloads\\imgAddd.png"));
		lblNewLabel_4.setBounds(337, 297, 39, 40);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5_1 = new JLabel("Eliminar");
		lblNewLabel_5_1.setBounds(474, 312, 46, 14);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_1_1.setBounds(28, 297, 505, 47);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Producto", "Cantidad", "Valor", "Sub Total"},
				{"Cereal", "5", "1000", "5000.0"},
				{"Agua", "2", "500", "1000.0"},
				{"Leche", "2", "300", null},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "Sub Total"
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(31);
		table.getColumnModel().getColumn(1).setMinWidth(31);
		table.getColumnModel().getColumn(2).setMinWidth(31);
		table.getColumnModel().getColumn(3).setPreferredWidth(70);
		table.getColumnModel().getColumn(3).setMinWidth(31);
		table.getColumnModel().getColumn(3).setMaxWidth(70);
		table.setBounds(28, 355, 505, 81);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel_2_1_1_2_3_1 = new JLabel("Subtotal:");
		lblNewLabel_2_1_1_2_3_1.setOpaque(true);
		lblNewLabel_2_1_1_2_3_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_3_1.setBounds(28, 452, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_3_1);
		
		JLabel lblNewLabel_2_1_1_2_3_1_1 = new JLabel("6600.0");
		lblNewLabel_2_1_1_2_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_2_3_1_1.setOpaque(true);
		lblNewLabel_2_1_1_2_3_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_3_1_1.setBounds(113, 452, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_3_1_1);
		
		JLabel lblNewLabel_2_1_1_2_3_1_2 = new JLabel("% Descuento:");
		lblNewLabel_2_1_1_2_3_1_2.setOpaque(true);
		lblNewLabel_2_1_1_2_3_1_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_3_1_2.setBounds(28, 477, 79, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_3_1_2);
		
		textField_1 = new JTextField();
		textField_1.setText("5");
		textField_1.setBounds(113, 474, 39, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(158, 473, 21, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2_1_1_2_3_1_2_1 = new JLabel("IVA 19%:");
		lblNewLabel_2_1_1_2_3_1_2_1.setOpaque(true);
		lblNewLabel_2_1_1_2_3_1_2_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_3_1_2_1.setBounds(28, 502, 59, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_3_1_2_1);
		
		JLabel lblNewLabel_2_1_1_2_3_1_1_1 = new JLabel("1251.0");
		lblNewLabel_2_1_1_2_3_1_1_1.setOpaque(true);
		lblNewLabel_2_1_1_2_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_2_3_1_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_3_1_1_1.setBounds(113, 502, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_3_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2_3_1_2_1_1 = new JLabel("Total factura:");
		lblNewLabel_2_1_1_2_3_1_2_1_1.setOpaque(true);
		lblNewLabel_2_1_1_2_3_1_2_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_3_1_2_1_1.setBounds(28, 527, 76, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_3_1_2_1_1);
		
		JLabel lblNewLabel_2_1_1_2_3_1_1_1_1 = new JLabel("7524.0");
		lblNewLabel_2_1_1_2_3_1_1_1_1.setOpaque(true);
		lblNewLabel_2_1_1_2_3_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_2_3_1_1_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_3_1_1_1_1.setBounds(113, 527, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_3_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2_3_1_2_2 = new JLabel("Valor descontado:");
		lblNewLabel_2_1_1_2_3_1_2_2.setOpaque(true);
		lblNewLabel_2_1_1_2_3_1_2_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_3_1_2_2.setBounds(197, 477, 103, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_3_1_2_2);
		
		JLabel lblNewLabel_2_1_1_2_3_1_1_2 = new JLabel("330.0");
		lblNewLabel_2_1_1_2_3_1_1_2.setOpaque(true);
		lblNewLabel_2_1_1_2_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_2_3_1_1_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_2_3_1_1_2.setBounds(310, 477, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_3_1_1_2);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setBounds(305, 556, 132, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(449, 556, 97, 23);
		frame.getContentPane().add(btnLimpiar);
	}
}
