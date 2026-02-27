package com.ghabryella.course.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = -1181838516508339182L;

    public DatabaseException(String msg){
        super(msg);
    }
}
