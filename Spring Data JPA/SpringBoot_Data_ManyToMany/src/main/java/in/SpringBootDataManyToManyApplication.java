package in;

import in.service.ApplicationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDataManyToManyApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataManyToManyApplication.class, args);

		ApplicationService service = context.getBean(ApplicationService.class);

		System.out.println("Application Started.....");

		//service.insertData();
		//getting method called
		service.gettingAllData();
		//service.deleteData();
	}

}
