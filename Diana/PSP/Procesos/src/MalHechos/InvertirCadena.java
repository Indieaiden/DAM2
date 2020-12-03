package MalHechos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InvertirCadena {

	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("estoy en el padre");
		ProcessBuilder pb = new ProcessBuilder("java","-cp","./bin", "Ej2InvertirCadena/InvertirCadenas");
		Process p;
		
		try {
			p = pb.start();
			
			//introducir aquí todas las cadenas, y cuando termine lanzar los procesos
			
			
			System.out.println("Introduce una cadena");
			String cadena = in.readLine();
			
			
			InputStream is = p.getInputStream();
			
			
			String linea = in.readLine();
			
			while(linea !=null) {
				System.out.println(linea);
				linea = in.readLine();
			}
			
			in.close();
			System.out.println("termina el padre");
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void recibirCadenas(String cad) {
		
	}
	
}
