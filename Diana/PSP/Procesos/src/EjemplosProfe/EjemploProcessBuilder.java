package EjemplosProfe;
import java.io.*;

public class EjemploProcessBuilder {
	
	public static void main(String[] args) { 
		
		ProcessBuilder pb = new ProcessBuilder(args);
		Process p;
		//int valorSalida;
		
		try {
			p = pb.start();
		
			InputStream is = p.getInputStream();
			BufferedReader in = new BufferedReader (new InputStreamReader(is));
			
			String linea = in.readLine();
			
			while(linea !=null) {
				System.out.println(linea);
				linea = in.readLine();
			}
			
			in.close();
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	} 
	
}
