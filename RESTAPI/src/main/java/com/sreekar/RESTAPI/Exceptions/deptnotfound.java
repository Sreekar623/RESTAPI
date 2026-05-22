package com.sreekar.RESTAPI.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="nigg")
public class deptnotfound extends RuntimeException{


    public deptnotfound() {
        super();
    }

    public deptnotfound(String message) {
        super(message);
    }

    public deptnotfound(String message, Throwable cause) {
        super(message, cause);
    }

    public deptnotfound(Throwable cause) {
        super(cause);
    }

    protected deptnotfound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
