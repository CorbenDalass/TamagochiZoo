package com.level.zoo;

public class AgeException extends Exception {

    @Override
    public String getMessage() {
        return "Ошибся возрастом";
    }
}