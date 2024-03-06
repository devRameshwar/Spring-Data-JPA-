package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.service.ApplicationService;

@SpringBootApplication
public class SpringBootDataOneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataOneToOneApplication.class, args);
		
		ApplicationService service = context.getBean(ApplicationService.class);

		System.err.println("test Application");
		//calling service method
		//service.addDataIntoUserAndAddress();

		//calling service  method delete byId
		//service.deleteUserAndAdddressData();

		//calling service method to getting all user data
		service.gettingAllDataitoDataBase();
		
		
	}

}
