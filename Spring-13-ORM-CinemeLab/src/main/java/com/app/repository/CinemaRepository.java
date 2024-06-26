package com.app.repository;

import com.app.entity.Account;
import com.app.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to get cinema with a specific name
    Optional<Cinema> findAllByName(String name);

    //Write a derived query to read sorted the top 3 cinemas that contains a specific sponsored name
    List<Cinema> findTop3BySponsoredNameContainingOrderBySponsoredNameAsc(String sponsoredName);

    //Write a derived query to list all cinemas in a specific country
    List<Cinema> findByLocalCountry(String country);

    //Write a derived query to list all cinemas with a specific name or sponsored name
    List<Cinema> findBySponsoredNameOrName(String sponsoredName, String name);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to read the cinema name with a specific id
    @Query("SELECT a.name FROM Cinema a WHERE a.id = :id")
    List<Cinema> findCinemaNameById(Long id);

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all cinemas by location country

    //Write a native query to read all cinemas by name or sponsored name contains a specific pattern

    //Write a native query to sort all cinemas by name

    //Write a native query to distinct all cinemas by sponsored name


}
