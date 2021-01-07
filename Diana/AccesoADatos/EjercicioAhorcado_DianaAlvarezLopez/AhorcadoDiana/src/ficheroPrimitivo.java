import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ficheroPrimitivo {

	private String linea;
	private int partidasGanadas=0, partidasPerdidas=0;
	
	public void ahorcado(String fuente) {
		try {
			File fichero = new File("D:\\Repo2DAM\\DAM2\\Diana\\AccesoADatos\\AhorcadoDiana\\fichero.txt"); //declarar fichero
			DataInputStream dataIS = new DataInputStream(new FileInputStream(fichero));
			
	
			while ((linea = dataIS.readUTF()) != null) { //mientras siga habiendo texto en el fichero
				
				Juego juego = new Juego();
				juego.juego(fuente, linea, partidasGanadas, partidasPerdidas);
			}
			
			//metodo recursivo para que vuelva a leer desde el principio el fichero
			if((linea = dataIS.readUTF()) == null) {  
				System.out.println("Se han terminado las palabras. A partir de aquí se vuelve a empezar desde la primera.");
				ahorcado(fuente);
			}
			
			dataIS.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
