package PSP.Tema1.Ejercicios.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
            Menu();
        }
    

    /**
     * Devuelve false si no quiere salir y true si quiere salir (opcion 4)
     */
    public static void Menu(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        int num1, num2;

 
        while (!salir) {
 
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicac");
            System.out.println("4. Division");
            System.out.println("5. Salir");

 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Escribe el primer numero a sumar");
                        num1 = sn.nextInt();
                        System.out.println("Escribe el segundo numero a sumar");
                        num2 = sn.nextInt();
                        System.out.println("La suma es: " + Operat.suma(num1, num2));
                        break;
                    case 2:
                        System.out.println("Escribe el primer numero a restar");
                        num1 = sn.nextInt();
                        System.out.println("Escribe el segundo numero a restar");
                        num2 = sn.nextInt();
                        System.out.println("La resta es: " + Operat.resta(num1, num2));
                        break;
                    case 3:
                        System.out.println("Escribe el primer numero a multiplicar");
                        num1 = sn.nextInt();
                        System.out.println("Escribe el segundo numero a multiplicar");
                        num2 = sn.nextInt();
                        System.out.println("La multiplicacion es: " + Operat.multip(num1, num2));
                        break;
                    case 4:
                        System.out.println("Escribe el primer numero a dividir");
                        num1 = sn.nextInt();
                        System.out.println("Escribe el segundo numero a dividir");
                        num2 = sn.nextInt();
                        System.out.println("La division es: " + Operat.divis(num1, num2));
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
    }
    sn.close();
}
}
