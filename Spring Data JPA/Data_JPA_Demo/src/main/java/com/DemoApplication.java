package com;

import com.entity.Employee;
import com.service.EmployeeServise;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		System.out.println("Welcome...");

		EmployeeServise employeeServise = context.getBean(EmployeeServise.class);
		//Entity Class object create
		Employee employee = new Employee();

		//setting the Employee Data
		employee.setEmployeeId("101");
		employee.setEmployeeId("Sivi Singh");
		employee.setSalary(100000);

		//calling service method to save employee data into dataBase
		//employeeServise.saveEmployee(employee);
		employeeServise.getAllEmployee();

	}

}
