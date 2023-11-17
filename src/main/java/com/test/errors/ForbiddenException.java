package com.test.errors;

import java.lang.Exception;

public class ForbiddenException extends Exception {

    public ForbiddenException(String message) {
        super(message);
    }
}