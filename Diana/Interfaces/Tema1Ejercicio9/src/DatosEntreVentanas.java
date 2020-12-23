
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatosEntreVentanas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField txtEnviar;
	public static JTextField txtRecibido;
	public static String texto;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosEntreVentanas frame = new DatosEntreVentanas();
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
	public DatosEntreVentanas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Texto a enviar:");
		lblNewLabel.setBounds(32, 28, 105, 14);
		contentPane.add(lblNewLabel);
		
		txtEnviar = new JTextField();
		txtEnviar.setBounds(154, 25, 114, 20);
		contentPane.add(txtEnviar);
		txtEnviar.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				texto = txtEnviar.getText();
				DatosEntreVentanas2 ventana2 = new DatosEntreVentanas2(texto);
				ventana2.setVisible(true);

				//DatosEntreVentanas2.recibido.setText(texto);
			}
		});
		btnNewButton.setBounds(85, 66, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Texto recibido:");
		lblNewLabel_1.setBounds(32, 109, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		txtRecibido = new JTextField();
		txtRecibido.setBounds(154, 106, 114, 20);
		contentPane.add(txtRecibido);
		txtRecibido.setColumns(10);
	}
}