package com.test.errors;

public enum ErrorCodes {
    SERVER_ERROR("server_error"),
    SPONSOR_NOT_FOUND("sponsor_not_found"),
    VALIDATION_ERROR("validation_error"),
    FORBIDDEN_ERROR("forbidden_error"),            
    UNPROCESSABLE_ENTITY_ERROR("unprocessable_entity_error"),  
    SERVICE_UNAVAILABLE_ERROR("service_unavailable_error");

    private String value;

    ErrorCodes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
