package EjemplosProfe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lanzador {
	
	public static void main(String[] args){
		
		Lanzador  l = new Lanzador();

		l.lanzarSumador(1, 50);
		l.lanzarSumador(51, 100);
		System.out.println("Ok");
	}
	
	
	public void lanzarSumador(Integer n1,Integer n2){
		
		String clase = "Sumador";
		ProcessBuilder pb;
		String line;
		
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
