package com.rechargesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan({"com.rechargesystem"})
@EntityScan("com.rechargesystem")
@EnableJpaRepositories("com.rechargesytem.repository")
@ComponentScan(basePackages = {"com"})
public class RechargeSystemApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(RechargeSystemApplication.class, args);
	}
}
