package AccesoDatos.Tema1.Ejemplos.T1;
import java.io.*;

public class E_SEjemplo {
    public void E_SEjemplo(){
        try{
            BufferedReader reader = 
                new BufferedReader(new FileReader("nombreFichero"));
                String linea = reader.readLine();
            while(linea != null) {
                //Procesar el texto de la linea
        
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
    }
}
