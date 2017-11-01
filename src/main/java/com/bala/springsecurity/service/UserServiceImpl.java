package com.bala.springsecurity.service;

import com.bala.springsecurity.dao.UserDao;
import com.bala.springsecurity.model.Role;
import com.bala.springsecurity.model.User;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao; 
  /*  @Autowired
    private UserRepository userRepository;
    
    
    @Autowired
    private RoleRepository roleRepository;
    */
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void save(User user) {
         
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<Role>(userDao.getAllRoles()));
        userDao.save(user);
    }

    public User findByUsername(String username) {
        return userDao.getByUsername(username);
    }
}
