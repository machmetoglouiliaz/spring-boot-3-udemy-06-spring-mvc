package com.mourat.udemy.springmvcvalidation.controller;

import com.mourat.udemy.springmvcvalidation.model.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @PostMapping("/processCustomerForm")
    public String processCustomerForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bResult){

        if(bResult.hasErrors()) return "customer-form";
        return "customer-confirmation";
    }
}
