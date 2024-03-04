package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.service.FlipkartService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		FlipkartService service = context.getBean(FlipkartService.class);
		
		//calling service class method  FlipkartService object 
		
		//service.addProduct();
		
		//service.getAllProduct();
		
		//service.findbyQty();
		
		//service.findByname();
		
		//service.findByPriceAndName();
		
		service.deleteById();

	}

}
