package Ej1Calculadora;

public class Operaciones {

	public int num1;
	public int num2;
	static double resultado;

	
	public Operaciones(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public void suma(int num1, int num2) {
		resultado = num1 + num2;
		System.out.println("El resultado es: " + resultado);
	}
	
	
	public void resta(int num1, int num2) {
		resultado = num1 - num2;
		System.out.println("El resultado es: " + resultado);
	}
				
	
	public void multiplicar(int num1, int num2) {
		resultado = num1 * num2;
		System.out.println("El resultado es: " + resultado);
	}		
		
		
	public void dividir(int num1, int num2) {
		resultado = num1 / num2;
		System.out.println("El resultado es: " + resultado);
	}
	
	
}
