package com.example.employeecrud.controller;

import com.example.employeecrud.model.Employee;
import com.example.employeecrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}


/* http://localhost:8080/employees  POST
*
* @RestController: Defines the class as a REST controller to handle HTTP requests.
@RequestMapping: Specifies the base URL for all endpoints in the controller.
@Service: Marks the class as a service component in the service layer.
@Entity: Defines the class as a JPA entity that maps to a database table.
@Repository: Indicates that the interface is a repository that handles data persistence.
@Autowired: Used for dependency injection of components like services or repositories.
* {
  "name": "sameer mishra",
  "department": "IT",
  "salary": 60000
}
*
*
* -----------------------------------------------
*  Explanation of Each Folder and File
src/main/java/: Contains the Java source code for the application.
com/example/employeecrud/: This is the base package where all your Java classes are located.
EmployeeCrudApplication.java: The main class with the @SpringBootApplication annotation that starts the Spring Boot application.
controller/: Contains the REST API endpoints.
EmployeeController.java: Contains all the endpoints (CRUD operations) to handle HTTP requests.
model/: Contains data models representing the entities in the application.
Employee.java: The entity class for an employee with fields like id, name, role, etc.
repository/: Contains repository interfaces for interacting with the database.
EmployeeRepository.java: Extends JpaRepository to provide database interaction methods.
service/: Contains business logic.
EmployeeService.java: Handles all business operations like fetching, saving, updating, and deleting employees.
src/main/resources/: Contains configuration files and static resources.
application.properties: Used to configure the application, such as the database connection.
static/: For static content like CSS, JS, and images.
templates/: For Thymeleaf templates (used if you’re building web pages).
pom.xml: If using Maven, this file manages dependencies (Spring Boot starter, JPA, MySQL, etc.).
target/: After you build the project, the .jar file is generated here (e.g., employee-crud-0.0.1-SNAPSHOT.jar).
*
*@RestController: Indicates that this class is a REST controller where each method returns JSON data.
@RequestMapping: Defines the base URL path for the controller (/employees).
@GetMapping, @PostMapping, @DeleteMapping: Map HTTP GET, POST, and DELETE requests to specific methods.
@RequestBody: Binds the HTTP request body to a Java object.
@PathVariable: Binds a URL path variable to a method parameter.
* */

