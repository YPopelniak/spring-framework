package com.cydeo.model;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="employees")
@Data
@NoArgsConstructor
public class Employee extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    private int salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Departments departments;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "region_id")
    private Regions region;

    public Employee(String firstName, String lastName, String email, LocalDate hireDate, int salary, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.salary = salary;
        this.gender = gender;
    }

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
