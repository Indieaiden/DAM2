import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3Principal {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
            
            System.out.println("Introduce varias cadenas. Escribe 'FIN' para terminar.");
            String cadena = in.readLine();

            while(!cadena.equals("FIN")) {
                
                
            }
            
            in.close();
            
        
    }
}