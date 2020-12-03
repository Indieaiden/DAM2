package Ej3aMaxMinMedia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minimo {

	public static void main(String[] args){
		
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Introduce 5 numeros:");
		
		
		int n = 0, menor=999;
		
		for(int i=0;i<5;i++) {
			
            try {
            	
				n = Integer.parseInt(in.readLine());
				if(n < menor){
	                menor = n;
	            }
				
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            
		}
        System.out.println("El menor de la lista es " + menor);
		
	
	}
}
