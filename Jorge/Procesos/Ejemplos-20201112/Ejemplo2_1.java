import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo2_1 {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		String comando = "cmd /c dir";
		Process p = null;
		int valorSalida;
		try{
			p = r.exec(comando);
			// Este método devuelve el flujo de entrada conectado a la 
			// salida normal del subproceso
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String linea = br.readLine();
			while(linea!=null){
				System.out.println(linea);
				linea  = br.readLine();
			}
			br.close();
		}catch(Exception e){
			System.out.println("ERROR EN " + comando);
			e.printStackTrace();
			}
		try{
			// El método waitFor() hace que el proceso actual espere hasta
			// que el subproceso representado por el objeto Process finalice
			valorSalida = p.waitFor();
			System.out.println("Valor de salida " + valorSalida);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
