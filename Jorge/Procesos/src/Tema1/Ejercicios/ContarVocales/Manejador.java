package Ejercicios.ContarVocales;

public class Manejador {

    public static void main(String[] args){
		Manejador  l = new Manejador();


		l.buscarVocal("a");
        l.buscarVocal("e");
        l.buscarVocal("i");
        l.buscarVocal("o");
        l.buscarVocal("u");
        
		System.out.println("Hemos llegado al final");
	}

    public static void buscarVocal(String vocal){
		String clase = "contarVocal"; //¿¿Esto qué es??
		ProcessBuilder pb;
		char vocalMayus = 
		try {
			pb = new ProcessBuilder("java",clase,n1.toString(),n2.toString());
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