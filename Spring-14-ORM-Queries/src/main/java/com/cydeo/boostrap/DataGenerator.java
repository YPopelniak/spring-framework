package com.cydeo.boostrap;

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

    public DataGenerator(RegionRepository RegionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.RegionRepository = RegionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
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

        System.out.println(employeeRepository.findByFirstNameIsNot("Sydney"));

        System.out.println(employeeRepository.findByFirstNameStartingWith("Syd"));

        System.out.println(employeeRepository.findBySalaryGreaterThan(2000));

        System.out.println("findBySalaryLessThanEqual"  + employeeRepository.findBySalaryLessThanEqual(4000));

        System.out.println("findByHireDateBetween:" + employeeRepository.findByHireDateBetween(LocalDate.parse("2006-02-19"),LocalDate.parse("2014-06-23")));
    }
}
