public class Ej3HiloImprimir implements Runnable{

    Thread t;

    Ej3HiloImprimir(String cadena){
		t = new Thread(this, "Thread");
		t.start();
    }
    
    @Override
	public void run() {
        //System.out.println(cadena);
        /*
        File fichero =new File("ficheroEj3·.txt");
        fichero.createNewFile();
        
        BufferedWriter escribir = new BufferedWriter(new FileWriter(fichero));
        escribir.write(cadena);
        escribir.flush();
        escribir.close();
       */
    } 
}