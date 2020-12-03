package ContarVocales;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ContadorVocales {

	public static void main(String[] args) {
		
		contador(args[0],args[1]);
	}

	private static void contador(String letra, String nombreFichero) {
		
		char vocalMayuscula = (letra.toUpperCase()).charAt(0);
		char vocalMinuscula = letra.charAt(0);
		
		try {
			FileReader fich = new FileReader(new File("fichero.txt"));
			int i;
			int contador = 0;
			
				while((i=fich.read()) != -1) {
					if((char)i == vocalMinuscula || (char)i == vocalMayuscula) {
						contador++;
					}	
				}
			
			System.out.println("La letra " +vocalMayuscula+ " aparece en el fichero " +contador+ " veces.");
			File fichero =new File(nombreFichero);
			fichero.createNewFile();
			
			BufferedWriter escribir = new BufferedWriter(new FileWriter(fichero));
			String numero= Integer.toString(contador);
			escribir.write(numero);
			escribir.flush();
			escribir.close();
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}
	
	
}
