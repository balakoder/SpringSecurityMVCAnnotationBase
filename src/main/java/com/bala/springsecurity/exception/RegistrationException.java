package com.bala.springsecurity.exception;

class RegistrationException extends BaseException {
	
	public RegistrationException(int status,int errorCode,String message, String extendedMessage ,String moreInfo){
		super(status,errorCode,message, extendedMessage ,moreInfo);
	}
	
}