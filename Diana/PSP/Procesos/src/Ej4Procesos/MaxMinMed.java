package Ej4Procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MaxMinMed {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Introduce 5 numeros:");
		
		String n = in.readLine();;			
		
		
		ProcessBuilder pb = new ProcessBuilder("java","-cp","./bin", "Ej3aMaxMinMed/Maximo.java", n);
		Process p;
		
		for(int i=0;i<5;i++) {
			n = in.readLine();
		
			
			try{
				p = pb.start();
				InputStream is = p.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
				String linea = br.readLine();
				
				while(linea!=null){
					System.out.println(linea);
					linea  = br.readLine();
				}
				n = in.readLine();
				br.close();
				
			}catch(Exception e){
				System.out.println("ERROR");
				e.printStackTrace();
				}
		}
		
		in.close();
		
	}
}
