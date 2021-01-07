import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class rellenarFich {

	public static void main(String[] args) throws IOException {
		
		File fichero = new File("fichero.txt");
		DataOutputStream dataOS = new DataOutputStream(new FileOutputStream(fichero));
		
		String palabras[] = {"Pelicula", "Ensaimada", "Zumo", "Gafas", "Pintauñas"};

		for (int i=0; i<palabras.length; i++) {
			dataOS.writeUTF(palabras[i]);
		}
		dataOS.close();
		
	}
}
