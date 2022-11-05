package com.startup.realtor;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * Exception for handling not found errors
 * by default handled as http 404 status code.
 * Use when requested resource cannot be found.
 */
public class NotFoundException extends BaseException {

    public NotFoundException(String message) {
        super(GenericErrorCode.NOT_FOUND_ERROR.toString(), message, HttpStatus.NOT_FOUND, new HashMap<>());
    }

    public NotFoundException(String code, String message) {
        super(code, message, HttpStatus.NOT_FOUND, new HashMap<>());
    }

    public NotFoundException(String code, String message, Map<String, Object> values) {
        super(code, message, HttpStatus.NOT_FOUND, values);
    }

    public NotFoundException(String code, String message, Map.Entry<String, Object>... mapEntry) {
        super(code, message, HttpStatus.NOT_FOUND, mapEntry);
    }

    public NotFoundException(String code, String message, HttpStatus status) {
        super(code, message, status, new HashMap<>());
    }

    public NotFoundException(String code, String message, HttpStatus status, Map<String, Object> values) {
        super(code, message, status, values);
    }

    public NotFoundException(String code, String message, HttpStatus status, Map.Entry<String, Object>... mapEntry) {
        super(code, message, status, mapEntry);
    }

    public NotFoundException(Class<?> entityType, Long id) {
        super(
                GenericErrorCode.NOT_FOUND_ERROR.toString(),
                String.format("Entity type: %s with id: %s was not found", entityType.getSimpleName(), id),
                HttpStatus.NOT_FOUND,
                new HashMap<>()
        );
    }
}
