package com.mourat.udemy.springmvcvalidation.anotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode cc){

        coursePrefix = cc.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext context){

        boolean result;

        if(code != null){
            result = code.startsWith(coursePrefix);
        }
        else{
            result = true;
        }

        return result;
    }
}
