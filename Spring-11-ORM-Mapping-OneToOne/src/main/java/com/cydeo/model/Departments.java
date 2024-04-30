package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="department")
@NoArgsConstructor
@Data
public class Departments extends BaseEntity {

    private String department;

    private String division;

    @OneToOne(mappedBy = "departments")
    private Employee employee;

    public Departments(String department, String division) {
        this.department = department;
        this.division = division;
    }


}
