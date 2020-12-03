package EjemplosProfe;

public class Hilo1 extends Thread{
	private Contador contador;
	Hilo1(String n,Contador c){
		setName(n);
		this.contador=c;
	}
	public void run(){
		for(int i=1;i<=300;i++){
			contador.Incremento();
			try{
				sleep(100);
			}catch(InterruptedException e){
				//e.printstacktrace();
			}
		}
		System.out.println(getName() + " contador vale " + contador.getValor());
	}
}