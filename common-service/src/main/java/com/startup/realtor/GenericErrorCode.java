package com.startup.realtor;

/**
 * Enumeration with generic error codes for application errors
 */
public enum GenericErrorCode {
    BUSINESS_ERROR("BUSINESS_ERROR"),
    VALIDATION_ERROR("VALIDATION_ERROR"),
    MISSING_REQUIRED_FIELD_ERROR("MISSING_REQUIRED_FIELD_ERROR"),
    OBJECT_VERSION_MISMATCH_ERROR("OBJECT_VERSION_MISMATCH_ERROR"),
    NOT_FOUND_ERROR("NOT_FOUND_ERROR"),
    SERVICE_CALL_ERROR("SERVICE_CALL_ERROR"),
    FORBIDDEN_ERROR("FORBIDDEN_ERROR"),
    UNAUTHORIZED_ERROR("UNAUTHORIZED_ERROR"),
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR");

    private String value;

    GenericErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
