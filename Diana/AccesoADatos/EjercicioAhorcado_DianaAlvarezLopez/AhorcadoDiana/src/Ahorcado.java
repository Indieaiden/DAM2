public class Ahorcado {
	
	private static String procedencia;
	private static String nombre;
	
	public static void main(String[] args) {
		try {	
			
			if(args.length == 2) {
				procedencia = args[0];
				nombre = args[1];
				
				if(procedencia.equals("ficheroChar") && nombre.equals("palabras.txt")) {    //si se va a utilizar el fichero de caracteres
					FicheroCaracteres fic = new FicheroCaracteres();
					fic.ahorcado(nombre);
				}
				if(procedencia.equals("fichero") && nombre.equals("fichero.txt")) {
					ficheroPrimitivo fic = new ficheroPrimitivo();
					fic.ahorcado(nombre);
				}
				if(procedencia.equals("xml") && nombre.equals("palabras.xml")) {
					ficheroXML fic = new ficheroXML();
					fic.ahorcado(nombre);
				}
				if(procedencia.equals("bd") && nombre.equals("palabritas")) {
					BaseDeDatos bd = new BaseDeDatos();
					//fic.recuperar(nombre);                                                         ////////////////
				}
				if(procedencia.equals("recup") && nombre.equals("partidaGuardada.txt")) {
					recuperarPartida rec = new recuperarPartida();
					rec.recuperar();
				}
						
			}if(args.length != 2) {
				System.out.println("Tienes que introducir 2 argumentos");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
