package ru.clmtra.powerchatter.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String ex) {
        super(ex);
    }

}
