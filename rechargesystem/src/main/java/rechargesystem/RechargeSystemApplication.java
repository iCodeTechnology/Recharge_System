package rechargesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(basePackages = {"rechargesystem.controller"})
public class RechargeSystemApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		System.out.println("This is for Test!!");
		SpringApplication.run(RechargeSystemApplication.class, args);
	}

}
