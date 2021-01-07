package Ejemplos;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploDataOutputStream {

public static void main(String[] args) throws IOException {
		
		File fichero = new File("fichero.txt");
		DataOutputStream dataOS = new DataOutputStream(new FileOutputStream(fichero));
		
		String nombres[] = {"Ana", "Luis", "Juana", "Paco"};
		int edades[] = {15, 14, 18, 9};

		for (int i=0; i<edades.length; i++) {
			dataOS.writeUTF(nombres[i]);
			dataOS.writeInt(edades[i]);
		}
		dataOS.close();
		
	}
}
