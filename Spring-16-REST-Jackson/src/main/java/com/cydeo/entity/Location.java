package com.cydeo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Location extends BaseEntity{

    private String name;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String postalCode;
    private String country;
    private String state;
    private String city;
    private String address;
}
