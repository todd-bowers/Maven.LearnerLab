package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        //Given
        long expectedId = 37;
        String expectedName = "Jeff";
        //When
        Person test = new Person(expectedId, expectedName);
        //Then
        Assert.assertEquals(expectedId, test.getId());
        Assert.assertEquals(expectedName, test.getName());
    }

    @Test
    public void testSetName() {
        //Given
        long expectedId = 37;
        String originalName = "Jeff";
        //When
        Person test = new Person(expectedId, originalName);
        String expectedName = "Todd";
        test.setName(expectedName);
        //Then
        Assert.assertEquals(expectedName, test.getName());
    }
}
