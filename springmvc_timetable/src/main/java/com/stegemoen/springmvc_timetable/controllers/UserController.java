package com.stegemoen.springmvc_timetable.controllers;

import com.stegemoen.springmvc_timetable.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import com.stegemoen.springmvc_timetable.repository.UserRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /*
    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(Date.class, "dateOfBirth", new CustomDateEditor(
                new SimpleDateFormat("yyy-mm-dd"),true));
    }
    */
    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(Date.class, "dateOfBirth", new CustomDateEditor(
                new SimpleDateFormat("yyy-MM-dd"), true)
        );
    }

    @PostMapping("createuser")
    public String createuser(@Valid @ModelAttribute("newuser") User user, BindingResult result, Model model){
        System.out.println("in UserController doing creation work");
        if(result.hasErrors()){
            return "adduser";
        }
        userRepository.save(user);
        model.addAttribute("dataSaved", "User registered successfully");
        return "users";
    }

}
