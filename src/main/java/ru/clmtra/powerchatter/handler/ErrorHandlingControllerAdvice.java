package ru.clmtra.powerchatter.handler;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.clmtra.powerchatter.exception.UserNotFoundException;

@ControllerAdvice
public class ErrorHandlingControllerAdvice {

    @ExceptionHandler({UserNotFoundException.class})
    @ResponseStatus(HttpStatus.CONFLICT)
    public void handleUserNotFound() {
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public void handleMethodArgumentNotValid() {
    }
}