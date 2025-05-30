package com.mourat.udemy.springmvcvalidation.model;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required!")
    @Size(min = 1, message = "is required!")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "must be a positive number!")
    @Max(value = 10, message = "shouldn't be more than 10!")
    private Integer freePasses;

    @NotNull(message = "is required")
    @Pattern(regexp="^[a-zA-Z0-9]{5}", message="invalid postal code, must be 5 digits")
    private String postalCode;

    public Customer() {
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

    public void setLastName(String lastNAme) {
        this.lastName = lastNAme;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
