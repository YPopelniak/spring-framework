package com.cydeo.boostrap;

import com.cydeo.repository.CourseRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository RegionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final CourseRepository courseRepository;

    public DataGenerator(RegionRepository RegionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.RegionRepository = RegionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("******Region********");
        System.out.println(RegionRepository.findByCountry("Canada"));

        System.out.println(RegionRepository.findDistinctByCountry("Canada"));


        System.out.println(RegionRepository.findByCountryContaining("United"));

        System.out.println(RegionRepository.findByCountryContainingOrderByCountry("Asia"));

        System.out.println(RegionRepository.findTop2ByCountry("Canada"));

        System.out.println("******End - Region********");

        System.out.println("******Department********");

        System.out.println(departmentRepository.findByDepartment("Furniture"));

        System.out.println(departmentRepository.findByDivisionIs("Health"));

        System.out.println("findDistinctTop3ByDivisionContains : " + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));
        System.out.println("******End - Department********");

        System.out.println("******Employee********");

        System.out.println(employeeRepository.findByEmail("acurwood6@1und1.de"));

        System.out.println("findByFirstNameAndLastNameOrEmail: " + employeeRepository.findByFirstNameAndLastNameOrEmail("Sydney","Symonds","vmarwickm@upenn.edu"));

//        System.out.println("findByFirstNameIsNot" + employeeRepository.findByFirstNameIsNot("Sydney"));

        System.out.println("findByFirstNameStartingWith" + employeeRepository.findByFirstNameStartingWith("Syd"));
//
//        System.out.println("findBySalaryGreaterThan" + employeeRepository.findBySalaryGreaterThan(10000));

//        System.out.println("findBySalaryLessThanEqual"  + employeeRepository.findBySalaryLessThanEqual(4000));
//
//        System.out.println("findByHireDateBetween:" + employeeRepository.findByHireDateBetween(LocalDate.parse("2006-02-19"),LocalDate.parse("2014-06-23")));
//
//        System.out.println("getEmployeeDetail" + employeeRepository.getEmployeeDetail());

        System.out.println("getEmployeeSalary : " + employeeRepository.getEmployeeSalary());

        System.out.println("getEmployeeDetail" + employeeRepository.getEmployeeDetail("vmarwickm@upenn.edu"));

        System.out.println("******Course********");

        courseRepository.findByCategory("Spring").forEach(System.out::println);

        System.out.println("******^^^^^^********");

        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);

        System.out.println("******^^^^^^********");

        System.out.println(courseRepository.existsByName("Java"));
        System.out.println("******^^^^^^********");

        System.out.println(courseRepository.countByCategory("Spring"));
        System.out.println("******^^^^^^********");
        courseRepository.findByNameStartingWith("Rapid").forEach(System.out::println);
        System.out.println("******^^^^^^********");
//        courseRepository.streamByCategory("Spring").forEach(System.out::println);


    }
}
