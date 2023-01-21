package com.stegemoen.springmvc_timetable.controllers;

import com.stegemoen.springmvc_timetable.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.stegemoen.springmvc_timetable.repository.UserRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("createuser")
    public String createuser(@ModelAttribute("newuser") User user, Model model){
        System.out.println("in UserController doing creation work");
        userRepository.save(user);
        model.addAttribute("dataSaved", "User registered successfully");
        return "users";
    }

}
