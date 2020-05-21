/**
 * 
 */
package com.cl.elena.cloudclient.main.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author charlie
 *
 */
@ControllerAdvice()
public class CustomizeResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * 
	 */
	public CustomizeResponseEntityExceptionHandler() {
		// TODO Auto-generated constructor stub
	}

	@ExceptionHandler()
    @ResponseBody
    ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex) {
        HttpStatus status = getStatus(request);
        System.out.println("status value :" + status.value() + status.name());
        return new ResponseEntity<>(new CustomErrorType(status.value(), ex.getMessage()), status);
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}

class CustomErrorType {
	
	public int getStatusValueString() {
		return statusValueString;
	}
	public void setStatusValueString(int statusValueString) {
		this.statusValueString = statusValueString;
	}
	public String getErrorMessageString() {
		return errorMessageString;
	}
	public void setErrorMessageString(String errorMessageString) {
		this.errorMessageString = errorMessageString;
	}
	public int statusValueString;
	public String errorMessageString;
	public CustomErrorType (int value, String message) {
		this.statusValueString = value;
		this.errorMessageString = message;
	}
}
