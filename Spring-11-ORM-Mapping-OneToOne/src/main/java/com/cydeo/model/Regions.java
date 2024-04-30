package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="regions")
@Data
@NoArgsConstructor
public class Regions  extends BaseEntity {

    private String region;
    private String country;

    @OneToOne(mappedBy = "region")
    private Employee employee;

    public Regions(String region, String country) {
        this.region = region;
        this.country = country;
    }
}
