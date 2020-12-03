package AccesoDatos.Tema1.FicherosParte2;

import java.io.*;


public class Ejercicio5 {
    public Ejercicio5(String filep) {
        File file = new File(filep);
        borrarTodo(file);   
    }

    public void borrarTodo(File archivo){
        /**
         * Comprobamos si es un directorio, y empezamos
         * la recursividad.
         */

        if (archivo.isDirectory()) {
            
            File[] archivos_dentro = archivo.listFiles();
            if (archivos_dentro.length > 0) {
                for (File file : archivos_dentro) {
                    borrarTodo(file);
                }
            } else {
                archivo.delete();
            }
            //Si no es directorio pues se borra y apañao
        } else {
            archivo.delete();
        }
    }
}
