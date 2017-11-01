/*package com.bala.taskmanager.service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import com.bala.taskmanager.WelcomeController;
import com.bala.taskmanager.dao.UserDao;
import com.bala.taskmanager.domain.MyDay;
import com.bala.taskmanager.domain.Expense;
import com.bala.taskmanager.domain.User;
import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
@Transactional
public class UserService2 {

	 @Autowired
	  private SessionFactory _sessionFactory;
	  private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
	  private Session getSession() {
	    return _sessionFactory.getCurrentSession();
	  }

	  
	 public boolean login(final String email, final String password) {
		   logger.info("****************getByEmail*****************************.", "getByEmail");
		     
		    	@SuppressWarnings("unchecked")
					List<User> users = (List<User>) getSession().createQuery(
			        "from User where email = :email")
			        .setParameter("email", email)
			        .setParameter("password", password)
			        .uniqueResult();
	     	        
	        return (users != null && !users.isEmpty());
	    }
}
*/