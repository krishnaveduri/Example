package com.example.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.example.constant.ErrorCode;
import com.example.exception.InvalidRequestException;

@ControllerAdvice(basePackages={"co.coinlancer.controller"})
public class SecuirtyControllerAdvice {

	private static final Logger LOG = LoggerFactory.getLogger(SecuirtyControllerAdvice.class);

	public void InvalidRequestException(InvalidRequestException e)
	{
		LOG.error(e.getMessage(), e);
		
	}
	
	
}
