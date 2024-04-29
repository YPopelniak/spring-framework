package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="department")
@NoArgsConstructor
@Data
public class Departments extends BaseEntity {
    public Departments(String department, String division) {
        this.department = department;
        this.division = division;
    }

    private String department;

    private String division;


}
