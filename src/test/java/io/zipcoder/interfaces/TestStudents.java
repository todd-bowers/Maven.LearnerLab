package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testStudents() {
        Student Todd = new Student(1, "Todd");
        Student Eric = new Student(2, "Eric");
        Student JD = new Student(3, "JD");
        Student Tristan = new Student(4, "Tristan");
        Student Fitru = new Student(5, "Fitru");
        Student Mary = new Student(6, "Mary");
        Student Octavia = new Student(7, "Octavia");

        Assert.assertTrue(Students.getInstance().contains(Todd));
        Assert.assertTrue(Students.getInstance().contains(Eric));
        Assert.assertTrue(Students.getInstance().contains(JD));
        Assert.assertTrue(Students.getInstance().contains(Tristan));
        Assert.assertTrue(Students.getInstance().contains(Fitru));
        Assert.assertTrue(Students.getInstance().contains(Mary));
        Assert.assertTrue(Students.getInstance().contains(Octavia));
    }
}
