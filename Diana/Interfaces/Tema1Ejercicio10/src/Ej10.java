import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;

public class Ej10 extends JFrame {

	private JPanel contentPane;
	public static JTable table;
	private JButton btnEliminar;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej10 frame = new Ej10();
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
	public Ej10() {
		setTitle("Tabla Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Apellidos", "Nombre", "Direccion", "Telefono"
			}
		));
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setMinWidth(18);
		table.setBounds(10, 30, 505, 198);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("A\u00F1adir fila");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AddFila af = new AddFila();
				af.setVisible(true);
			}
		});
		btnNewButton.setBounds(23, 239, 113, 23);
		contentPane.add(btnNewButton);
		
		btnEliminar = new JButton("Eliminar Fila/s Seleccionadas");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				//model.removeRow(table.getSelectedRow()); //eliminar solo una fila
				
				//Eliminar una o varias filas
				int[] numFilas = table.getSelectedRows();
				
				while(numFilas != null) {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnEliminar.setBounds(146, 239, 220, 23);
		contentPane.add(btnEliminar);
		
		btnGuardar = new JButton("Guardar Datos");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//faltaaaaaaaaaaaaaaaa
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt"));
					
					for (int i = 0; i <11; i++) {
						bw.write("");
					}
					
					bw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		});
		btnGuardar.setBounds(376, 239, 135, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(23, 11, 66, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(144, 11, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Direcci\u00F3n");
		lblNewLabel_2.setBounds(268, 11, 66, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tel\u00E9fono");
		lblNewLabel_3.setBounds(399, 11, 80, 14);
		contentPane.add(lblNewLabel_3);
		
		
		
		
		
		//ESTO ESTÁ EN EL CONSTRUCTOR PARA QUE SE AÑADA AL INICIAR
		
		Object [] fila = new Object[table.getModel().getColumnCount()]; //objeto fila con 4 columnas
		try {
			BufferedReader in = new BufferedReader(new FileReader("datos.txt"));
			String linea;
			
			while((linea = in.readLine()) != null) {  //si la linea leida no es null, seguir
				//leo nombre
				
				for (int i=0; i<fila.length; i++) {  //4 veces
					
					fila[i] = linea; 
					if(i<3) {	//para que no leea el ultimo dato y se pierda
						linea = in.readLine(); 
					}
				}
				 DefaultTableModel dt = (DefaultTableModel) table.getModel();
			     dt.addRow(fila);
			}
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}







