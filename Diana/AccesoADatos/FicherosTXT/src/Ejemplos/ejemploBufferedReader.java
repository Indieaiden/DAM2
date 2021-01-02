package Ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejemploBufferedReader {

	public File fichero;
	public void ejemplo() {
		
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(fichero.getName()));
			String linea = in.readLine();
			
			while(linea != null) {
				//procesar el texto de la línea
				linea = in.readLine();
			}
			in.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
