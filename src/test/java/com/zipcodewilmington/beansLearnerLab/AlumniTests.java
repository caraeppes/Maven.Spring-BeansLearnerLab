package com.zipcodewilmington.beansLearnerLab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AlumniTests {

    @Autowired
    Alumni alumni;

    @Test
    public void studentLearnTest(){
        // Given
        double expected = 1200;

        // When
        for(Student student : alumni.getStudents()){
            double actual  = student.getTotalStudyTime();
            // Then
            Assert.assertEquals(expected, actual, .01);
        }
    }

    @Test
    public void instructorHoursTaughtTest(){
        // Given
        double expected = (1200 * alumni.getStudents().size()) / alumni.getInstructors().size();

        // When
        for(Instructor instructor : alumni.getInstructors()){
            double actual = instructor.getNumberOfHoursTaught();
            // Then
            Assert.assertEquals(expected, actual, .01);
        }
    }

}
