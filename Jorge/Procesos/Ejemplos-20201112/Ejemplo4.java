import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo4 {
	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("cmd","/c","dir");
		File fout = new File("C:/Users/alumno/Desktop/MyApp/salida.txt");
		File ferror = new File("C:/Users/alumno/Desktop/MyApp/error.txt");
		try{
			pb.redirectOutput(fout);
			pb.redirectError(ferror);
			pb.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}