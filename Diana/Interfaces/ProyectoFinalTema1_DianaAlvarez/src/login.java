import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtContra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 236);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de usuario:");
		lblNewLabel.setBounds(49, 53, 116, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(49, 100, 116, 14);
		contentPane.add(lblContrasea);
		
		txtUser = new JTextField();
		txtUser.setBounds(175, 50, 135, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//escribir en el fichero login.txt user y pass
			}
		});
		btnRegistrarse.setBounds(63, 148, 101, 23);
		contentPane.add(btnRegistrarse);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//leer el fichero login.txt por lineas y comparar primera linea con user y segunda con pass
				//hacer lblAviso visible
				
				
				//si no coincide alguna de las dos cambiar el lblAviso por "Usuario o contraseña incorrectos"
				
				try {
					File fichero = new File("D:/fichero.txt"); //declarar fichero
					
					BufferedReader in = new BufferedReader(new FileReader(fichero));
					
					String linea;
					while ((linea = in.readLine()) != null) {
						System.out.println(linea);
					}
					
					in.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		/*while ((linea = in.readLine()) != null) {
						for (int i=0; i<2; i++) {
							if(i==0) {
								if(txtUser.getText().equals(linea)) {
									System.out.println("user "+linea);
								}else {
									System.out.println("user mal");
								}
							}
							if(i==1) {
								if(txtContra.getText().equals(linea)) {
									System.out.println("contra "+linea);
								}else {
									System.out.println("contra mal");
								}
							}
						}
		*/						
				
			}
		});
		btnAcceder.setBounds(188, 148, 101, 23);
		contentPane.add(btnAcceder);
		
		JLabel txtAviso = new JLabel("\u00A1Usuario nuevo registrado!");
		txtAviso.setForeground(Color.RED);
		txtAviso.setBounds(83, 11, 227, 14);
		contentPane.add(txtAviso);
		
		txtContra = new JPasswordField();
		txtContra.setBounds(175, 97, 135, 20);
		contentPane.add(txtContra);
	}
}
