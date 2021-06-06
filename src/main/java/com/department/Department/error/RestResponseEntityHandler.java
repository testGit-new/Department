package com.department.Department.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(DepartentNotFondException.class)
	public ResponseEntity<ErrorMessage> departmentNotFondException(DepartentNotFondException
			                departentNotFondException , WebRequest request) {
		ErrorMessage  errorMessage = new  ErrorMessage(HttpStatus.NOT_FOUND,
				                    departentNotFondException.getMessage());
		
		return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	}

}
