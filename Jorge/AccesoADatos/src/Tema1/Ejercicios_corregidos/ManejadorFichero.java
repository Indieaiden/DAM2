package AccesoDatos.Tema1.Ejercicios_corregidos;
import java.io.*;
/**
 * Cuatro primeros ejercicios sin pruebas ni main hechos.
 */
public class ManejadorFichero {
    
    private File f;

    public ManejadorFichero()
    {

    }

    /**
     * EJERCICIO1
     * @param nombreFichero
     * @param dir
     * @return
     */
    public boolean estaEn(String nombreFichero, String dir) {
        boolean resultado = false;
        //Esto está puesto así para que coja un nullpointer
        try {
            this.f = new File(dir, nombreFichero);
            resultado = f.exists();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("No vale null");            
        }
        return resultado;
    }

    /**
     * EJERCICIO 2
     * @param directorio
     * @return
     * 
     * Saco el listado 
     */
    public void mostrarDirect(String directorio){
        File f=new File(directorio);
        String[] array = f.list();
        for (String string : array) {
            System.out.println(string);
        }
    }

    /**
     * EJERCICIO3 
     */

    public boolean esDirectorio(String nombreFichero){
            boolean resultado=false;
            f=new File(nombreFichero);
            if (f.isDirectory()) {
                resultado = true;
                this.mostrarDirect(nombreFichero);
            }
            return resultado;
    }

    /**
     * EJERCICIO4
     */
    public void infoFichero(String fichero, String directorioActual){
        if (this.estaEn(fichero, directorioActual)) {
            File f = new File(fichero);
            System.out.println("Nombre: "+f.getName());
            System.out.println("Ruta: "+f.getAbsolutePath());
            System.out.println("Leer: "+f.canRead());
            System.out.println("Tamaño: "+f.getTotalSpace());
            if (this.esDirectorio(fichero)) {
                System.out.println("Es un directorio");
            } else {
                System.out.println("Es un fichero");
            }
        } else {
            System.out.println("No existe aquí");
        }
    }
}
