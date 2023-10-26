package br.com.anhanguera.progweb.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.anhanguera.progweb.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException resourceNotFoundException) {
        StandardError standardError = new StandardError(
            LocalDateTime.now(), 
            HttpStatus.NOT_FOUND, 
            resourceNotFoundException, 
            resourceNotFoundException.getMessage(), 
            "/users"        
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardError);
    }    
}
