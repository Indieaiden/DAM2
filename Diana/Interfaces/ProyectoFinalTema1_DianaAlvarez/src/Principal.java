import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JSlider;
import java.awt.Label;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txtNombre;
	private JTextField txtApell;
	private JTextField txtDir;
	private JTextField txtTelf;
	private JPanel panelAddAlumno;
	private JTable tablaAlumnos;
	private JComboBox<?> comboBoxProfes;
	private JPanel panelListadoAlumnos;
	private JTextField txtNumAula;
	private JTextField txtTamano;
	private JTextField txtVentilacion;
	private JPanel panelAddAula;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rbAddAula;
	private JRadioButton rbDeleteAula;
	private JLabel lblVent;
	private JLabel lblTamano;
	private JLabel lblNumAula;
	private JButton btnGuardar_Aulas;
	private JLabel lblNum;
	private JLabel lblNombre;
	private JLabel lblApell;
	private JLabel lblDir;
	private JLabel lblTelf;
	private JLabel lblDireccin;
	private JLabel lblTelfono;
	private JPanel panelAddProfesor;
	private JLabel lblNumProf;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField txtNumProf;
	private JTextField txtNombreProf;
	private JTextField txtDirProf;
	private JTextField txtApellProf;
	private JTextField txtTelfProf;
	private JPanel panelListadoAulas;
	private JTable tablaListadoAulas;
	private JComboBox<String> comboBoxAula;
	private JTable tablaListadoProf;
	private JPanel panelListadoProfesores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 308);
		
			
		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("Aulas");
		menuBar_1.add(mnNewMenu);
		
		JMenuItem listaAulas = new JMenuItem("Listado");			//hacer visible panel Listado Aulas
		listaAulas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelAddAula.setVisible(false);
				panelAddAlumno.setVisible(false);
				panelListadoAlumnos.setVisible(false);
				panelAddProfesor.setVisible(false);
				panelListadoAulas.setVisible(true);
			}
		});
		mnNewMenu.add(listaAulas);
		
		JMenuItem modifAula = new JMenuItem("Modificar");
		modifAula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
			}
		});
		
		JMenuItem mntmNewMenuItem = new JMenuItem("A\u00F1adir/Eliminar");		////hacer visible panel Añadir Aulas
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//poner todos los paneles sin visibilidad
				panelAddAlumno.setVisible(false);
				panelAddProfesor.setVisible(false);
				panelListadoAlumnos.setVisible(false);
				panelListadoAulas.setVisible(false);
				panelListadoProfesores.setVisible(false);
				panelAddAula.setVisible(true);
				
				if(rbAddAula.isSelected() == true) {			//hacer visible todo si el roundButton Añadir está seleccionado
					
					lblNumAula.setVisible(true);
					lblTamano.setVisible(true);
					lblVent.setVisible(true);
					txtNumAula.setVisible(true);
					txtTamano.setVisible(true);
					txtVentilacion.setVisible(true);
					btnGuardar_Aulas.setVisible(true);
					
				}
				if (rbDeleteAula.isSelected() == true){			//poner enable varias cosas
					
					lblNumAula.setVisible(true);
					lblTamano.setVisible(true);
					lblVent.setVisible(true);
					txtNumAula.setVisible(true);
					txtTamano.setVisible(true);
					txtVentilacion.setVisible(true);
					btnGuardar_Aulas.setVisible(true);
					
					txtTamano.setEnabled(false);	
					txtVentilacion.setEnabled(false);
				}
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		mnNewMenu.add(modifAula);
		
		JMenu mnNewMenu_2 = new JMenu("Profesores");
		menuBar_1.add(mnNewMenu_2);
		
		JMenuItem listaProf = new JMenuItem("Listado");								//hacer visible panel Listado Profesores
		listaProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panelAddAula.setVisible(false);
				panelAddAlumno.setVisible(false);
				panelListadoAlumnos.setVisible(false);
				panelListadoAulas.setVisible(false);
				panelAddProfesor.setVisible(false);
				panelListadoProfesores.setVisible(true);
				
				
			}
		});
		mnNewMenu_2.add(listaProf);
		
		JMenuItem modifProf = new JMenuItem("Modificar");
		modifProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
			}
		});
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("A\u00F1adir/Eliminar");		//hacer visible panel de añadir profesores
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelAddAula.setVisible(false);
				panelAddAlumno.setVisible(false);
				panelListadoAlumnos.setVisible(false);
				panelListadoAulas.setVisible(false);
				panelListadoProfesores.setVisible(false);
				panelAddProfesor.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_1);
		mnNewMenu_2.add(modifProf);
		
		JMenu mnNewMenu_2_1 = new JMenu("Alumnos");
		menuBar_1.add(mnNewMenu_2_1);
		
		JMenuItem listaAlum = new JMenuItem("Listado");								//hacer visible panel Listado Alumnos
		listaAlum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				panelAddAula.setVisible(false);
				panelAddAlumno.setVisible(false);
				panelAddProfesor.setVisible(false);
				panelListadoAulas.setVisible(false);
				panelListadoProfesores.setVisible(false);
				panelListadoAlumnos.setVisible(true);
			}
		});
		mnNewMenu_2_1.add(listaAlum);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("A\u00F1adir/Eliminar");		//hacer visible panel de añadir alumnos
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				panelAddAula.setVisible(false);
				panelListadoAlumnos.setVisible(false);
				panelAddProfesor.setVisible(false);
				panelListadoAulas.setVisible(false);
				panelListadoProfesores.setVisible(false);
				panelAddAlumno.setVisible(true);
			}
		});
		mnNewMenu_2_1.add(mntmNewMenuItem_2);
		
		JMenuItem modifAlum = new JMenuItem("Modificar");
		modifAlum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
			}
		});
		mnNewMenu_2_1.add(modifAlum);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelAddAlumno = new JPanel();
		panelAddAlumno.setBounds(0, 0, 513, 223);
		contentPane.add(panelAddAlumno);
		panelAddAlumno.setLayout(null);
		panelAddAlumno.setVisible(false);
		
		lblNum = new JLabel("N\u00BA alumno:");
		lblNum.setBounds(36, 70, 102, 14);
		panelAddAlumno.add(lblNum);
		
		txtid = new JTextField();
		txtid.setBounds(127, 67, 110, 20);
		panelAddAlumno.add(txtid);
		txtid.setColumns(10);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(36, 110, 82, 14);
		panelAddAlumno.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(127, 107, 110, 20);
		panelAddAlumno.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblApell = new JLabel("Apellidos:");
		lblApell.setBounds(266, 110, 77, 14);
		panelAddAlumno.add(lblApell);
		
		txtApell = new JTextField();
		txtApell.setBounds(331, 107, 110, 20);
		panelAddAlumno.add(txtApell);
		txtApell.setColumns(10);
		
		lblDir = new JLabel("Direccion:");
		lblDir.setBounds(36, 147, 102, 14);
		panelAddAlumno.add(lblDir);
		
		txtDir = new JTextField();
		txtDir.setBounds(127, 144, 110, 20);
		panelAddAlumno.add(txtDir);
		txtDir.setColumns(10);
		
		lblTelf = new JLabel("Tel\u00E9fono:");
		lblTelf.setBounds(266, 147, 77, 14);
		panelAddAlumno.add(lblTelf);
		
		txtTelf = new JTextField();
		txtTelf.setBounds(331, 144, 110, 20);
		panelAddAlumno.add(txtTelf);
		txtTelf.setColumns(10);
		
		comboBoxProfes = new JComboBox();
		comboBoxProfes.setModel(new DefaultComboBoxModel(new String[] {"1"}));
		comboBoxProfes.setBounds(159, 190, 130, 22);
		panelAddAlumno.add(comboBoxProfes);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(352, 190, 110, 23);
		panelAddAlumno.add(btnGuardar);
		
		JLabel txtAsignar = new JLabel("Profesor asignado:");
		txtAsignar.setBounds(35, 194, 138, 14);
		panelAddAlumno.add(txtAsignar);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
				if(slider.getValue()==0) {					//Slider en añadir ALUMNOS
					
					lblNombre.setEnabled(true);
					txtNombre.setEnabled(true);
					lblApell.setEnabled(true);
					txtApell.setEnabled(true);
					lblDir.setEnabled(true);
					txtDir.setEnabled(true);
					lblTelf.setEnabled(true);
					txtTelf.setEnabled(true);
					txtAsignar.setEnabled(true);
					comboBoxProfes.setEnabled(true);
					
				}else {										//Slider en eliminar
					lblNombre.setEnabled(false);
					txtNombre.setEnabled(false);
					lblApell.setEnabled(false);
					txtApell.setEnabled(false);
					lblDir.setEnabled(false);
					txtDir.setEnabled(false);
					lblTelf.setEnabled(false);
					txtTelf.setEnabled(false);
					txtAsignar.setEnabled(false);
					comboBoxProfes.setEnabled(false);
				}
			}
		});
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		slider.setMaximum(1);
		slider.setValue(0);
		slider.setPaintTicks(true);
		slider.setBounds(159, 22, 130, 26);
		panelAddAlumno.add(slider);
		
		Label label = new Label("A\u00F1adir");
		label.setBounds(112, 22, 72, 22);
		panelAddAlumno.add(label);
		
		Label label_1 = new Label("Eliminar");
		label_1.setBounds(308, 22, 72, 22);
		panelAddAlumno.add(label_1);
		
		panelListadoAlumnos = new JPanel();
		panelListadoAlumnos.setBounds(0, 0, 503, 210);
		contentPane.add(panelListadoAlumnos);
		panelListadoAlumnos.setLayout(null);
		panelListadoAlumnos.setVisible(false);
		
		tablaAlumnos = new JTable();
		tablaAlumnos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00BA", "Nombre", "Apellidos", "Direcci\u00F3n", "Tel\u00E9fono"
			}
		));
		tablaAlumnos.setBounds(37, 56, 344, 84);
		panelListadoAlumnos.add(tablaAlumnos);
		
		JLabel lblNewLabel = new JLabel("N\u00BA Alumno");
		lblNewLabel.setBounds(41, 36, 69, 14);
		panelListadoAlumnos.add(lblNewLabel);
		
		JLabel lblNombre_2 = new JLabel("Nombre");
		lblNombre_2.setBounds(106, 36, 69, 14);
		panelListadoAlumnos.add(lblNombre_2);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(174, 36, 77, 14);
		panelListadoAlumnos.add(lblApellidos);
		
		lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(245, 36, 77, 14);
		panelListadoAlumnos.add(lblDireccin);
		
		lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(316, 36, 77, 14);
		panelListadoAlumnos.add(lblTelfono);
		
		panelAddAula = new JPanel();
		panelAddAula.setBounds(1, 11, 495, 190);
		contentPane.add(panelAddAula);
		panelAddAula.setLayout(null);
		panelAddAula.setVisible(false);
		
		lblNumAula = new JLabel("N\u00BA aula:");
		lblNumAula.setBounds(32, 77, 73, 14);
		panelAddAula.add(lblNumAula);
		
		lblTamano = new JLabel("Tama\u00F1o:");
		lblTamano.setBounds(32, 117, 83, 14);
		panelAddAula.add(lblTamano);
		
		lblVent = new JLabel("Ventilaci\u00F3n:");
		lblVent.setBounds(259, 117, 83, 14);
		panelAddAula.add(lblVent);
		
		txtNumAula = new JTextField();
		txtNumAula.setText("");
		txtNumAula.setBounds(104, 74, 124, 20);
		panelAddAula.add(txtNumAula);
		txtNumAula.setColumns(10);
		
		txtTamano = new JTextField();
		txtTamano.setText("");
		txtTamano.setColumns(10);
		txtTamano.setBounds(104, 114, 124, 20);
		panelAddAula.add(txtTamano);
		
		txtVentilacion = new JTextField();
		txtVentilacion.setText("");
		txtVentilacion.setColumns(10);
		txtVentilacion.setBounds(336, 114, 124, 20);
		panelAddAula.add(txtVentilacion);
		
		
		
		
		btnGuardar_Aulas = new JButton("GUARDAR");												//AÑADIR Y ELIMINAR AULAS
		btnGuardar_Aulas.addActionListener(new ActionListener() {
			private Aula aula;
			public void actionPerformed(ActionEvent arg0) {
				
				if(rbAddAula.isSelected() == true) {			//Añadir
					
					//objeto Aula
					String num = txtNumAula.getText();
					String tam = txtTamano.getText();
					String vent = txtVentilacion.getText();
					aula = new Aula(num, tam, vent, true);
					
					
					//escribir en el fichero
					try {																
						BufferedWriter bw=new BufferedWriter(new FileWriter("aulas.txt", true));
						 //true = añadir texto al final de un fichero ya existente (sin crear uno nuevo ni borrar su contenido)
						
						bw.write(aula.getNumAula()+ "\n");
						bw.write(aula.getTamano()+ "\n");
						bw.write(aula.getVentilacion()+ "\n");
						
						bw.close();
						
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					//Añadir datos a la tabla listado
					Object [] fila = new Object[tablaListadoAulas.getModel().getColumnCount()]; 	
					 fila[0] = num;
					 fila[1] = tam;
					 fila[2] = vent;
					 DefaultTableModel dt = (DefaultTableModel) tablaListadoAulas.getModel();
				     dt.addRow(fila);
					
					//añadir el aula al comboBox de Profesores
					comboBoxAula.addItem(aula.getNumAula());
					
					//vaciar las casillas
				     txtNumAula.setText("");
				     txtTamano.setText("");
				     txtVentilacion.setText("");
				     
				     
				}else if(rbDeleteAula.isSelected() == true){		//Eliminar
					//string con numero de aula a eliminar
					String AulaAEliminar = txtNumAula.getText();
					
					aula.getNumAula();
					
					//fichero temporal para almacenar los datos
					File inFile = new File("aulas.txt");
					File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
					
					try {																
						BufferedReader br = new BufferedReader(new FileReader("aulas.txt"));
						PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
						
						String linea;
						
						while ((linea = br.readLine())!=null) {
							
							//si lo leido coincide con id del aula que queremos borrar
							 if (!linea.trim().equals(AulaAEliminar)) {
								
				                pw.println(linea); //borrar esa linea
				                pw.flush();
				                
				                /*
				                 * for (int i=0; i<1; i++) { //bucle para eliminar las siguientes 2 lineas
				                 
					                linea = br.readLine(); //volver a leer
					                pw.println(linea);
					                pw.flush();
								 }
								*/
				                
				            }
						}
						pw.close();
						br.close();
						
						 //Borrar el fichero original
				        if (!inFile.delete()) {
				            System.out.println("No se pudo borrar.");
				            return;
				        }
				 
				        //Renombrar el fichero temporal a aulas.txt
				        if (!tempFile.renameTo(inFile)){
				            System.out.println("No se ha podido renombrar.");
				 
				        }
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					eliminarAulaDelListado(AulaAEliminar);
				}
			}

			private void eliminarAulaDelListado(String AulaAEliminar) {
				DefaultTableModel model = (DefaultTableModel) tablaListadoAulas.getModel();
				int numFilas = tablaListadoAulas.getRowCount();
				/*
				 * if(numFilas >0 ) {
					model.removeRow(AulaAEliminar);
					model.
				}  
				 */
				
			}
		});
		btnGuardar_Aulas.setBounds(175, 156, 110, 23);			
		panelAddAula.add(btnGuardar_Aulas);
		
		rbAddAula = new JRadioButton("A\u00F1adir");			
		rbAddAula.setSelected(true);
		rbAddAula.addItemListener(new ItemListener() {				//RoundButton en añadir AULAS
			public void itemStateChanged(ItemEvent arg0) {

				//evento cambiar para cambiar enable
				if(rbAddAula.isSelected() == true) {			
					
					lblTamano.setEnabled(true);	
					txtTamano.setEnabled(true);	
					txtVentilacion.setEnabled(true);
					lblVent.setEnabled(true);
					
				}
			}
		});
		buttonGroup.add(rbAddAula);
		rbAddAula.setBounds(80, 19, 109, 23);
		panelAddAula.add(rbAddAula);
		
		rbDeleteAula = new JRadioButton("Eliminar");
		rbDeleteAula.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				//evento cambiar para cambiar enable
				if(rbDeleteAula.isSelected() == true){				//RoundButton en eliminar
					
					lblTamano.setEnabled(false);	
					txtTamano.setEnabled(false);	
					txtVentilacion.setEnabled(false);
					lblVent.setEnabled(false);
				}
				
			}
		});
		buttonGroup.add(rbDeleteAula);
		rbDeleteAula.setBounds(234, 19, 109, 23);
		panelAddAula.add(rbDeleteAula);
		
		panelAddProfesor = new JPanel();
		panelAddProfesor.setBounds(0, 0, 513, 199);
		contentPane.add(panelAddProfesor);
		panelAddProfesor.setLayout(null);
		
		lblNumProf = new JLabel("N\u00BA profesor:");
		lblNumProf.setBounds(27, 51, 102, 14);
		panelAddProfesor.add(lblNumProf);
		
		txtNumProf = new JTextField();
		txtNumProf.setColumns(10);
		txtNumProf.setBounds(117, 48, 110, 20);
		panelAddProfesor.add(txtNumProf);
		
		JLabel lblNombreProf = new JLabel("Nombre:");
		lblNombreProf.setBounds(27, 89, 82, 14);
		panelAddProfesor.add(lblNombreProf);
		
		txtNombreProf = new JTextField();
		txtNombreProf.setColumns(10);
		txtNombreProf.setBounds(117, 86, 110, 20);
		panelAddProfesor.add(txtNombreProf);
		
		txtDirProf = new JTextField();
		txtDirProf.setColumns(10);
		txtDirProf.setBounds(117, 129, 110, 20);
		panelAddProfesor.add(txtDirProf);
		
		txtApellProf = new JTextField();
		txtApellProf.setColumns(10);
		txtApellProf.setBounds(336, 86, 110, 20);
		panelAddProfesor.add(txtApellProf);
		
		txtTelfProf = new JTextField();
		txtTelfProf.setColumns(10);
		txtTelfProf.setBounds(336, 129, 110, 20);
		panelAddProfesor.add(txtTelfProf);
		
		JLabel lblDirProf = new JLabel("Direccion:");
		lblDirProf.setBounds(27, 132, 102, 14);
		panelAddProfesor.add(lblDirProf);
		
		JLabel lblApellProf = new JLabel("Apellidos:");
		lblApellProf.setBounds(261, 89, 77, 14);
		panelAddProfesor.add(lblApellProf);
		
		JLabel lblTelfProf = new JLabel("Tel\u00E9fono:");
		lblTelfProf.setBounds(261, 132, 77, 14);
		panelAddProfesor.add(lblTelfProf);
		
		JLabel lblAulaAsignada = new JLabel("Aula asignada:");
		lblAulaAsignada.setBounds(27, 174, 138, 14);
		panelAddProfesor.add(lblAulaAsignada);
		
		comboBoxAula = new JComboBox<String>();		
		comboBoxAula.setModel(new DefaultComboBoxModel(new String[] {"1"}));
		comboBoxAula.setBounds(127, 170, 130, 22);
		panelAddProfesor.add(comboBoxAula);
		
		/*
		try {														//leer fichero AulasAsignadas.txt
			File fichero = new File("AulasAsignadas.txt");
			
			BufferedReader in = new BufferedReader(new FileReader(fichero));
			
			String linea;
			while ((linea = in.readLine()) != null) {
				comboBoxAula.addItem(linea);		//añadirlas al comboBox de profesores
			}
			
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		
		
		
		JButton btnGuardarProf = new JButton("GUARDAR");
		btnGuardarProf.addActionListener(new ActionListener() {
			public Profesor profesor;
			public void actionPerformed(ActionEvent arg0) {					//GUARDAR AÑADIR O ELIMINAR PROFESORES
				
				if(slider.getValue()==0) {			//añadir profesor
					//objeto Profesor
					String num = txtNumProf.getText();
					String nombre = txtNombre.getText();
					String apell = txtApell.getText();
					String dir = txtDir.getText();
					String telf = txtTelf.getText();
					int aula = Integer.parseInt((String) comboBoxAula.getSelectedItem());
					profesor = new Profesor(num, nombre, apell, dir, telf, aula, true);
					
					try {
						BufferedWriter bw=new BufferedWriter(new FileWriter("alumnos.txt", true));
	
						bw.write(num+ "\n");
						bw.write(nombre+ "\n");
						bw.write(apell+ "\n");
						bw.write(dir+ "\n");
						bw.write(telf+ "\n");
						
						bw.close();
						
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					//Añadir datos al listado
					Object [] fila = new Object[tablaAlumnos.getModel().getColumnCount()]; 
					 fila[0] = num;
					 fila[1] = nombre;
					 fila[2] = apell;
					 fila[3] = dir;
					 fila[4] = telf;
					 DefaultTableModel dt = (DefaultTableModel) tablaAlumnos.getModel();
				     dt.addRow(fila);
					
				     			
				    //añadir el profesor al comboBox de Alumnos
					comboBoxAula.addItem(profesor.getNumProf());
						
				     
					//vaciar las casillas
					txtid.setText("");
					txtNombre.setText("");
					txtApell.setText("");
					txtDir.setText("");
					txtTelf.setText("");
					
					
				}else {					//eliminar profesor
					
					
				}
			}
		});
		btnGuardarProf.setBounds(362, 176, 110, 23);
		panelAddProfesor.add(btnGuardarProf);
		
		JRadioButton rbtnAddProf = new JRadioButton("A\u00F1adir");
		rbtnAddProf.addChangeListener(new ChangeListener() {				//RoundButton añadir PROFESORES
			public void stateChanged(ChangeEvent arg0) {
				
				if(rbtnAddProf.isSelected() == true) {			

					lblNombreProf.setEnabled(true);	
					txtNombreProf.setEnabled(true);
					lblApellProf.setEnabled(true);	
					txtApellProf.setEnabled(true);	
					lblDirProf.setEnabled(true);
					txtDirProf.setEnabled(true);
					lblTelfProf.setEnabled(true);
					txtTelfProf.setEnabled(true);
					lblAulaAsignada.setEnabled(true);
					comboBoxAula.setEnabled(true);
				}
			}
		});
		buttonGroup_1.add(rbtnAddProf);
		rbtnAddProf.setSelected(true);
		rbtnAddProf.setBounds(148, 18, 102, 23);
		panelAddProfesor.add(rbtnAddProf);
		
		JRadioButton rbtnDeleteProf = new JRadioButton("Eliminar");
		rbtnDeleteProf.addChangeListener(new ChangeListener() {					//RoundButton eliminar
			public void stateChanged(ChangeEvent arg0) {
				
				if(rbtnDeleteProf.isSelected() == true) {			

					lblNombreProf.setEnabled(false);	
					txtNombreProf.setEnabled(false);
					lblApellProf.setEnabled(false);	
					txtApellProf.setEnabled(false);	
					lblDirProf.setEnabled(false);
					txtDirProf.setEnabled(false);
					lblTelfProf.setEnabled(false);
					txtTelfProf.setEnabled(false);
					lblAulaAsignada.setEnabled(false);
					comboBoxAula.setEnabled(false);
				}
			}
		});
		buttonGroup_1.add(rbtnDeleteProf);
		rbtnDeleteProf.setBounds(269, 18, 109, 23);
		panelAddProfesor.add(rbtnDeleteProf);
		
		panelListadoAulas = new JPanel();
		panelListadoAulas.setBounds(0, 0, 473, 173);
		contentPane.add(panelListadoAulas);
		panelListadoAulas.setLayout(null);
		
		tablaListadoAulas = new JTable();
		tablaListadoAulas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00BA Aula", "Tama\u00F1o", "Ventilacion"
			}
		));
		tablaListadoAulas.setBounds(40, 37, 356, 90);
		panelListadoAulas.add(tablaListadoAulas);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00BA Aula");
		lblNewLabel_1.setBounds(53, 22, 77, 14);
		panelListadoAulas.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tama\u00F1o");
		lblNewLabel_2.setBounds(165, 22, 77, 14);
		panelListadoAulas.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ventilaci\u00F3n");
		lblNewLabel_3.setBounds(286, 22, 82, 14);
		panelListadoAulas.add(lblNewLabel_3);
		
		panelListadoProfesores = new JPanel();
		panelListadoProfesores.setBounds(1, 0, 502, 190);
		contentPane.add(panelListadoProfesores);
		panelListadoProfesores.setLayout(null);
		
		tablaListadoProf = new JTable();
		tablaListadoProf.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00BA profesor", "Nombre", "Apellidos", "Direcci\u00F3n", "Tel\u00E9fono"
			}
		));
		tablaListadoProf.setBounds(24, 39, 447, 102);
		panelListadoProfesores.add(tablaListadoProf);
		
		JLabel lblNewLabel_4 = new JLabel("Apellidos");
		lblNewLabel_4.setBounds(207, 21, 86, 14);
		panelListadoProfesores.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("N\u00BA Profesor");
		lblNewLabel_5.setBounds(24, 21, 83, 14);
		panelListadoProfesores.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre");
		lblNewLabel_6.setBounds(117, 21, 80, 14);
		panelListadoProfesores.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4_1 = new JLabel("Direcci\u00F3n");
		lblNewLabel_4_1.setBounds(294, 21, 86, 14);
		panelListadoProfesores.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Tel\u00E9fono");
		lblNewLabel_4_2.setBounds(385, 21, 86, 14);
		panelListadoProfesores.add(lblNewLabel_4_2);
		
		
		
		btnGuardar.addActionListener(new ActionListener() {											//GUARDAR AÑADIR O ELIMINAR ALUMNOS
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					BufferedWriter bw=new BufferedWriter(new FileWriter("alumnos.txt", true));
							//true = añadir texto al final de un fichero ya existente (sin crear uno nuevo ni borrar su contenido)
					
					bw.write(txtid.getText()+ "\n");
					bw.write(txtNombre.getText()+ "\n");
					bw.write(txtApell.getText()+ "\n");
					bw.write(txtDir.getText()+ "\n");
					bw.write(txtTelf.getText()+ "\n");
					
					bw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				//Añadir datos al listado
				Object [] fila = new Object[tablaAlumnos.getModel().getColumnCount()]; 
		        
				 fila[0] = txtid.getText();
				 fila[1] = txtNombre.getText();
				 fila[2] = txtApell.getText();
				 fila[3] = txtApell.getText();
				 fila[4] = txtApell.getText();
				 
				 DefaultTableModel dt = (DefaultTableModel) tablaAlumnos.getModel();
			     dt.addRow(fila);
				

				//vaciar las casillas
				txtid.setText("");
				txtNombre.setText("");
				txtApell.setText("");
				txtDir.setText("");
				txtTelf.setText("");
			}
		});
																														//CARGAR LA LISTA DE ALUMNOS DEL FICHERO alumnos.txt
		Object [] fila = new Object[tablaAlumnos.getModel().getColumnCount()]; //objeto fila con 5 columnas
		try {
			BufferedReader in = new BufferedReader(new FileReader("alumnos.txt"));
			String linea;
			while((linea = in.readLine()) != null) { 
				for (int i=0; i<fila.length; i++) {
					fila[i] = linea; 
					if(i<4) {	//para que no leea el ultimo dato y se pierda
						linea = in.readLine(); 
					}
				}
				 DefaultTableModel dt = (DefaultTableModel) tablaAlumnos.getModel();
			     dt.addRow(fila);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		Object [] fila1 = new Object[tablaListadoAulas.getModel().getColumnCount()]; //objeto fila con 3 columnas				//CARGAR LA LISTA DE AULAS DEL FICHERO aulas.txt
		try {
			BufferedReader in = new BufferedReader(new FileReader("aulas.txt"));
			String linea;
			while((linea = in.readLine()) != null) { 
				for (int i=0; i<fila1.length; i++) {
					fila1[i] = linea; 
					if(i<2) {	//para que no leea el ultimo dato y se pierda
						linea = in.readLine(); 
					}
				}
				 DefaultTableModel dt = (DefaultTableModel) tablaListadoAulas.getModel();
			     dt.addRow(fila1);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		Object [] fila2 = new Object[tablaListadoProf.getModel().getColumnCount()]; //objeto fila con 5 columnas				//CARGAR LA LISTA DE PPROFESORES DEL FICHERO profesores.txt
		try {
			BufferedReader in = new BufferedReader(new FileReader("profesores.txt"));
			String linea;
			while((linea = in.readLine()) != null) { 
				for (int i=0; i<fila2.length; i++) {
					fila2[i] = linea; 
					if(i<4) {	//para que no leea el ultimo dato y se pierda
						linea = in.readLine(); 
					}
				}
				 DefaultTableModel dt = (DefaultTableModel) tablaListadoProf.getModel();
			     dt.addRow(fila2);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		panelAddAula.setVisible(false);					//poner todos los paneles sin visibilidad
		panelAddAlumno.setVisible(false);
		panelAddProfesor.setVisible(false);
		panelListadoAlumnos.setVisible(false);
		panelListadoAulas.setVisible(false);
		panelListadoProfesores.setVisible(false);



	}
}
