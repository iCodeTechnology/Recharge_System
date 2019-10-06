package com.rechargesystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rechargesystem.models.Login;
import com.rechargesystem.service.LoginService;
import com.rechargesytem.repository.LoginRepository;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public void saveLogin(Login login) {	
		loginRepository.save(login);
	}

	@Override
	public List<Login> getLoginDetails() {
		return  loginRepository.findAll();
	}
	
}
