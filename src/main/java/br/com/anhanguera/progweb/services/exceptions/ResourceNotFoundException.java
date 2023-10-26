package br.com.anhanguera.progweb.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super("Error! Resource not found!");
    }
}
