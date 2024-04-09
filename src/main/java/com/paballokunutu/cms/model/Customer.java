package com.paballokunutu.cms.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// This class represents a customer in our system
@Entity
public class Customer {
    // This field represents the unique identifier for each customer
    @Id
    // This annotation specifies how the unique identifier will be generated automatically
    @GeneratedValue(strategy = GenerationType.AUTO)
    // This annotation specifies the name of this field when converting to JSON and back
    @JsonProperty("id")
    private int customerId;

    // This field represents the first name of the customer
    @JsonProperty("firstName")
    private String customerFistName;

    // This field represents the last name of the customer
    @JsonProperty("lastName")
    private String customerLastName;

    // This field represents the email address of the customer
    @JsonProperty("email")
    private String customerEmail;

    // Getter method for customerId
    public int getCustomerId() {
        return customerId;
    }

    // Setter method for customerId
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    // Getter method for customerFistName
    public String getCustomerFistName() {
        return customerFistName;
    }

    // Setter method for customerFistName
    public void setCustomerFistName(String customerFistName) {
        this.customerFistName = customerFistName;
    }

    // Getter method for customerLastName
    public String getCustomerLastName() {
        return customerLastName;
    }

    // Setter method for customerLastName
    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    // Getter method for customerEmail
    public String getCustomerEmail() {
        return customerEmail;
    }

    // Setter method for customerEmail
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
