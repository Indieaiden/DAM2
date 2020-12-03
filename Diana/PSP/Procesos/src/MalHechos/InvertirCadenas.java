package MalHechos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InvertirCadenas {

public static char[] caracteres;
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("estoy en el hijo");
		
			String cadena="";
		
		
			arrayCadena(cadena);	//convertir en array
			
			
			for(int i=0; i<cadena.length();i++) {	
				char letra = cadena.charAt(i);
				caracteres[i] = letra;
			}
			
			System.out.println("La cadena al reves es: ");
			for(int i=cadena.length()-1; i>=0; i--) {
				System.out.print(caracteres[i]);
			}
			
			
			System.out.println("\n" + "termina el hijo");
		
		
	}
	
	public static char[] arrayCadena(String cadena) {
		
		int longitud = cadena.length();
		caracteres = new char [longitud];
		return caracteres;
		
	}
}
