package com.stegemoen.springmvc_timetable.repository;

import com.stegemoen.springmvc_timetable.beans.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
