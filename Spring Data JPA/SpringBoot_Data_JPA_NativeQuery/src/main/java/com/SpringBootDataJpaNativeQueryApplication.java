package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.service.UserService;

@SpringBootApplication
public class SpringBootDataJpaNativeQueryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDataJpaNativeQueryApplication.class, args);

		UserService service = context.getBean(UserService.class);

		// service.saveUserData();

		// calling getAllDeta() method
		// service.getAllDeta();

		// calling gettingUserByEmail() method
		// service.gettingUserByEmail();

		// calling update method in service class
		// service.upadateEmail();

		// service.updateNameAndMobileNumber();

		// getting User Data using named based native query
		service.getUserByemail();
	}

}
