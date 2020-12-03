package EjemplosProfe;
import java.io.*;

public class EjemploRuntime {
	
	public static void main(String[] args) { 
		
		Runtime r = Runtime.getRuntime(); 
		String comando = "cmd /c dir"; 
		Process p; 
		
		
		
		try{ 
			p=r.exec(comando); 
			
			InputStream is = p.getInputStream();
			BufferedReader in = new BufferedReader (new InputStreamReader(is));
			
			String linea = in.readLine();
			
			while(linea !=null) {
				System.out.println(linea);
				linea = in.readLine();
			}
			
			in.close();
			
		}catch(Exception e){ 
			System.err.println("ERROR EN "+comando); 
			e.printStackTrace(); 
		} 
	} 
	
}
