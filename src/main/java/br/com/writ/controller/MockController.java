package br.com.writ.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mock")
public class MockController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MockController.class);
	
	@GetMapping(value = "/api/v1/customerOrderManagement/getCustomerOrderStatus/{QUOTEID}", produces = "application/json")
	public ResponseEntity<String> getCustomerOrderStatus(@PathVariable(name = "QUOTEID") String quoteId) {
		LOGGER.info("QUOTEID is: " + quoteId);
		return ResponseEntity.ok("{\r\n" + 
				"   \"mobileStatus\":\"In Progress\",\r\n" + 
				"   \"bpelStatus\":\"Completed\"\r\n" + 
				"}");
	}
	
	
}
