package ContarVocales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) {
	
		Principal p = new Principal();
		p.lanzarProcesoContarVocales("a", "a.txt");
		p.lanzarProcesoContarVocales("e", "e.txt");
		p.lanzarProcesoContarVocales("i", "i.txt");
		p.lanzarProcesoContarVocales("o", "o.txt");
		p.lanzarProcesoContarVocales("u", "u.txt");
		
	}

	private void lanzarProcesoContarVocales(String vocal, String archivo) {
		
		String clase = "ContadorVocales";
		ProcessBuilder pb;
		String line;
		
		try {
			pb = new ProcessBuilder("java","-cp","./bin", "ContarVocales/ContadorVocales", vocal, archivo);
			pb.redirectErrorStream(true);
			Process p = pb.start();
			
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((line = input.readLine()) != null)
				System.out.println(line);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}
	
}
