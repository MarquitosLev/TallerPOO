import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.script.*;
import javax.swing.WindowConstants;
public class ventana extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField contrasenia;
	
	//PRINCIPAL
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Constructor que crea ventana
	public ventana() {
		ventanaInicio();
	}

	public void ventanaInicio() {
		setTitle("Iniciar Sesi\u00F3n\r\n");
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ventana.class.getResource("/imagenes/icono.png")));
		lblNewLabel_2.setForeground(SystemColor.desktop);
		lblNewLabel_2.setFont(new Font("Dubai", Font.BOLD, 19));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(124, 11, 96, 111);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(129, 189, 86, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(129, 133, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("\u00BFNo tiene una cuenta? \r\n");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(48, 363, 131, 14);
		contentPane.add(lblNewLabel);
		
		//FUNCIONARIO
		//Contrasenia
		contrasenia = new JPasswordField();
		contrasenia.setEchoChar('*');
		contrasenia.setBounds(129, 214, 86, 20);
		contentPane.add(contrasenia);
		
		//Usuario
		usuario = new JTextField();
		usuario.setBounds(129, 158, 86, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		/*Botones*/
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaRegistro frameReg = new ventanaRegistro();
				ventana.this.setVisible(false);//Pone invisible la ventana anterior
				frameReg.setVisible(true); //Pone visible la ventana de Registro
			}

		});
		btnRegistrarse.setBounds(189, 361, 108, 18);
		contentPane.add(btnRegistrarse);
		
		JButton btnNewButton = new JButton("Iniciar Sesi\u00F3n");
		btnNewButton.setBounds(111, 269, 121, 37);
		contentPane.add(btnNewButton);
		/*Botones*/
		
		
		//Fondo
		JLabel fondoIS = new JLabel("");
		fondoIS.setIcon(new ImageIcon(ventana.class.getResource("/imagenes/fondoInicioSesion.jpg")));
		fondoIS.setBounds(0, 0, 344, 411);
		contentPane.add(fondoIS);
		
	}

}
