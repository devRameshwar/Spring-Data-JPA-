package com;

import com.service.ApplicationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDataManyToOneApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataManyToOneApplication.class, args);

		ApplicationService service = context.getBean(ApplicationService.class);

		System.out.println("Application Started...");
		//calling insert method to save data
		//service.insertData();

		//Calling service method to delete data
		//service.deleteDataFromTable();

		//Calling service method to getting data
		service.getAllUserAndServiceData();

	}

}
