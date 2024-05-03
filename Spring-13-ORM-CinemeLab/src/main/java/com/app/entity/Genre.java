package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Genre extends BaseEntity{

    private String name;

    @ManyToMany(mappedBy = "genreList")
    private List<Movie> movieList;
}
