package com.cydeo.boostrap;

import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository RegionRepository;

    public DataGenerator(RegionRepository RegionRepository) {
        this.RegionRepository = RegionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("******Region********");
        System.out.println(RegionRepository.findByCountry("Canada"));

        System.out.println(RegionRepository.findDistinctByCountry("Canada"));


        System.out.println(RegionRepository.findByCountryContaining("United"));

        System.out.println(RegionRepository.findByCountryContainingOrderByCountry("Asia"));

        System.out.println(RegionRepository.findTop2ByCountry("Canada"));
    }
}
