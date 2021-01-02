package Ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejemploFileReader {

	public static void main(String[] args) {
					//leer línea por línea del fichero
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
		
		
		
		
		
		/*			//leer caracter por caracter
		try {
			File fichero = new File("D:/fichero.txt"); //declarar fichero
			
			FileReader fr = new FileReader(fichero);  //crear flujo de entrada
			
			int i;
			while((i = fr.read()) != -1) {    //se va leyendo cada char
				System.out.print( (char)i );
			}
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
}
