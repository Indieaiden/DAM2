package Ejemplos;

import java.io.File;

public class ejemplo1 {

	public static void main(String[] args) {
		
		System.out.println("¿Está inventado.txt en esta carpeta?");
		
		File f = new File("inevntado.txt");
		System.out.println(f.exists());
	}
}
