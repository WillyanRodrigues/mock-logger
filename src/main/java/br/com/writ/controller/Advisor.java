package br.com.writ.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Advisor {

	private static final Logger LOGGER = LoggerFactory.getLogger(Advisor.class);
	
	@ExceptionHandler(Exception.class)
	public void handle (Exception e) {
		e.printStackTrace();
		LOGGER.error(e.getMessage());
	}
	
}
