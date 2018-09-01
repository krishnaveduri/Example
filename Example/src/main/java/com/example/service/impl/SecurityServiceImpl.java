package com.example.service.impl;


import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bean.Register;
import com.example.exception.InvalidRequestException;
import com.example.service.SecurityService;
import com.example.validator.SecurityValidator;

@Service
public class SecurityServiceImpl implements SecurityService{

	private static final Logger LOG = LoggerFactory.getLogger(SecurityServiceImpl.class);
	
	@Autowired
	SecurityValidator securityValidator;
	
	@Override
	public void saveDetails(Register regReq, HttpServletRequest httpReq) throws InvalidRequestException {
		
		securityValidator.validate(regReq);
	}

}
