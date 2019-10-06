package com.rechargesystem.service;

import java.util.List;

import com.rechargesystem.models.Login;

public interface LoginService {
	public void saveLogin(Login login);
	
	public List<Login> getLoginDetails();
}
