package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student student = new Student();
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student();
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        //Given
        Student test = new Student(35, "Todd");
        Double expectedNumberOfHours = 13.0;
        //When
        test.learn(expectedNumberOfHours);
        //Then
        Assert.assertEquals(expectedNumberOfHours, test.getTotalStudyTime());

    }
}
