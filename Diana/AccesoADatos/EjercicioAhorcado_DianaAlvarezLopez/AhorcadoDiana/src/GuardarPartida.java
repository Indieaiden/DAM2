import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class GuardarPartida {

	private int vidas, partidasGanadas, partidasPerdidas;
	private String palabra, letrasQueNoEstan; 
	private String fuente;
	
	public GuardarPartida(int vidas, int partidasGanadas, int partidasPerdidas, String palabra,
			String letrasQueNoEstan, String fuente) {
		this.vidas = vidas;
		this.partidasGanadas = partidasGanadas;
		this.partidasPerdidas = partidasPerdidas;
		this.palabra = palabra;
		this.letrasQueNoEstan = letrasQueNoEstan;
		this.fuente = fuente;
	}
	

	public void guardar() {
		try {
			File fichero = new File("D:\\Repo2DAM\\DAM2\\Diana\\AccesoADatos\\AhorcadoDiana\\partidaGuardada.txt");
			DataOutputStream dataOS = new DataOutputStream(new FileOutputStream(fichero));
			
			dataOS.writeUTF(fuente);
			dataOS.writeInt(vidas);
			dataOS.writeInt(partidasGanadas);
			dataOS.writeInt(partidasPerdidas);
			dataOS.writeUTF(palabra);
			dataOS.writeUTF(letrasQueNoEstan);
			
			dataOS.close();
				
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
