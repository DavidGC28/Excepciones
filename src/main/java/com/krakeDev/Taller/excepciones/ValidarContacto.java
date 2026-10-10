package com.krakeDev.Taller.excepciones;

public class ValidarContacto {

    // El throws en la firma avisa que este método propaga la excepción
    public static void validarTelefono(String telefono) throws IllegalArgumentException {
        
        // Si el teléfono es nulo o no tiene exactamente 10 dígitos, lanzamos la excepción
        if (telefono == null || telefono.length() != 10) {
            throw new IllegalArgumentException("El número de teléfono debe tener exactamente 10 dígitos.");
        }
    }
}