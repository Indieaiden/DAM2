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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField recibido;
	public static JTextField enviar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			private String texto;

			public void run() {
				try {
					DatosEntreVentanas2 frame = new DatosEntreVentanas2(texto);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param texto 
	 */
	public DatosEntreVentanas2(String texto) {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Texto recibido:");
		lblNewLabel.setBounds(44, 28, 97, 14);
		contentPane.add(lblNewLabel);
		
		recibido = new JTextField();
		recibido.setBounds(139, 25, 118, 20);
		contentPane.add(recibido);
		recibido.setColumns(10);
		
		//cambiar el texto del TextField
		recibido.setText(texto);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String textoNuevo = enviar.getText();
				DatosEntreVentanas.txtRecibido.setText(textoNuevo);
				
				dispose();
			}
		});
		btnNewButton.setBounds(98, 113, 89, 23);
		contentPane.add(btnNewButton);
		
		enviar = new JTextField();
		enviar.setBounds(139, 70, 118, 20);
		contentPane.add(enviar);
		enviar.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Texto a enviar:");
		lblNewLabel_2.setBounds(44, 73, 105, 14);
		contentPane.add(lblNewLabel_2);
	}
}