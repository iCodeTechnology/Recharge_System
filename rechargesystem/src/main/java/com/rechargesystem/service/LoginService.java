package com.rechargesystem.service;

import java.util.List;

import com.rechargesystem.models.UserLogin;

public interface LoginService {
	public void saveLogin(UserLogin login);
	
	public List<UserLogin> getLoginDetails();
}
