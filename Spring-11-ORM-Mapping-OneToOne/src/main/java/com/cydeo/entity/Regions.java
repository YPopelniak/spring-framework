package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="regions")
@Data
@NoArgsConstructor
public class Regions  extends BaseEntity{

    private int region_id;
    private String region;
    private String country;

}
