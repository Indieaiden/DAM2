package Ejercicios;

import java.io.File;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		File fichero = new File("C:\\Prueba");
		
		eliminarDirectorios(fichero);
	}
	
	
	public static void eliminarDirectorios(File directorio) {
		
		
		File[] ficheros = directorio.listFiles();
		
		for (int i=0;i<ficheros.length;i++){			
			
			if (ficheros[i].isDirectory()){
				eliminarDirectorios(ficheros[i]);
				System.out.println("directorio " +ficheros[i].getName()+ " eliminado");
				ficheros[i].delete();
			}
		}
	}
}
















//http://lineadecodigo.com/java/borrar-un-directorio-con-java/