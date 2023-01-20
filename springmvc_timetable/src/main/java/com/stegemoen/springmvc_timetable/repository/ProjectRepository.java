package com.stegemoen.springmvc_timetable.repository;

import com.stegemoen.springmvc_timetable.beans.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {
}
