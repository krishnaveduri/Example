package com.example.validator;

import com.example.bean.Register;
import com.example.constant.ErrorMessage;
import com.example.exception.InvalidRequestException;
import com.example.util.StringUtil;





public class SecurityValidator {

	public void validate(Register regReq) throws InvalidRequestException {
		if(regReq==null
				|| StringUtil.isNullOrEmpty(regReq.getFirstName())
				|| StringUtil.isNullOrEmpty(regReq.getLastName())
				|| StringUtil.isNullOrEmpty(regReq.getEamilId())
				|| StringUtil.isNullOrEmpty(regReq.getPassword()))
		{
			throw new InvalidRequestException(ErrorMessage.Invalid_Request);
		}
		
	}

}
