package com.app.repository;

import com.app.entity.Account;
import com.app.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository  extends JpaRepository<Account, Long> {


    // ------------------- DERIVED QUERIES ------------------- //


    // query to list all accounts with a specific country or state
    List<Account> findAllByCountryOrState(String country,String state);
    // query to list all accounts with age lower than or equal to a specific value

    List<Account> findAllByAgeLessThanEqual(Integer age);
    // query to list all accounts with a specific role

    List<Account> findAllByRole(UserRole role);

    // query to list all accounts between a range of ages

    List<Account> findAllByAgeBetween(Integer ageStart, Integer ageEnd);

    // query to list all accounts where the beginning of the address contains the keyword
    List<Account> findAllByAddressStartsWith(String address);

    //  query to sort the list of accounts with age

    List<Account> findAllByOrderByAgeDesc();

    // ------------------- JPQL QUERIES ------------------- //

    // JPQL query that returns all accounts

    @Query("SELECT a FROM Account a")
    List<Account> fetchAllAccounts();

    // JPQL query to list all admin accounts

    @Query("SELECT a FROM Account a WHERE a.role = 'ADMIN'")
    List<Account> fetchAdminAccount();

    // JPQL query to sort all accounts with age

    @Query("SELECT a FROM Account a ORDER BY a.age")
    List<Account> fetchAllOrderByAge();

    // ------------------- Native QUERIES ------------------- //

    // native query to read all accounts with an age lower than a specific value
    @Query(value= "SELECT * FROM account_details WHERE age < ?1", nativeQuery=true)
    List<Account> fetchAllAgeLowerThan(Integer age);
    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city
    @Query(value = "SELECT * FROM account_details WHERE LOWER(name) LIKE LOWER(concat('%',?1,'%')) OR address ILIKE concat('%',?1,'%') " +
            " OR country ILIKE concat('%',?1,'%') or state ILIKE concat('%',?1,'%') " +
            "OR city ILIKE concat('%',?1,'%') ",nativeQuery = true)
    List<Account> retrieveBySearchCriteria(String pattern);
    // native query to read all accounts with an age lower than a specific value
    @Query(value= "SELECT * FROM account_details WHERE age > :age", nativeQuery=true)
    List<Account> retrieveAllBasedOnAgeHigher(@Param("age") Integer age);
}
