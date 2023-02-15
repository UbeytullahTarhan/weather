package com.api.weather.exception;

public class InvalidDay extends RuntimeException{
    public InvalidDay() {
        super("Invalid Day please check");
    }
}
