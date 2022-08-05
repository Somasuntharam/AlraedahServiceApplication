package com.alraedah.finance.sme.onboarding.dtos;

import java.io.Serializable;

import com.alraedah.finance.sme.onboarding.common.ErrorCodes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo implements Serializable {

	private static final long serialVersionUID = -5094260687345124222L;
	private String code;
	private String desc;

	public ErrorInfo(ErrorCodes errorCodes) {
		super();
		this.setCode(errorCodes.getCode());
		this.setDesc(errorCodes.getDesc());
	}

	public ErrorInfo(String code, String desc) {
		super();
		this.setCode(code);
		this.setDesc(desc);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
