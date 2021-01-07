package Ejemplos;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploDataInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		
		File fichero = new File("fichero.txt");
		DataInputStream dataIS = new DataInputStream(new FileInputStream(fichero));
		
		String n;
		int e;

		try {
			while(true) {
				n = dataIS.readUTF();
				e = dataIS.readInt();
				System.out.println("Nombre: " +n+ ", edad:" +e);
					
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}
}
