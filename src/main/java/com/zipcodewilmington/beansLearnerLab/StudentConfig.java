package com.zipcodewilmington.beansLearnerLab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {


    String[] cohort5dot0Names = {"Ajah", "Alex", "Ashley B", "Ashley S", "Ashwathy", "Brian", "Cara",
            "Charlie", "Cristina", "David", "Davis", "Delenda", "Eleonor", "Eric", "Francisco", "Jim", "Joe",
            "Julian", "Kate", "Kyle", "Laxmi", "Leah", "Mark", "Marlys", "Marshilla", "Mike", "Neela", "Nirmala",
            "Reese", "Robyn", "Sean M", "Sean R", "Shuchi", "Sravani", "Sunhyun", "Swapna", "Swathi", "Thao", "Will", "Yang"};

    String[] previousStudentsNames = {"Andrea", "Andres", "Bo", "Brandon", "Connor", "Eugene", "Garret", "Jacob",
            "Katherine", "Katrice", "Lauren", "Mexi", "Nick", "Trinh", "Veronica", "Xzavia"};


    public Student[] makeStudents(String[] names) {
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            Long id = new Long(i);
            students[i] = new Student(id, names[i]);
        }
        return students;
    }


    @Bean(name = "students")
    public Students currentStudents() {
        return new Students(makeStudents(cohort5dot0Names));
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        return new Students(makeStudents(previousStudentsNames));
    }

}
