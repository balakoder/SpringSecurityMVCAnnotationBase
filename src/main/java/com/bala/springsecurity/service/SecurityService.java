package com.bala.springsecurity.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
