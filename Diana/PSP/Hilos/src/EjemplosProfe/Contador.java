package EjemplosProfe;

public class Contador{
	private int contador;
	
	Contador(int contador){
		this.contador=contador;
	}
	public void Incremento(){
		contador++;
	}
	public void Decremento(){
		contador--;
	}
	public int getValor(){
		return contador;
	}
}