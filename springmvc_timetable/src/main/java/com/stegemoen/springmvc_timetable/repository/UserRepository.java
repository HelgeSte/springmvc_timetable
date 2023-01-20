package com.stegemoen.springmvc_timetable.repository;

import com.stegemoen.springmvc_timetable.beans.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
