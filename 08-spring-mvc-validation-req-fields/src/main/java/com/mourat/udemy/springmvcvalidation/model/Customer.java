package com.mourat.udemy.springmvcvalidation.model;

import com.mourat.udemy.springmvcvalidation.anotation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required!")
    @Size(min = 1, message = "is required!")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "must be a positive number!")
    @Max(value = 10, message = "must be less than or equal to 10!")
    private Integer freePasses;

    @NotNull(message = "is required")
    @Pattern(regexp="^[a-zA-Z0-9]{5}", message="invalid postal code, must be 5 digits")
    private String postalCode;

    @CourseCode
    private String courseCode;

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

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
