package Ejercicios;

import java.io.File;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		File fichero = new File("C:\\");
		
		esDirectorio(fichero);
	}
	
	public static boolean esDirectorio(File fichero) {
		
		if(fichero.isDirectory()) {
			System.out.println("Sí es un directorio");
			
			String[] contenido = fichero.list();;
			
			for(int i=0;i<contenido.length;i++) {
				System.out.println(contenido[i]);
			}
			return true;
		}else {
			System.out.println("No es directorio");
			return false;
		}
	}
}
