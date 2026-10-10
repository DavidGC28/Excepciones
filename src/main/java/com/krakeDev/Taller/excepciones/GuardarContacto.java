package com.krakeDev.Taller.excepciones;

import java.io.FileWriter;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {

    private static final Logger log = LoggerFactory.getLogger(GuardarContacto.class);

    public static void guardar() {
        FileWriter escritor = null; 

        try {
           
            escritor = new FileWriter("contactos.txt", true);
            
            escritor.write("Nombre: Maria\n");
            escritor.write("Apellido: Gomez\n");
            escritor.write("Telefono: 0981234567\n");
            escritor.write("--------------------\n"); 
            
            log.info("Contacto guardado exitosamente en el archivo.");

        } catch (IOException e) {
            log.error("Error de E/S al intentar guardar el contacto", e);
        } finally {
            
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException e) {
                log.error("Error al cerrar el archivo FileWriter", e);
            }
        }
    }
}