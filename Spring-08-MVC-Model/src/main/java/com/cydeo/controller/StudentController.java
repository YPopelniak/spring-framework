package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

        String subject = "Collection";
        model.addAttribute("subject",subject);

        int studentID = new Random().nextInt();
        model.addAttribute("id",studentID);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(46);
        numbers.add(54);
        numbers.add(42);
        model.addAttribute("numbers",numbers);

        return "student/welcome";
    }
}
