import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class ventanaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public ventanaRegistro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 360, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ventanaRegistro.class.getResource("/imagenes/icono.png")));
		lblNewLabel_2.setBounds(124, 22, 96, 96);
		contentPane.add(lblNewLabel_2);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(120, 338, 103, 23);
		contentPane.add(btnVolver);
		
		JButton btnRegistro = new JButton("Registrarse");
		btnRegistro.setBounds(120, 260, 103, 23);
		contentPane.add(btnRegistro);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nueva Contrase\u00F1a: ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setForeground(SystemColor.desktop);
		lblNewLabel_1_1.setBounds(38, 204, 122, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nuevo Usuario: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setBounds(38, 147, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(170, 144, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(170, 201, 86, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ventanaRegistro.class.getResource("/imagenes/fondoInicioSesion.jpg")));
		lblNewLabel.setBounds(0, 0, 344, 411);
		contentPane.add(lblNewLabel);
		setResizable(false);
		setLocationRelativeTo(null);
	}
}
