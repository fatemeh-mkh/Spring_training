package com.NewPro.newProj;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler()
    public ResponseEntity<String> handleNotFoundException(){
        return ResponseEntity.notFound().build();
    }

}
