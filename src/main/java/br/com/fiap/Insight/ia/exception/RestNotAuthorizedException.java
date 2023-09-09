package br.com.fiap.Insight.ia.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class RestNotAuthorizedException extends RuntimeException {
   
    public RestNotAuthorizedException(String message) {
        super(message);
    }
}
