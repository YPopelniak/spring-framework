package com.cydeo.repository;

import com.cydeo.entity.Employee;
import lombok.Lombok;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
