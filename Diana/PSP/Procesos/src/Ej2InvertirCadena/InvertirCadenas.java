package Ej2InvertirCadena;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InvertirCadenas {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Introduce varias cadenas. Escribe 'FIN' para terminar.");
		
		String cadena = in.readLine();
		
		ProcessBuilder pb = new ProcessBuilder("java","-cp","./bin", "Ej2InvertirCadena/InvertirCadena", cadena);
		Process p;
		
		while(!cadena.equals("FIN")) {
			
			try{
				p = pb.start();
				InputStream is = p.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
				String linea = br.readLine();
				
				while(linea!=null){
					System.out.println(linea);
					linea  = br.readLine();
				}
				cadena = in.readLine();
				br.close();
				
			}catch(Exception e){
				System.out.println("ERROR");
				e.printStackTrace();
				}
		}
		
		in.close();
		
	}
}
