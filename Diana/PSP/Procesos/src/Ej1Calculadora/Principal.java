package Ej1Calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal { 
	
	public static final String TEXTO_PRINCIPIO = "Introduce dos números y selecciona una operacion.";
	public static final String TEXTO_NUM_1 = "Introduce el primer número";
	public static final String TEXTO_NUM_2= "Introduce el segundo número";
	public static final String TEXTO_OPERACIÓN= "Seleccione la operación que desea realizar:" + "\n" + "1.Sumar" + "\n" + "2.Restar" + "\n" + "3.Multiplicar" + "\n" + "4.Dividir";
	public static int num1;
	public static int num2;
	public static int operacion;
	
	
	
	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		try {
			System.out.println(TEXTO_PRINCIPIO + "\n" + TEXTO_NUM_1);
			num1 = Integer.parseInt(in.readLine());
			System.out.println("\n" + TEXTO_NUM_2);
			num2 = Integer.parseInt(in.readLine());
			System.out.println("\n" + TEXTO_OPERACIÓN);
			operacion = Integer.parseInt(in.readLine());
			
			Operaciones op = new Operaciones(num1, num2);
			
			switch(operacion) {
				case 1:
					op.suma(num1, num2);
					break;
					
				case 2:
					op.resta(num1, num2);
					break;
					
				case 3:
					op.multiplicar(num1, num2);
					break;
						
				case 4:
					op.dividir(num1, num2);
					break;	
			}
			
		} catch (NumberFormatException | IOException e) {
			System.err.println("Introduce un número.");
			e.printStackTrace();
		}
		
		
	}
	
	
}
