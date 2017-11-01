package com.bala.springsecurity.exception;

 
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
 

public  class BaseException extends Exception {
	private int status ;
	private String devMessage;
	private String extendedMessage;
	private String moreInfo;
	private int errorCode;
	boolean error = true;
	public static final String STATUS = "status";
	public static final String ERRORCODE = "errorCode";
	public static final String MESSAGE = "message";
	public static final String EXTENDEDMESSAGE = "extendedMessage";
	public static final String MOREINFO = "moreInfo";
	public static final String ERROR = "error";
	public static final String DATETIMESTAMP = "dateTimeStamp";
	
	public BaseException(int status,int errorCode,String message, String extendedMessage ,String moreInfo){
		this.errorCode =  errorCode;
		this.status = status;
		this.devMessage = message;
		this.extendedMessage = extendedMessage;
		this.moreInfo = moreInfo;
	}
	
	public Map errorResponse(){
		
		Map  errorJson = new HashMap();
		errorJson.put(STATUS,this.status);
		errorJson.put(ERRORCODE,this.errorCode);
		errorJson.put(MESSAGE,this.devMessage);
		errorJson.put(EXTENDEDMESSAGE,this.extendedMessage);
		errorJson.put(MOREINFO,this.getMessage());
		errorJson.put(ERROR,error);
		errorJson.put(DATETIMESTAMP, new Date());
		return errorJson;
	   }
}