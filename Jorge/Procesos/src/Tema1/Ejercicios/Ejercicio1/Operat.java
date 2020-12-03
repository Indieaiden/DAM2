package PSP.Tema1.Ejercicios.Ejercicio1;

public class Operat {
    public static int suma (int num1, int num2){
        return num1+num2;
    }

    public static int resta (int num1, int num2){
        return num1-num2;
    }

    public static float multip (int num1, int num2){
        return num1*num2;
    }

    public static float divis (int num1, int num2){
        if (num2!=0) {
            return num1/num2;    
        }
        else return 0;
    }

}
