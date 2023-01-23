package com.stegemoen.springmvc_timetable.controllers;

import com.stegemoen.springmvc_timetable.beans.Customer;
import com.stegemoen.springmvc_timetable.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @Autowired
    public CustomerRepository customerRepository;

    @PostMapping("createcustomer")
    public String createcustomer(@Valid @ModelAttribute("newcustomer") Customer customer,
                                 BindingResult result, Model model){
        System.out.println("in CustomerController doing creation work");
        if(result.hasErrors()){
            return "addcustomer";
        }
        customerRepository.save(customer);
        model.addAttribute("datasaved", "Customer added successfully");
        return "customers";
    }
}
