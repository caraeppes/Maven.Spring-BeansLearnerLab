package com.zipcodewilmington.beansLearnerLab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClassroomConfigTests {

    @Autowired @Qualifier("currentCohort")
    Classroom currentCohort;

    @Autowired @Qualifier("previousCohort")
    Classroom previousCohort;

    @Test
    public void currentCohortTest(){
        // Given
        String expectedStudents = "ID: 0  Name: Ajah\n" +
                "ID: 1  Name: Alex\n" +
                "ID: 2  Name: Ashley B\n" +
                "ID: 3  Name: Ashley S\n" +
                "ID: 4  Name: Ashwathy\n" +
                "ID: 5  Name: Brian\n" +
                "ID: 6  Name: Cara\n" +
                "ID: 7  Name: Charlie\n" +
                "ID: 8  Name: Cristina\n" +
                "ID: 9  Name: David\n" +
                "ID: 10  Name: Davis\n" +
                "ID: 11  Name: Delenda\n" +
                "ID: 12  Name: Eleonor\n" +
                "ID: 13  Name: Eric\n" +
                "ID: 14  Name: Francisco\n" +
                "ID: 15  Name: Jim\n" +
                "ID: 16  Name: Joe\n" +
                "ID: 17  Name: Julian\n" +
                "ID: 18  Name: Kate\n" +
                "ID: 19  Name: Kyle\n" +
                "ID: 20  Name: Laxmi\n" +
                "ID: 21  Name: Leah\n" +
                "ID: 22  Name: Mark\n" +
                "ID: 23  Name: Marlys\n" +
                "ID: 24  Name: Marshilla\n" +
                "ID: 25  Name: Mike\n" +
                "ID: 26  Name: Neela\n" +
                "ID: 27  Name: Nirmala\n" +
                "ID: 28  Name: Reese\n" +
                "ID: 29  Name: Robyn\n" +
                "ID: 30  Name: Sean M\n" +
                "ID: 31  Name: Sean R\n" +
                "ID: 32  Name: Shuchi\n" +
                "ID: 33  Name: Sravani\n" +
                "ID: 34  Name: Sunhyun\n" +
                "ID: 35  Name: Swapna\n" +
                "ID: 36  Name: Swathi\n" +
                "ID: 37  Name: Thao\n" +
                "ID: 38  Name: Will\n" +
                "ID: 39  Name: Yang\n";

        String expectedInstructors = "ID: 1  Name: Leon\n" +
                "ID: 2  Name: Froilan\n" +
                "ID: 3  Name: Dolio\n" +
                "ID: 4  Name: Wilhem\n" +
                "ID: 5  Name: Nhu\n" +
                "ID: 6  Name: Kris\n";

        // When
        String actualStudents = currentCohort.getStudents().toString();
        String actualInstructors = currentCohort.getInstructors().toString();

        // Then
        Assert.assertEquals(expectedStudents, actualStudents);
        Assert.assertEquals(expectedInstructors, actualInstructors);
    }


    @Test
    public void previousCohortTest(){
        String expectedStudents = "ID: 0  Name: Andrea\n" +
                "ID: 1  Name: Andres\n" +
                "ID: 2  Name: Bo\n" +
                "ID: 3  Name: Brandon\n" +
                "ID: 4  Name: Connor\n" +
                "ID: 5  Name: Eugene\n" +
                "ID: 6  Name: Garret\n" +
                "ID: 7  Name: Jacob\n" +
                "ID: 8  Name: Katherine\n" +
                "ID: 9  Name: Katrice\n" +
                "ID: 10  Name: Lauren\n" +
                "ID: 11  Name: Mexi\n" +
                "ID: 12  Name: Nick\n" +
                "ID: 13  Name: Trinh\n" +
                "ID: 14  Name: Veronica\n" +
                "ID: 15  Name: Xzavia\n";

        String expectedInstructors = "ID: 1  Name: Leon\n" +
                "ID: 2  Name: Froilan\n" +
                "ID: 3  Name: Dolio\n" +
                "ID: 4  Name: Wilhem\n" +
                "ID: 5  Name: Nhu\n" +
                "ID: 6  Name: Kris\n";

        // When
        String actualStudents = previousCohort.getStudents().toString();
        String actualInstructors = previousCohort.getInstructors().toString();

        // Then
        Assert.assertEquals(expectedStudents, actualStudents);
        Assert.assertEquals(expectedInstructors, actualInstructors);
    }
}
