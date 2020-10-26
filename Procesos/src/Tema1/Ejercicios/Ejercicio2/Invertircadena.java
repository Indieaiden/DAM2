package PSP.Tema1.Ejercicios.Ejercicio2;

public class Invertircadena {
    public static void main(String[] args) {
       
        System.out.println("Cadena normal: "+ args[0]);
        System.out.println("Cadena invertida: "+ InvertirCadena(args[0]));
        
    }

    public static String InvertirCadena(String cadena){
        
        String cadenaInv = new String();
        char[] cadena_char = cadena.toCharArray();

        for (int i = cadena_char.length; i > 0 ; i--) {
            cadenaInv = cadenaInv+cadena_char[i];
        }
        return cadenaInv;
    }
}
