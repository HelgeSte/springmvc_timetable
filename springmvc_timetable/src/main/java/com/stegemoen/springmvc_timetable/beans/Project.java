package com.stegemoen.springmvc_timetable.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
    @Id
    private long projectId;
    private String projectName;
    private String description;
    private String projectManager;

    public Project(long projectId, String projectName, String description, String projectManager) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.description = description;
        this.projectManager = projectManager;
    }

    Project(){}

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

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", description='" + description + '\'' +
                ", projectManager='" + projectManager + '\'' +
                '}';
    }
}
