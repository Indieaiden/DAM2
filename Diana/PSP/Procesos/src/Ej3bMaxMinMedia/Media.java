package Ej3bMaxMinMedia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Media {

	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Introduce 5 numeros:");
		
		int n = 0, media = 0, suma = 0;
		
		for(int i=0;i<5;i++) {
	            try {
	            	
					n = Integer.parseInt(in.readLine());
					suma = suma + n;
					
				} catch (NumberFormatException | IOException e) {
					System.out.println("No has introducido un número.");
				}
		}
		
		media = suma / 5;
		
		System.out.println("El resultado se ha escrito en el fichero media.txt");
		
		String ruta = "./media.txt";
		File archivo = new File(ruta);
		BufferedWriter bw;
		
		try {
			if(archivo.exists()) {
			    //Si el fichero ya existía
			    
				bw = new BufferedWriter(new FileWriter(archivo));
			    
			    PrintWriter escribir = new PrintWriter(bw);//para crear el objeto que escribe en el archivo
			    escribir.println("La media de la lista es: " + media);//para escribir en el archivo
			    escribir.flush();
			    escribir.close();
			    
			} else {
			    //Se acaba de crear el fichero de texto
			    
			    bw = new BufferedWriter(new FileWriter(archivo));

			    PrintWriter escribir = new PrintWriter(bw);//para crear el objeto que escribe en el archivo
			    escribir.println("La media de la lista es: " + media);//para escribir en el archivo
			    escribir.flush();
			    escribir.close();
			    
			}
			bw.close();
			
		} catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
	}
}
