package com.stegemoen.springmvc_timetable.controllers;

import com.stegemoen.springmvc_timetable.beans.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.stegemoen.springmvc_timetable.repository.ProjectRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ProjectController {
    /*@GetMapping("/AddPproject")
    public String goAddProject(){
        System.out.println("Go to add project");
        return "addproject";
    }*/
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
