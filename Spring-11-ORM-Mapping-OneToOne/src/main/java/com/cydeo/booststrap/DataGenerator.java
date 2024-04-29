package com.cydeo.booststrap;

import com.cydeo.entity.Departments;
import com.cydeo.entity.Employee;
import com.cydeo.entity.Regions;
import com.cydeo.enums.Gender;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    EmployeeRepository employeeRepository;

    public DataGenerator(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;

    }


    @Override
    public void run(String... args) throws Exception {



        List<Employee> employeeList = new ArrayList<>();
        List<Departments> departmentList = new ArrayList<>();

        Employee e1 = new Employee("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.of(2006,04,20),154864, Gender.Female);
        Employee e2 = new Employee("Aeriell", "McNee", "amcnee1@google.es", LocalDate.of(2009,01,26),56752, Gender.Female);
        Employee e3 = new Employee("Sydney", "Symonds", "ssymonds2@hhs.gov", LocalDate.of(2010,05,17),95313, Gender.Female);
        Employee e4 = new Employee("Avrom", "Rowantree", null, LocalDate.of(2014,03,02) ,119764,Gender.Male);
        Employee e5 = new Employee("Feliks", "Morffew", "fmorffew4@a8.net", LocalDate.of(2003,01,14), 55307,Gender.Male);

        Departments d1 = new Departments("Sports","Outdoors");
        Departments d2 = new Departments("Tools","Hardware");
        Departments d3 = new Departments("Clothing","Home");
        Departments d4 = new Departments("Phones & Tablets","Electronics");
        Departments d5 = new Departments("Computers","Electronics");

        Regions r1 = new Regions("Southwest","United States");
        Regions r2 = new Regions("Central","United States");
        Regions r3 = new Regions("Northwest","United States");
        Regions r4 = new Regions("Quebec'","Canada");
        Regions r5 = new Regions("Central","Asia");



        e1.setDepartments(d1);
        e2.setDepartments(d2);
        e3.setDepartments(d3);
        e4.setDepartments(d4);
        e5.setDepartments(d5);

        e1.setRegion(r1);
        e2.setRegion(r2);
        e3.setRegion(r3);
        e4.setRegion(r4);
        e5.setRegion(r5);

        employeeList.addAll(Arrays.asList(e1,e2,e3,e4,e5));
        departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));

        employeeRepository.saveAll(employeeList);

    }
}
