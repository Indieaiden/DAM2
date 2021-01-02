package Ejemplos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ejemploFileWriter {

	public static void main(String[] args) {
		
		try {
			File fichero = new File("D:/ficherito.txt");  //declarar fichero
		
			FileWriter fw = new FileWriter(fichero);  //crear el flujo de salida
			
			String cadena = "Esta es la cadena que voy a escribir con FileWriter";
			char[] cad = cadena.toCharArray(); //convertir en array de caracteres
			
			for (int i=0; i<cad.length; i++) {
				fw.write(cad[i]);  //se va escribiendo un char cada vez
				System.out.print(cad[i]);
			}
			
			fw.append('*');
			fw.write(cad);
			fw.write("\n añadido al final");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
