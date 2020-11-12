package Ej3aMaxMinMedia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maximo {

	public static void main(String[] args){
		
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Introduce 5 numeros:");
		
		int n = 0, mayor=-99;
		
		for(int i=0;i<5;i++) {
			
            try {
            	
				n = Integer.parseInt(in.readLine());
				if(n > mayor){
	                mayor = n;
	        		
	            }
				
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
            
		}
		System.out.println("El máximo de la lista es " + mayor);
		
	}
}
