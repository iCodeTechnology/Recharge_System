package com.rechargesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rechargesystem.models.Login;
import com.rechargesystem.service.LoginService;

@Controller
public class RechargeSystemController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/")
	public String applicationLogin() {
		System.out.println("AppController --> login");
		
		return "index";
	}
	@RequestMapping("/login")
	public ModelAndView getLogin()
	{
		ModelAndView modelAndView = new ModelAndView();
		List<Login> loginDetails = loginService.getLoginDetails();
		System.out.println(loginDetails);
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping("/admin")
	public ModelAndView showLayout()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("SuperAdmin/home");
		return modelAndView;
	}
	
}
