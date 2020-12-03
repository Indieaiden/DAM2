package EjemplosProfe;

public class Ejemplo1 { 
	public static void main(String[] args) { 
		Runtime r = Runtime.getRuntime(); 
		String comando = "notepad"; 
		Process p; 
		try{ 
			p=r.exec(comando); 
		}catch(Exception e){ 
			System.out.println("ERROR EN "+comando); 
			e.printStackTrace(); 
		} 
	} 
} 
