package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/car")
@Controller
public class CarController {
@RequestMapping("/info")   //localhost:8080/car/info?make=Honda&year=2015
public String carInfo2(@RequestParam(value = "make",required = false,defaultValue = "Tesla") String make, Model model){

    model.addAttribute("make",make);

        return "student/car/carInfo";
    }
    @RequestMapping("/info/{make}/{year}")      //localhost:8080/car/info/honda/2015
    public String getCarInfo(@PathVariable String make,@PathVariable Integer year, Model model){
        model.addAttribute("make",make);
        model.addAttribute("year",year);

    return "student/car/carInfo";

    }
}
