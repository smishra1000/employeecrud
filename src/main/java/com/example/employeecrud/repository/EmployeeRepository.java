package com.example.employeecrud.repository;

import com.example.employeecrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

/*
* @Repository: Marks the interface as a Spring Data repository.
JpaRepository: Provides built-in methods like save(), findById(), delete(), etc.
*
* */

