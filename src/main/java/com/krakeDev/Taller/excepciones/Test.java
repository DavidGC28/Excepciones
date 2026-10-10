package com.krakeDev.Taller.excepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

    private static final Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        

        String telefonoPrueba = "0981234567"; 

        try {
            log.info("Iniciando validación del teléfono: " + telefonoPrueba);
            
            
            ValidarContacto.validarTelefono(telefonoPrueba);
            
            
            log.info("Teléfono válido. Procediendo a guardar el contacto...");
            
            
            GuardarContacto.guardar();
            
           
            LeerContacto.leer();
            
            log.info("¡Proceso completado con éxito!");

        } catch (IllegalArgumentException e) {
            
            log.error("Error de validación: El teléfono ingresado no es válido.", e);
        }
    }
}