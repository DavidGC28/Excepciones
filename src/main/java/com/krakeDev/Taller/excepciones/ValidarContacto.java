package com.krakeDev.Taller.excepciones;

public class ValidarContacto {

    
    public static void validarTelefono(String telefono) throws IllegalArgumentException {
        
      
        if (telefono == null || telefono.length() != 10) {
            throw new IllegalArgumentException("Ingrese un Numero válido");
        }
    }
}