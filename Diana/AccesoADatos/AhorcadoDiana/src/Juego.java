import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Juego {

	private char letra;
	private boolean encontrado = false;
	private int vidas = 6;
	private int contadorLetrasAcertadas = 0;
	private String letrasQueNoEstan ="";
	
	public void juego(String fuente, String linea, int partidasGanadas, int partidasPerdidas) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String palabrita = linea;
		
		char[] palabra = new char[palabrita.length()]; //crear un array del tamaño de la palabra
		char[] aux = new char[palabrita.length()-2];  //crear un array aux
		
		for (int i=0; i<palabrita.length(); i++) {  //separar la palabra en chars y meterlas en el array
			palabra[i] = palabrita.charAt(i);  
		}
		for (int i=0; i<aux.length; i++) { //poner * en aux
			aux[i] = '*';
		}
		System.out.println("-"+palabrita);																			////////////
		
		
		int cantidadLetras = palabrita.length()-1;
		
		while(vidas>0 && encontrado==false) {
			System.out.print(palabra[0]);  //mostrar la primera letra
			for (int i = 0; i < aux.length; i++) {
				System.out.print(aux[i]);  //mostrar los *
			}
			System.out.print(palabra[cantidadLetras]);  //mostrar la ultima letra
			
			System.out.println(" vidas:" + vidas + ", Partidas ganadas:" +partidasGanadas+ ", Partidas perdidas:" +partidasPerdidas);
			System.out.println(letrasQueNoEstan.toUpperCase());
			
			boolean estaLetra = false;
			
				try { 
					letra=in.readLine().charAt(0);   //leer la letra y convertir a char
				} catch (IOException e) {
					e.printStackTrace();
				}   
				
				//OPCIONES ESPECIALES
				if(String.valueOf(letra).equals("#")) {
					System.out.println("Juego terminado, ¡Adiós!");
					System.exit(0);
					
				}else if(String.valueOf(letra).equals("*")) {
					System.out.println("Partida guardada, ¡Hasta luego!");
					GuardarPartida gp = new GuardarPartida(vidas, partidasGanadas, partidasPerdidas, palabrita, letrasQueNoEstan, fuente);
					gp.guardar();
					System.exit(0);
					
				}else if(String.valueOf(letra).equals("?")) {
					System.out.println("Retomando la última partida guardada...");
					recuperarPartida rec = new recuperarPartida();
					rec.recuperar();

				}else {   						 
					if (Character.isLetter(letra)) {  //comprobar que SI es una letra
							
							for (int i=1; i<palabra.length-1; i++) { //buscar la letra en la palabra
								if(palabra[i]==letra) {
									estaLetra=true;
									aux[i-1]=letra;
									contadorLetrasAcertadas++;
								}
							}
							
							if(estaLetra==false) { //si la letra NO está
								vidas--;
								String.valueOf(letra);
								letrasQueNoEstan += letra; //guardar la letra en el string de las letras que no aparecen
								
							}else {
								if(contadorLetrasAcertadas == aux.length)
									encontrado=true;
							}
					}else {
						System.out.println("Introduce una letra, por favor.");
					}
				}
		}
		
		
		if(encontrado==true) {
			System.out.println(linea);
			System.out.println("¡Felicidades, has ganado!");
			System.out.println();
			partidasGanadas++;
			contadorLetrasAcertadas = 0;
			vidas = 6;
			encontrado=false;
			letrasQueNoEstan ="";
		}else {
			System.out.println("¡Has perdido!");
			System.out.println();
			partidasPerdidas++;
			contadorLetrasAcertadas = 0;
			vidas = 6;
			letrasQueNoEstan ="";
		}	
	}
}
