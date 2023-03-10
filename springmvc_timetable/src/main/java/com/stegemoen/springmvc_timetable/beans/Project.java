package com.stegemoen.springmvc_timetable.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // avoid duplicate id problem
    private long projectId;
    @NotEmpty(message="{noname}")
    private String projectName;
    private String description;
    @NotEmpty(message="{noname}")
    private String customer;
    private String projectManager;
    @NotNull(message = "Project cannot be created without a startupdate")
    private Date startupDate; // Check if a default date (date now) can be added to the form
    private Date deadline;    // Can be null

    public Project(long projectId, String projectName, String description, String projectManager) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.description = description;
        this.projectManager = projectManager;
    }

    public Project(){} // public, since the classes are in different packages

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getStartupDate() {
        return startupDate;
    }

    public void setStartupDate(Date startupDate) {
        this.startupDate = startupDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", description='" + description + '\'' +
                ", customer='" + customer + '\'' +
                ", projectManager='" + projectManager + '\'' +
                '}';
    }
}
