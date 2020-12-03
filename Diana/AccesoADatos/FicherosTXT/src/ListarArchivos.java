import java.io.File;

public class ListarArchivos {
	public static void main(String[] args) {
		
		
		String[] archivos;
		
		try {
			File f = new File("hola.txt"); 		//directorio actual "."
				//f apunta al directorio		//hola.txt NO se puede listar al no ser un directorio (tampoco existe) 
			archivos = f.list();
			

			for(int i=0;i<archivos.length;i++) {
				System.out.println(archivos[i]);
			}
				
		
		}catch(Exception e) {
			System.out.println("No es un directorio");
		}	
	
		
		
	}
}
