package br.com.writ.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LoggerController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggerController.class);
	
	@PostMapping(consumes = {"application/json", "application/xml", "text/plain"})
	public void log(@RequestBody String toLog) {
		LOGGER.info("Message to log is: " + toLog);
	}
	
}
