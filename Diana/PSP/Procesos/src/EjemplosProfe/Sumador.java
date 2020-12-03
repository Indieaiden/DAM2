package EjemplosProfe;

public class Sumador {

	public static void main(String[] args){
		
		System.out.print(sumar(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
	
	
	public static int sumar(int n1, int n2){
		int resultado = 0;
		for (int i=n1; i<=n2; i++)
			resultado = resultado + i;
		return resultado;
	}
}
