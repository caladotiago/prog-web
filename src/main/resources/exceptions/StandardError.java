package exceptions;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class StandardError implements Serializable {
    private LocalDateTime timestamp;
    private HttpStatus status;
    private String error;
    private String message;
    private String path;

    private String serialVersionUID;    
    
    public StandardError() {
    }


    public StandardError(LocalDateTime timestamp, HttpStatus status, String error, String message, String path) {
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


    public String getError() {
        return error;
    }


    public void setError(String error) {
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
