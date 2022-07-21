package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(0, "");
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(0, "");
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach() {
        //Given
        Instructor instructor = new Instructor(0, "");
        Student test = new Student(0, "");
        Double expectedHours = 14.0;
        //When
        instructor.teach(test,expectedHours);
        //Then
        Assert.assertEquals(expectedHours, test.getTotalStudyTime());
    }
    @Test
    public void testLecture1() {
        //Given
        Instructor instructor = new Instructor(0, "");
        Student test1 = new Student(0, "");
        Student test2 = new Student(0, "");
        Student test3 = new Student(0, "");
        Learner[] learners = new Learner[3];
        learners[0] = test1;
        learners[1] = test2;
        learners[2] = test3;
        Double groupHours = 30.0;
        Double expectedHours = 10.0;
        //When
        instructor.lecture(learners, groupHours);
        //Then
        Assert.assertEquals(expectedHours, learners[0].getTotalStudyTime());
    }
    @Test
    public void testLecture2() {
        //Given
        Instructor instructor = new Instructor(0, "");
        Student test1 = new Student(0, "");
        Student test2 = new Student(0, "");
        Student test3 = new Student(0, "");
        Learner[] learners = new Learner[3];
        learners[0] = test1;
        learners[1] = test2;
        learners[2] = test3;
        Double groupHours = 30.0;
        Double expectedHours = 10.0;
        //When
        instructor.lecture(learners, groupHours);
        //Then
        Assert.assertEquals(expectedHours, learners[1].getTotalStudyTime());
    }
    @Test
    public void testLecture3() {
        //Given
        Instructor instructor = new Instructor(0, "");
        Student test1 = new Student(0, "");
        Student test2 = new Student(0, "");
        Student test3 = new Student(0, "");
        Learner[] learners = new Learner[3];
        learners[0] = test1;
        learners[1] = test2;
        learners[2] = test3;
        Double groupHours = 30.0;
        Double expectedHours = 10.0;
        //When
        instructor.lecture(learners, groupHours);
        //Then
        Assert.assertEquals(expectedHours, learners[2].getTotalStudyTime());
    }
}
