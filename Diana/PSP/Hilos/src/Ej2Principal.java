import java.io.*;



public class Ej2Principal {
    /* public static void main(String[] args) throws IOException{

        int dineroActualenCuenta = 100;
        int cantidad;

        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        
        System.out.println("Indique si quiere ingresar dinero en su cuenta o extraer:");
        System.out.println(" 1-Ingresar \n 2-Extraer");
        
        //Recoger el input de opcion
        String opcion = in.readLine();

        while (opcion.equalsIgnoreCase("1") || opcion.equalsIgnoreCase("2")){
            //Lo que queremos hacer
            switch(opcion){
                case "1":
                    System.out.println("Cuánto dinero quieres ingrsar?");
                    cantidad = Integer.parseInt(in.readLine());

                    //lanzar hilo ingresar
                    Ej2Ingreso hilo1= new Ej2Ingreso(dineroActualenCuenta, cantidad);

                    System.out.println("hola 1");
                    //opcion = in.readLine();
                    break;
                case "2":
                    //lanzar hilo extraer
                    System.out.println("hola 2");
                    opcion = in.readLine();
                    break;
            }
        }
        System.out.println("Dato incorrecto");
    }
    */
    //Declaracion de variables
    static int dinero;

    //Constructor
    public Ej2Principal(int dinero){
        this.dinero = dinero;
    }

    public static void main(String[] args){
        Ej2Principal cuenta = new Ej2Principal(1000);
        for (int i = 0; i < 10; i++) {
            Ej2Ingreso hilo1= new Ej2Ingreso(cuenta, 25);
            System.out.println("Dinero actual " + dinero);
        }
        for (int j = 0; j < 5; j++) {
            Ej2Extraccion hilo2 = new Ej2Extraccion(cuenta, 25);
            System.out.println("Dinero actual " + dinero);
        }
    }
    
    public int getValor(){
        return this.dinero;
    }
    public void setValor(int valor){
        this.dinero = valor;
    }
    
}