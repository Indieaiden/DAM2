/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1.ClasesUtiles;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge
 */
public class AccesoFicheros {
    public File fichero;
    
    public void procesarConBuffer () {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fichero.getName()));
            String linea = reader.readLine();
            while (linea != null) {
            //Procesar Linea
            linea = reader.readLine();
            } 
            reader.close();
        } catch (FileNotFoundException ex) {
            //NO se encuentra el fichero
        } catch (IOException ex) {
            //Algo va mal al leer o cerrar
        }
    }
}
