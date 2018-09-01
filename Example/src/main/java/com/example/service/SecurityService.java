package com.example.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.example.bean.Register;
import com.example.exception.InvalidRequestException;

@Service
public interface SecurityService {

	public void saveDetails(Register regReq, HttpServletRequest httpReq) throws InvalidRequestException;

	
}
