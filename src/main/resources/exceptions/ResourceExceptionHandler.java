package exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.anhanguera.progweb.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException resourceNotFoundException) {
        var standardError = new StandardError(
            LocalDateTime.now(),
            HttpStatus.NOT_FOUND,
            resourceNotFoundException.getClass(),
            resourceNotFoundException.getMessage(),
            resourceNotFoundException.getStackTrace()
        );
    }    
}
