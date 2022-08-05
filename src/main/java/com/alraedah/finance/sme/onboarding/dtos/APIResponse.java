package com.alraedah.finance.sme.onboarding.dtos;

import java.io.Serializable;

import com.alraedah.finance.sme.onboarding.common.ErrorCodes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class APIResponse implements Serializable{

	
	private static final long serialVersionUID = -5086222049713519143L;
	private ErrorInfo errorInfo;
	
	public APIResponse(ErrorCodes errorCodes) {
		super();
		this.setErrorInfo(new ErrorInfo(errorCodes.getCode(),errorCodes.getDesc()));
	}

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	
	

}
