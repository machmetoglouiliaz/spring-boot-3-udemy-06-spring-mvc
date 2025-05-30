package com.mourat.udemy.springmvcdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {


    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model){

        // read the request parameter
        String param = request.getParameter("studentName");

        // convert to uppercase
        param = param.toUpperCase();

        // create a new message
        String message = "Yo! " + param;

        // add the message to the model
        model.addAttribute("message", message);

        return "helloworld";
    }
}
