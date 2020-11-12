package PSP.Tema1.Ejemplos;

import java.io.*;

public class Ejemplo1 {
	public static void main(String[] args) { 
        /**
         * El objeto Runtime da mucha información sobre lo que tenemos en java.
         * En exec podemos utilizar determinado comando, por ejemplo "notepad"
         * Y esto lo que hace es abrir un proceso (desde Java). Y este proceso nuevo
         * lanza el programa en cuestión.
         */
		Runtime r = Runtime.getRuntime(); 
		String comando = "cmd /c dir"; 
		Process p; 
		try{ 
            p=r.exec(comando); 
            /**
             * Stream: Es una pila donde yo voy pasando cosas.
             * LEER: InputStream
             * ESCRIBIR: OutputStream
             * 
             * Ahora vamos a leer lo que nos saca un proceso en concreto:
             */
            InputStream is = p.getInputStream();

            //Creamos un buffered Reader para poder leer línea a línea
            //Para ello usamos el ISR en el new
            
            try{
                BufferedReader reader = 
                new BufferedReader(new InputStreamReader(is));
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