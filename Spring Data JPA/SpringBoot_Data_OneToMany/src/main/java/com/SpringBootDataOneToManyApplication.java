package com;

import com.service.ApplicationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDataOneToManyApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataOneToManyApplication.class, args);

		ApplicationService service = context.getBean(ApplicationService.class);

		System.out.println("Application Started....");

		//Calling service method to insert data
		service.insertData();

		//Calling service method to getting All users data
		//service.gettingAllData();

		//delete by Ids
		//service.deleteById();
	}

}
