package com.mourat.udemy.springmvcdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {


    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @GetMapping("/processForm")
    public String processForm(@RequestParam("studentName") String param, Model model){

        // convert to uppercase
        param = param.toUpperCase();

        // create a new message
        String message = "Yo! " + param;

        // add the message to the model
        model.addAttribute("message", message);

        return "helloworld";
    }
}
