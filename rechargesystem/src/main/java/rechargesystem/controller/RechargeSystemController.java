package rechargesystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class RechargeSystemController {
	@RequestMapping("/")
	public String applicationLogin() {
		System.out.println("AppController --> login");
		
		return "index";
	}

}
