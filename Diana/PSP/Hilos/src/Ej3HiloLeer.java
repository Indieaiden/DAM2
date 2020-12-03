import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3HiloLeer implements Runnable {

    Thread t;

    Ej3HiloLeer() {
        t = new Thread(this, "Thread");
        t.start();
    }

    @Override
    public void run() {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce varias cadenas. Escribe 'FIN' para terminar.");
        String cadena;
        try {
            cadena = in.readLine();
            while(!cadena.equals("FIN")) {
                cadena = in.readLine();
                Ej3HiloImprimir hilo2 = new Ej3HiloImprimir(cadena);
            }
            in.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    } 
}