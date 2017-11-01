package com.bala.springsecurity.exception;

class SecurityException extends BaseException {
	
	public SecurityException(int status,int errorCode,String message, String extendedMessage ,String moreInfo){
		super(status,errorCode,message, extendedMessage ,moreInfo);
	}
	
}

