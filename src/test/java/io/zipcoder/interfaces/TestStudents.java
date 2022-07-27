package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testContents() {
        Student testStudent = new Student(1, "Todd");

        Assert.assertTrue(Students.getInstance().contains(testStudent));
    }
}
