package com.NewPro.newProj;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "Value Not Found")
public class NotFoundEception extends RuntimeException{
    public NotFoundEception() {
    }

    public NotFoundEception(String message) {
        super(message);
    }

    public NotFoundEception(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundEception(Throwable cause) {
        super(cause);
    }

    public NotFoundEception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
