package com.stegemoen.springmvc_timetable.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // avoid duplicate id=0 problem
    private long userId;
    @NotEmpty(message = "{noname}") // remember to modify controller: '@Valid' before ModelAttribute, and 'BindingResult result, ' before Model + if(hasErrors(){...}..
    private String firstName;
    @NotEmpty(message = "{noname}")
    private String lastName;
    @Pattern(regexp = "^[\\w\\.]+@\\w+\\.\\w+", // Can '?='/positive lookahead be used here(Se Mastering Regular Expressions by Friedl)
            message = "{invalid.email.address}")
    private String email;

    @NotNull(message = "")
    private Date dateOfBirth;    // remember to add @InitBinding to controller

    public User(String firstName, String lastName, String email, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public User(){}

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
