package com.mourat.udemy.springmvcdemo.controller;

import com.mourat.udemy.springmvcdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showForm(Model model){

        // create a student object
        Student std = new Student();

        // add student to the model
        model.addAttribute("student", std);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student student){

        System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " from " + student.getCountry());
        return "student-confirmation";
    }
}
