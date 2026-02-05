package com.sreekar.RESTAPI.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ResponseStatus
@ControllerAdvice

public class RestResponseExceptionEntityHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(deptnotfound.class)
 public ResponseEntity<ErrorMessage> meth(deptnotfound d, WebRequest w){
      ErrorMessage m=new ErrorMessage(HttpStatus.NOT_FOUND,d.getMessage());
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(m);
 }
}
