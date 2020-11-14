package ej09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatosEntreVentanas2 extends JFrame {

	private JPanel contentPane;
	public static JTextField recibido;
	public static JTextField enviar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosEntreVentanas2 frame = new DatosEntreVentanas2();
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
	public DatosEntreVentanas2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recibido");
		lblNewLabel.setBounds(10, 28, 46, 14);
		contentPane.add(lblNewLabel);
		
		recibido = new JTextField();
		recibido.setBounds(66, 25, 86, 20);
		contentPane.add(recibido);
		recibido.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Aqu� van las acciones del evento boton
				DatosEntreVentanas.recibido.setText(DatosEntreVentanas2.enviar.getText());
				dispose();
			}
		});
		btnNewButton.setBounds(31, 66, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Mostrado");
		lblNewLabel_1.setBounds(10, 109, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		enviar = new JTextField();
		enviar.setBounds(66, 106, 86, 20);
		contentPane.add(enviar);
		enviar.setColumns(10);
	}
}
