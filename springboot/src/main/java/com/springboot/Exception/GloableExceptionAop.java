package com.springboot.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GloableExceptionAop {
   @ExceptionHandler(RuntimeException.class)
   @ResponseBody
	public String runtimeException() {
		return "出现错误";
	}
}
