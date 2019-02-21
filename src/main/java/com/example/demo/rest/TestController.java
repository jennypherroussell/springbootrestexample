/**
 * 
 */
package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


/**
 * @author jroussell
 *
 */
@RestController
@Slf4j
public class TestController {

	@GetMapping(value = "/test")
	public ResponseEntity<?> saludo() {

		return new ResponseEntity<>("Hola Amigas estudiosas", HttpStatus.OK);
	}

}
