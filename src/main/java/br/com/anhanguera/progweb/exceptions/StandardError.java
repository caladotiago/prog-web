package br.com.anhanguera.progweb.exceptions;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class StandardError implements Serializable {
    private LocalDateTime timestamp;
    private HttpStatus status;
    private Exception error;
    private String message;
    private String path;

    private String serialVersionUID;    
    
    public String getSerialVersionUID() {
        return serialVersionUID;
    }


    public void setSerialVersionUID(String serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }


    public StandardError() {
    }


    public StandardError(LocalDateTime timestamp, HttpStatus status, Exception error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }


    public LocalDateTime getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }


    public HttpStatus getStatus() {
        return status;
    }


    public void setStatus(HttpStatus status) {
        this.status = status;
    }


    public Exception getError() {
        return error;
    }


    public void setError(Exception error) {
        this.error = error;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }
    
}
