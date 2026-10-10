package com.krakeDev.Taller.excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContacto {

    private static final Logger log = LoggerFactory.getLogger(LeerContacto.class);

    public static void leer() {
        BufferedReader lector = null;

        try {
           
            FileReader lectorArchivo = new FileReader("contactos.txt");
            lector = new BufferedReader(lectorArchivo);

       
            String linea;
            log.info("Iniciando la lectura del contacto:");
            
        
            for (linea = lector.readLine(); linea != null; linea = lector.readLine()) {
                System.out.println(linea);
            }

            log.info("Archivo leído correctamente.");

        } catch (FileNotFoundException e) {
            log.error("Error: El archivo de contactos no fue encontrado.", e);
        } catch (IOException e) {
            log.error("Error al leer el archivo.", e);
        } finally {
           
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException e) {
                log.error("Error al cerrar el Archivo", e);
            }
        }
    }
}