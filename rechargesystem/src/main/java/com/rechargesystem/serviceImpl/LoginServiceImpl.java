package com.rechargesystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rechargesystem.models.UserLogin;
import com.rechargesystem.service.LoginService;
import com.rechargesytem.repository.LoginRepository;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public void saveLogin(UserLogin login) {	
		loginRepository.save(login);
	}

	@Override
	public List<UserLogin> getLoginDetails() {
		return  loginRepository.findAll();
	}
	
}
