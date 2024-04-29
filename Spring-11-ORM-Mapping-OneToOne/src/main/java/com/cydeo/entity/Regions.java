package com.cydeo.entity;

import javax.persistence.*;

@Entity
@Table(name="regions")
public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int region_id;
    @Column(name= "region")
    private String region;
    @Column(name= "country")
    private String country;

}
