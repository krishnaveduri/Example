package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Register;
import com.example.exception.InvalidRequestException;
import com.example.service.SecurityService;

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
	
	@Autowired
	SecurityService securityService;
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	private void registeration(@RequestBody Register regReq,HttpServletRequest httpReq) throws InvalidRequestException
	{
		securityService.saveDetails(regReq,httpReq);
	}
}
