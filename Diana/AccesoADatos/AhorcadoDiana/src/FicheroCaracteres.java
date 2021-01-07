import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FicheroCaracteres {
	
	private String linea;
	private int partidasGanadas=0, partidasPerdidas=0;
	
	public void ahorcado(String fuente) {
		try {
			File fichero = new File("D:\\Repo2DAM\\DAM2\\Diana\\AccesoADatos\\AhorcadoDiana\\palabras.txt"); //declarar fichero
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			
	
			while ((linea = br.readLine()) != null) { //mientras siga habiendo texto en el fichero
				
				Juego juego = new Juego();
				juego.juego(fuente, linea, partidasGanadas, partidasPerdidas);
			}
			
			//metodo recursivo para que vuelva a leer desde el principio el fichero
			if((linea = br.readLine()) == null) {  
				System.out.println("Se han terminado las palabras. A partir de aquí se vuelve a empezar desde la primera.");
				ahorcado(fuente);
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
