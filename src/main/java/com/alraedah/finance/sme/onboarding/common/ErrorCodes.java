package com.alraedah.finance.sme.onboarding.common;

public enum ErrorCodes {

	SYS_SERVICE_ERROR("Unable to process request right now."),
	SYS_DEAFUT_ERROR("System under maintenance, please try later.");

	private String code;
	private String desc;

	private ErrorCodes(String desc) {
		this.code = name();
		this.desc = desc;

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
