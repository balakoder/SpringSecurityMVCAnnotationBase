package com.bala.springsecurity.service;

import com.bala.springsecurity.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
