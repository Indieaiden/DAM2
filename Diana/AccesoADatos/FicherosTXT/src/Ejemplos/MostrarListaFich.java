package Ejemplos;

import java.io.File;

public class MostrarListaFich {
	
	//Mostrar la ista de ficheros de un directorio pasado como parámetro
	
	public static void main(String[] args) {
		
		
		String directorio = "C:/Prueba";
		String[] ficheros = comandoDir(directorio);
		
		for (int i=0; i<ficheros.length; i++) {
			System.out.println(ficheros[i]);
		}
		
	}

	private static String[] comandoDir(String directorio) {
		File f = new File(directorio);
		return f.list();
	}
}
