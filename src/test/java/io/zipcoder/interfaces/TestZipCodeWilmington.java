package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture() {
        //Given
        Instructor Kris = new Instructor(1, "Kris");
        Instructor Dolio = new Instructor(2, "Dolio");
        Instructor Karen = new Instructor(3, "Karen");
        Student Todd = new Student(1, "Todd");
        Student Eric = new Student(2, "Eric");
        Student JD = new Student(3, "JD");
        Student Tristan = new Student(4, "Tristan");
        Student Fitru = new Student(5, "Fitru");
        Student Mary = new Student(6, "Mary");
        Student Octavia = new Student(7, "Octavia");
        Double expected = 17.0;
        //When
        ZipCodeWilmington.getInstance().hostLecture(Dolio, expected);
        //Then
        Assert.assertEquals(expected, Todd.getTotalStudyTime());
    }
}
