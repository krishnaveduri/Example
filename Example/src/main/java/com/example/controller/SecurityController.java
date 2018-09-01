package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Krishna
 *  
 *  Security Controller
 */
@RestController
@RequestMapping(value="/example/api")
public class SecurityController {

	
	private static final Logger LOGG=LoggerFactory.getLogger(SecurityController.class);
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	private void registeration()
	{
		
	}
}
