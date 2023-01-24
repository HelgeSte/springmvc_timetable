package com.stegemoen.springmvc_timetable.controllers;

import com.stegemoen.springmvc_timetable.beans.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import com.stegemoen.springmvc_timetable.repository.ProjectRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ProjectController {
    @InitBinder
    public void startupInitBinder(WebDataBinder binder){
        binder.registerCustomEditor(Date.class, "startupDate",
                new CustomDateEditor(new SimpleDateFormat("yyy-MM-dd"), true));
        // allowEmpty = true, because validation with a error message is used instead
    }

    @InitBinder
    public void deadlineInitBinder(WebDataBinder binder){
        binder.registerCustomEditor(Date.class, "deadline",
                new CustomDateEditor(new SimpleDateFormat("yyy-mm-dd"), true));
    }
    @Autowired
    private ProjectRepository projectRepository;

    @PostMapping("createproject")
    public String createproject(@Valid @ModelAttribute("newproject") Project project,
                                BindingResult result, Model model){
        System.out.println("in UserController doing creation work");
        if(result.hasErrors()){
            return "addproject";
        }
        projectRepository.save(project);
        model.addAttribute("dataSaved", "Project created successfully");
        return "projects";
    }
}
