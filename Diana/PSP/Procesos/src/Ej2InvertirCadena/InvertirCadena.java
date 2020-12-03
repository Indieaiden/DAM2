package Ej2InvertirCadena;
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class InvertirCadena {

	public static char[] caracteres;
	public static String aux = "";
	
	public static void main(String[] args) throws IOException {
		
		String cadena = "";
		
		arrayCadena(cadena); //convertir en array
		
		for(int i=0; i<cadena.length();i++) {	
			char letra = cadena.charAt(i);
			caracteres[i] = letra;
		}
		
		
		for(int i=cadena.length()-1; i>=0; i--) {
			 aux += String.valueOf(caracteres[i]);
		}
		System.out.println("La cadena al reves es: ");
		System.out.println(aux);
		
	}
	
	public static char[] arrayCadena(String cadena) {
		
		int longitud = cadena.length();
		caracteres = new char [longitud];
		return caracteres;
		
	}
}
