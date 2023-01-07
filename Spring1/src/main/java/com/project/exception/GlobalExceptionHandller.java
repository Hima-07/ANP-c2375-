package com.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandller extends ResponseEntityExceptionHandler{

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ErrorMessage> handlerEntityException
	(CustomerNotFoundException ce,WebRequest wr){
		ErrorMessage em =new ErrorMessage(HttpStatus.NOT_FOUND , ce.getMessage() );
		return ResponseEntity.status(HttpStatus.NOT_FOUND ).body(em);	
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorMessage> handlerEntityException
	(ProductNotFoundException pe,WebRequest wr){
		ErrorMessage er = new ErrorMessage(HttpStatus.NOT_FOUND ,pe.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
		}

}
