package EjemplosProfe;

public class Principal{
	public static void main(String[] args){
		Contador c=new Contador(100);
		Hilo1 h1=new Hilo1("Hilo 1",c);
		Hilo2 h2=new Hilo2("Hilo 2",c);
		h1.start();
		h2.start();
	}
}