package com.stegemoen.springmvc_timetable.controllers;

import com.stegemoen.springmvc_timetable.beans.Customer;
import com.stegemoen.springmvc_timetable.beans.Project;
import com.stegemoen.springmvc_timetable.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String goHome(){
        System.out.println("In home controller");
        return "index";
    }

    @GetMapping("/projects")
    public String goProjects(){
        System.out.println("Go to projects");
        return "projects";
    }

    @GetMapping("/addproject")
    public String goCreateProject(){
        System.out.println("Going to add project");
        return "addproject";
    }

    @GetMapping("/customers")
    public String goCustomers(){
        System.out.println("Going to Customers");
        return "customers";
    }

    @GetMapping("/addcustomer")
    public String goCreateCustomer(){
        System.out.println("Going to add customer");
        return "addcustomer";
    }

    @GetMapping("/adduser")
    public String goAddUser(){
        System.out.println("Going to users controller");
        return "adduser";
    }

    // Needed for the add user form
    @ModelAttribute("newuser")
    public User getDefaultUser(){
        return new User();
    }

    @ModelAttribute("newproject")
    public Project getDefaultProject(){
        return new Project();
    }

    @ModelAttribute("newcustomer")
    public Customer getDefaultCustomer(){
        return new Customer();
    }

    @GetMapping("/users")
    public String goUserList(){
        System.out.println("Going to user list");
        return "users";
    }


}
