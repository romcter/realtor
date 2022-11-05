package com.startup.realtor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseException extends RuntimeException {

    private String code;
    private String message;
    private HttpStatus httpStatus;
    private Map<String, Object> values;

    public BaseException(String code, String message, HttpStatus status) {
        this(code, message, status, new HashMap<>());
    }

    public BaseException(String code, String message, HttpStatus status, Map.Entry<String, Object>... mapEntry) {
        this(code, message, status);
        for (Map.Entry<String, Object> entry : mapEntry) {
            values.put(entry.getKey(), entry.getValue());
        }
    }
}
