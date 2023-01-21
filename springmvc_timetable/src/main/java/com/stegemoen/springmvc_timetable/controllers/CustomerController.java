package com.stegemoen.springmvc_timetable.controllers;

import com.stegemoen.springmvc_timetable.beans.Customer;
import com.stegemoen.springmvc_timetable.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @Autowired
    public CustomerRepository customerRepository;

    @PostMapping("createcustomer")
    public String createcustomer(@ModelAttribute("newproject") Customer customer, Model model){
        System.out.println("in CustomerController doing creation work");
        customerRepository.save(customer);
        model.addAttribute("datasaved", "Customer added successfully");
        return "customers";
    }
}
