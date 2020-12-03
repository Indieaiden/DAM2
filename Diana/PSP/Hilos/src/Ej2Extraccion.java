
public class Ej2Extraccion implements Runnable{


    Thread t;
    Ej2Principal cuenta;
    int cantidad;
	
	Ej2Extraccion(Ej2Principal cuenta, int cantidad){
        
        this.cuenta = cuenta;
        this.cantidad = cantidad;
        t = new Thread(this, "Thread ingreso");
		t.start();
		
	}


    @Override
    public void run() {
        cuenta.setValor(cuenta.getValor()-cantidad);
        // System.out.println("Extraccioncita " + cantidad);
    }

}