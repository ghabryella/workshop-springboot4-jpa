package com.ghabryella.course.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -5831360866329434017L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
