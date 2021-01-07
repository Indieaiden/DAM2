import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class recuperarPartida {

	private int vidas, partidasGanadas, partidasPerdidas;
	private String palabra, letrasQueNoEstan; 
	private String fuente;
	
	
	public void recuperar() {  
		try {
			File fichero = new File("D:\\Repo2DAM\\DAM2\\Diana\\AccesoADatos\\AhorcadoDiana\\partidaGuardada.txt");
			DataInputStream dataIS = new DataInputStream(new FileInputStream(fichero));
			
			//leo los datos del fichero
			fuente = dataIS.readUTF();
			vidas = dataIS.readInt();
			partidasGanadas = dataIS.readInt();
			partidasPerdidas = dataIS.readInt();
			palabra = dataIS.readUTF();
			letrasQueNoEstan = dataIS.readUTF();
			
			dataIS.close();
			
			switch(fuente) {
				case "palabras.txt": 
					File fich = new File("D:\\Repo2DAM\\DAM2\\Diana\\AccesoADatos\\AhorcadoDiana\\palabras.txt");
					BufferedReader br = new BufferedReader(new FileReader(fich));
					String linea;
					while ((linea = br.readLine()) != null) {
						if(linea.equals(palabra)) {   //si la linea leida es la palabra guardada en el fichero
							Juego juego = new Juego();
							juego.juego(fuente, linea, partidasGanadas, partidasPerdidas);
						}
					}
					break; 
					
				case "fichero.txt":
					File fichero1 = new File("D:\\Repo2DAM\\DAM2\\Diana\\AccesoADatos\\AhorcadoDiana\\fichero.txt"); //declarar fichero
					DataInputStream data = new DataInputStream(new FileInputStream(fichero1));
					while ((linea = data.readUTF()) != null) { //mientras siga habiendo texto en el fichero
						if(linea.equals(palabra)) {   //si la linea leida es la palabra guardada en el fichero
							Juego juego = new Juego();
							juego.juego(fuente, linea, partidasGanadas, partidasPerdidas);
						}
					}
					break; 
				
				case "palabras.xml":
					Document document;
					try {
						DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
						DocumentBuilder builder = factory.newDocumentBuilder();
					  	document = builder.parse(new File("D:\\Repo2DAM\\DAM2\\Diana\\AccesoADatos\\AhorcadoDiana\\palabras.xml"));   //cargar el xml
					  	
					  	NodeList lista = document.getChildNodes();
					  	Node raiz = lista.item(0);  			//elemento raiz 'palabras'
					  	NodeList hijos = raiz.getChildNodes(); //nodos 'palabra'

					  	for(int i=0;i<hijos.getLength();i++) {
					  		Node hijo = hijos.item(i);
					  		if(hijo.getNodeType() == Node.ELEMENT_NODE) {   //coger los hijos que sean elementos
					  			Element palabra = (Element)hijo;
					  			
					  			String palabrita = palabra.getTextContent();
					  			if(palabrita.equals(palabra)) {
						  			Juego juego = new Juego();
									juego.juego(fuente, palabrita, partidasGanadas, partidasPerdidas);
					  			}
					  		}
					  	}
					} catch (ParserConfigurationException | SAXException | IOException e) {
						e.printStackTrace();
					}
					break; 
				
				case "palabritas": //bd
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");  //Cargar el driver
						String bd = "jdbc:mysql://localhost:3306/palabritas";  
						String usuario = "root", contraseña = "1234";
						Connection conexion = DriverManager.getConnection(bd, usuario, contraseña); //conexion a la bd
						Statement sentencia = conexion.createStatement(); //Preparamos la consulta
						String sql = "SELECT * FROM palabras";
						ResultSet resultado = sentencia.executeQuery(sql); //obtenemos las palabras
						//Recorremos el resultado para visuallizar cada fila
						//Se hace un bucle mientras haya registros
						while(resultado.next()) {
							for(int i=0; i<=1;i++){
								String palab = resultado.getString(0);
								if(palab.equals(palabra)) {
									Juego juego = new Juego();
									juego.juego(fuente, palabra, partidasGanadas, partidasPerdidas);
								}
					        }
						}
						resultado.close();
						sentencia.close();
						conexion.close();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						//e.printStackTrace();
						System.out.println("Error de zona horaria. No he conseguido solucionar esto.");
					}
					break;
					
				case "partidaGuardada.txt":
					Juego juego = new Juego();
					juego.juego(fuente, palabra, partidasGanadas, partidasPerdidas);
					break;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Archivo de recuperación de partida no encontrado.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
