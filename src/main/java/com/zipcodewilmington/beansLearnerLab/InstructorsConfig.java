package com.zipcodewilmington.beansLearnerLab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean(name = "usaInstructors")
    public Instructors tcUsaInstructors(){
        return new Instructors(new Instructor(1L, "USA Instructor #1"),
                new Instructor(2L, "USA Instructor #2"),
                new Instructor(3L, "USA Instructor #3"));
    }

    @Bean(name = "ukInstructors")
    public Instructors tcUkInstructors(){
        return new Instructors(new Instructor(1L, "UK Instructor #1"),
                new Instructor(2L, "UK Instructor #2"),
                new Instructor(3L, "UK Instructor #3"));
    }

    @Primary @Bean
    public Instructors instructors(){
        return new Instructors(new Instructor(1L, "Leon"), new Instructor(2L, "Froilan"),
                new Instructor(3L, "Dolio"), new Instructor(4L, "Wilhem"),
                new Instructor(5L, "Nhu"), new Instructor(6L, "Kris"));
    }
}
