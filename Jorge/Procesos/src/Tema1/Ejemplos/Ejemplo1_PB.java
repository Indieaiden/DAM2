package PSP.Tema1.Ejemplos;
import java.io.*;

public class Ejemplo1_PB {
    
	public static void main(String[] args) { 
       
       //Esto es una prueba de Github
		String comando = "cmd"; 

		try{ 
            //Primero COMANDO y luego ARGUMENTOS
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dir");
            Process process = pb.start();
            //Creamos un buffered Reader para poder leer línea a línea
            //Para ello usamos el ISR en el new
            InputStreamReader isr = new InputStreamReader(process.getInputStream());
            try{
                BufferedReader reader = 
                new BufferedReader(isr);
                    String linea = reader.readLine();
                while(linea != null) {
                    System.out.println(linea);
            
            linea = reader.readLine();
                }
                reader.close();
                }
            catch(FileNotFoundException e) {
                //NoSeEncuentraFichero
            }
            catch(IOException e){
                //Algo fue mal al leer o cerrar
            }

		}catch(Exception e){ 
			System.out.println("ERROR EN "+comando); 
			e.printStackTrace(); 
		} 
	} 
}
