package Ejercicios;
import java.io.File;

public class Ejercicio1 {

	//metodo estaEn que diga si x fichero pasado como parametro esta dentro de un directorio 
	//pasado como parametro.
	
	public static void main(String[] args) {

		String archivo = "src";
		String directorio = "."; 
		 
		
		String[] lista = comandoDir(directorio);	//lista de cosas dentro del directorio actual
		
		for(int i=0;i<lista.length;i++) {
			//System.out.println(lista[i]);
			if(lista[i].equalsIgnoreCase(archivo)) {
				System.out.println("El fichero "+ archivo+" sí está.");
			}
		}
	}
	
	
	
	 public static String[] comandoDir (String directorio){
		 File f = new File (directorio); 
	 	return f.list();
	 }
	 
	 public static boolean estaEn(String dir, String directorio){
	 	File f = new File(directorio);
	 	if(f.exists()) {
	 		System.out.println("existe");
	 		return true;
	 	}else {
	 		System.out.println("No existe");
	 		return false;
	 	}
	 }
	 
}
