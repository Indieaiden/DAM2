import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddFila extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApell;
	private JTextField txtDir;
	private JTextField txtTelf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFila frame = new AddFila();
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
	public AddFila() {
		setTitle("Nuevo Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 338, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setBounds(38, 38, 66, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellidos = new JLabel("Apellidos: ");
		lblApellidos.setBounds(38, 74, 66, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(38, 115, 76, 14);
		contentPane.add(lblDireccin);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(38, 152, 76, 14);
		contentPane.add(lblTelfono);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(127, 35, 161, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApell = new JTextField();
		txtApell.setColumns(10);
		txtApell.setBounds(127, 71, 161, 20);
		contentPane.add(txtApell);
		
		txtDir = new JTextField();
		txtDir.setColumns(10);
		txtDir.setBounds(127, 112, 161, 20);
		contentPane.add(txtDir);
		
		txtTelf = new JTextField();
		txtTelf.setColumns(10);
		txtTelf.setBounds(127, 149, 161, 20);
		contentPane.add(txtTelf);
		
		JButton btnAdd = new JButton("A\u00F1adir");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Object [] fila = new Object[Ej10.table.getModel().getColumnCount()]; 
				        
				 fila[0] = txtNombre.getText();
				 fila[1] = txtApell.getText();
				 fila[2] = txtDir.getText();
				 fila[3] = txtTelf.getText();
				 
				 DefaultTableModel dt = (DefaultTableModel) Ej10.table.getModel();
			     dt.addRow(fila);
			     
			     txtNombre.setText("");
			     txtApell.setText("");
			     txtDir.setText("");
			     txtTelf.setText("");
			     
			}
		});
		btnAdd.setBounds(101, 192, 89, 23);
		contentPane.add(btnAdd);
	}
}
