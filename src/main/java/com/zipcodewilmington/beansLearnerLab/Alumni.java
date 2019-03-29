package com.zipcodewilmington.beansLearnerLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    private Students students;
    private Instructors instructors;

    @Autowired
    public Alumni(@Qualifier("previousStudents") Students students, Instructors instructors){
        this.students = students;
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootcamp(){
        double totalHours = 1200 * students.size();
        double hoursPerInstructor = totalHours / instructors.size();
        instructors.forEach(instructor -> instructor.lecture(students, hoursPerInstructor));
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
