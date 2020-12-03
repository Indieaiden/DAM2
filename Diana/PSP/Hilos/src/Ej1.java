import java.time.LocalDateTime;

public class Ej1 implements Runnable{

	Thread t;
	
	Ej1(String name){
		t = new Thread(this, "Nuevo Thread");
		t.start();
		t.setName(name);
		
	}
	
	
	@Override
	public void run() {
		
		LocalDateTime locaDate = LocalDateTime.now();
		int hours  = locaDate.getHour();
		int minutes = locaDate.getMinute();
		int seconds = locaDate.getSecond(); 
		
		try {
			System.out.println("Nombre del hilo: " + t.getName() +", Hora actual: " + hours  + ":"+ minutes +":"+seconds);
			t.sleep(1000);
			System.out.println("Nombre del hilo: " + t.getName() +", Hora actual: " + hours  + ":"+ minutes +":"+seconds);
			t.sleep(1000);
			System.out.println("Nombre del hilo: " + t.getName() +", Hora actual: " + hours  + ":"+ minutes +":"+seconds);
			t.sleep(1000);
			System.out.println("Nombre del hilo: " + t.getName() +", Hora actual: " + hours  + ":"+ minutes +":"+seconds);
			t.sleep(1000);
			System.out.println("Nombre del hilo: " + t.getName() +", Hora actual: " + hours  + ":"+ minutes +":"+seconds);
			t.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
