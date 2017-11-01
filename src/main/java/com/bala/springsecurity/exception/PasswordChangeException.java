package com.bala.springsecurity.exception;

class PasswordChangeException extends BaseException {
	public PasswordChangeException(int status,int errorCode,String message, String extendedMessage ,String moreInfo){
		super(status,errorCode,message, extendedMessage ,moreInfo);
	}
}
