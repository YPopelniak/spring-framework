package com.cydeo.repository;

import com.cydeo.entity.Employee;
import lombok.Lombok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

   List<Employee> findByEmail(String email);

   List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

   List<Employee> findByFirstNameIsNot(String firstName);

   List<Employee> findByFirstNameStartingWith(String pattern);

   List<Employee> findBySalaryGreaterThan(Integer salary);

   List<Employee> findBySalaryLessThanEqual(Integer salary);

   List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

   List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);

   List<Employee> findDistinctTop3BySalaryLessThanEqual(Integer salary);

   List<Employee> findByEmailIsNull();

    @Query("SELECT e FROM Employee e WHERE e.email = 'jgresly14@ted.com'")
    Employee getEmployeeDetail();

    @Query( "SELECT e.salary FROM Employee e WHERE e.email = 'jgresly14@ted.com'")
    Integer getEmployeeSalary();

    @Query("SELECT e FROM Employee e WHERE e.email=?1")
    Optional<Employee> getEmployeeDetail(String email);

    @Query("SELECT e FROM Employee e WHERE e.email=?1 AND e.salary=?2")
    Employee getEmployeeDetail(String email,int salary);

    //Not Equal
    @Query("SELECT e FROM Employee e WHERE e.salary <> ?1 ")
    List<Employee> getEmployeeSalaryNotEqual(int salary);

    //like/contains/startswith/endswith
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List<Employee> getEmployeeFirstNameLike(String pattern);

    @Query("SELECT e FROM Employee e WHERE e.salary < ?1")
    List<Employee> getEmployeesSalaryLessThan(Integer salary);

    @Query("SELECT e FROM Employee e WHERE e.salary < ?1")
    List<Employee> getEmployeesSalaryGreaterThan(Integer salary);

    @Query("SELECT e FROM Employee e WHERE e.hireDate > ?1")
    List<Employee> getEmployeesHiredDateBefore(LocalDate date);

    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee> getEmployeesSalaryBetween(int salary1,int salary2);

    @Query("SELECT e FROM Employee e WHERE e.email IS NULL")
     List<Employee> getEmployeesEmailIsNull();

    @Query("SELECT e FROM Employee e WHERE e.email IS NOT NULL")
    List<Employee> getEmployeesEmailIsNotNull();

    //Sorting in ascending order
    @Query("SELECT e FROM Employee e ORDER BY e.salary")
    List<Employee> getEmployeeSalaryOrderAsc();

    //Sorting in descending order
    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC ")
    List<Employee> getEmployeeSalaryOrderDesc();



}
