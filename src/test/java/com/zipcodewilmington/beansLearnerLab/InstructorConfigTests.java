package com.zipcodewilmington.beansLearnerLab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorConfigTests {

    @Autowired @Qualifier("usaInstructors")
    Instructors usaInstructors;

    @Autowired @Qualifier("ukInstructors")
    Instructors ukInstructors;

    @Autowired
    Instructors zcwInstructors;

    @Test
    public void usaInstructorsTest(){
        // Given
        String expected = "ID: 1  Name: USA Instructor #1\n" +
                "ID: 2  Name: USA Instructor #2\n" +
                "ID: 3  Name: USA Instructor #3\n";

        // When
        String actual = usaInstructors.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ukInstructorsTest(){
        // Given
        String expected = "ID: 1  Name: UK Instructor #1\n" +
                "ID: 2  Name: UK Instructor #2\n" +
                "ID: 3  Name: UK Instructor #3\n";

        // When
        String actual = ukInstructors.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void zcwInstructorsTest(){
        // Given
        String expected = "ID: 1  Name: Leon\n" +
                "ID: 2  Name: Froilan\n" +
                "ID: 3  Name: Dolio\n" +
                "ID: 4  Name: Wilhem\n" +
                "ID: 5  Name: Nhu\n" +
                "ID: 6  Name: Kris\n";

        // When
        String actual = zcwInstructors.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
