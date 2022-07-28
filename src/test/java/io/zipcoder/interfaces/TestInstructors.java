package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructors() {
        Instructor Kris = new Instructor(1, "Kris");
        Instructor Dolio = new Instructor(2, "Dolio");
        Instructor Karen = new Instructor(3, "Karen");

        Assert.assertTrue(Instructors.getInstance().contains(Kris));
        Assert.assertTrue(Instructors.getInstance().contains(Dolio));
        Assert.assertTrue(Instructors.getInstance().contains(Karen));
    }
}
