package com.bala.springsecurity.service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bala.springsecurity.model.User;
import com.bala.springsecurity.exception.AccountException;
public class UserExceptionService {

	
	
	@Transactional 
	void checkUser(User user)  {
		
 
		if(user == null){
			int errorCode = 404;
			int status = 104;
			String message = "hello error occured";
			String extendedMessage = "error occured due to user not found";
			String moreInfo = "Hello";
			try {
				throw new AccountException(status,errorCode,message,extendedMessage,moreInfo);
			} catch (AccountException e) {
				// TODO Auto-generated catch block
 
			}
		}
}
}