package com.stegemoen.springmvc_timetable.controllers;

import com.stegemoen.springmvc_timetable.beans.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.stegemoen.springmvc_timetable.repository.ProjectRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String createproject(@ModelAttribute("newproject") Project project, Model model){
        System.out.println("in UserController doing creation work");
        projectRepository.save(project);
        model.addAttribute("dataSaved", "Project created successfully");
        return "projects";
    }
}
