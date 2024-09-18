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
* Spring Boot
Spring Boot simplifies building Java applications by providing default configurations and setup. It is built on top of the Spring Framework but adds convenience through auto-configuration, pre-defined project structures, and embedded servers.

Steps Involved with Spring Boot:

Auto-Configuration:
Spring Boot automatically configures beans and components, such as database connections, web settings, etc., without the need for XML or Java-based configuration files.
Embedded Server:
Spring Boot comes with an embedded Tomcat server, so you don’t need to install and configure a separate server. Just run the application using mvn spring-boot:run or by running the generated JAR file.
Dependency Management:
Spring Boot handles dependencies automatically. When you create a Spring Boot project (e.g., using Spring Initializr), it preselects necessary dependencies like Spring MVC, Spring Data JPA, and H2 database with minimal setup.
Simplified Configuration:
Application properties, like database configuration, can be easily managed using the application.properties or application.yml file.
Opinionated Defaults:
Spring Boot provides sensible defaults for most configurations, reducing the need for boilerplate code.
*
*
*
*
*
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
