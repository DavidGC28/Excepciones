package com.krakeDev.Taller.excepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

    private static final Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        
        // PRUEBA OBLIGATORIA 1: Cambia esto a "123" para probar el error,
        // o a "0981234567" para probar el flujo exitoso.
        String telefonoPrueba = "123"; 

        try {
            log.info("Iniciando validación del teléfono: " + telefonoPrueba);
            
            // 1. Llamar a ValidarContacto (puede lanzar IllegalArgumentException)
            ValidarContacto.validarTelefono(telefonoPrueba);
            
            // Si pasa la validación sin errores, continuamos:
            log.info("Teléfono válido. Procediendo a guardar el contacto...");
            
            // 2. Llamar a GuardarContacto para guardar en el archivo
            GuardarContacto.guardar();
            
            // 3. Llamar a LeerContacto para leer y mostrar el archivo
            LeerContacto.leer();
            
            log.info("¡Proceso completado con éxito!");

        } catch (IllegalArgumentException e) {
            // 4. Manejar aquí la excepción propagada
            log.error("Error de validación: El teléfono ingresado no es válido.", e);
        }
    }
}