package EjemplosProfe;

import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.List;
import java.util.Iterator;

public class Ejemplo3 {
	
	public static void main(String[] args) {
		
		ProcessBuilder test = new ProcessBuilder();
		Map entorno = test.environment();
		
		System.out.println("Las variables de entorno son ");
		System.out.println(entorno);
		System.out.println();
		test = new ProcessBuilder("java","Un saludo","\"HolaMundo!!\"");
		
		// Devuelve el nombre del proceso y sus argumentos
		List l = test.command();
		Iterator iter = l.iterator();
		System.out.println("Argumentos del comando");
		
		
		while(iter.hasNext())
			System.out.println(iter.next());
		
		
		System.out.println();
		
		// Ejecuta el comando DIR
		test = test.command("cmd","/c","dir");
		Process p = null;
		
		try{
			p = test.start();
			
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String linea = br.readLine();
			
			while(linea!=null){
				System.out.println(linea);
				linea = br.readLine();
			}
			
			br.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
}