package com.stegemoen.springmvc_timetable.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // avoid duplicate id problem
    private long customerId;
    @NotEmpty(message="{noname}")
    private String customerName;
    @NotEmpty(message="{noname}")
    private String contactName;
    @Pattern(regexp = "^[a-z\\.]+@[a-z]+\\.[a-z]+", message="{invalid.email.address}")
    private String contactEmail;

    public Customer(String customerName, String contactName, String contactEmail) {
        this.customerName = customerName;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
    }

    public Customer(){}

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                '}';
    }
}
