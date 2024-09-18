package com.example.employeecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeecrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeecrudApplication.class, args);
	}

}

/*
*
* @SpringBootApplication: Combines @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations to bootstrap the application.
*
*
*
* Annotation  Explanation
*@SpringBootApplication: Main entry point of the Spring Boot application.
@Entity: Defines a class as a JPA entity.
@Id: Marks a field as the primary key.
@GeneratedValue: Specifies how the primary key should be generated.
@Repository: Marks a repository interface as a Spring Data repository.
@Service: Indicates that the class holds business logic.
@Autowired: Injects dependencies into classes.
@RestController: Marks the class as a REST controller.
@GetMapping, @PostMapping, @DeleteMapping: Maps HTTP requests to controller methods.
*
* 2. Using the Command Line
For a Maven Project:
Navigate to the Project Directory: Open a terminal and navigate to the root folder of the project where the pom.xml is located.

Build the Project: Run the following command to build the project:

mvn clean install
Run the Project: After building, run the following command:

mvn spring-boot:run
This will start the Spring Boot application, and you can access it at http://localhost:8080.
* */
