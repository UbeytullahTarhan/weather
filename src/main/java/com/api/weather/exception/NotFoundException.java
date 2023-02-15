package com.api.weather.exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message+" Not Found !");
    }
}
