package Ej3aMaxMinMedia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Media {

	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Introduce 5 numeros:");
		
		int n = 0, media = 0, suma = 0;
		
		for(int i=0;i<5;i++) {
	            try {
	            	
					n = Integer.parseInt(in.readLine());
					suma = suma + n;
					
				} catch (NumberFormatException | IOException e) {
					e.printStackTrace();
				}
		}
		
		media = suma / 5;
        System.out.println("La media es: " + media);
		
		
		
	}
}
