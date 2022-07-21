package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    @Test
    public void testAdd() {
        //Given
        Person test1 = new Person(0, "Tessa");
        Person test2 = new Person(1, "Todd");
        People people = new People();
        //When
        people.add(test1);
        people.add(test2);
        //Then
        Assert.assertEquals(test1, people.personList.get(0));
        Assert.assertEquals(test2, people.personList.get(1));
    }

    @Test
    public void testRemoveByPerson1() {
        //Given
        Person test1 = new Person(0, "Tessa");
        Person test2 = new Person(1, "Todd");
        People people = new People();
        people.add(test1);
        people.add(test2);
        //When
        people.remove(test1);
        people.remove(test2);
        //Then
        Assert.assertFalse(people.contains(test1));
        Assert.assertFalse(people.contains(test2));
    }
    @Test
    public void testRemoveByPerson2() {
        //Given
        Person test1 = new Person(0, "Tessa");
        Person test2 = new Person(1, "Todd");
        People people = new People();
        people.add(test1);
        people.add(test2);
        //When
        people.remove(test1);
        //Then
        Assert.assertFalse(people.contains(test1));
        Assert.assertTrue(people.contains(test2));
    }
    @Test
    public void testRemoveById1() {
        //Given
        Person test1 = new Person(0, "Tessa");
        Person test2 = new Person(1, "Todd");
        People people = new People();
        people.add(test1);
        people.add(test2);
        //When
        people.remove(0);
        people.remove(1);
        //Then
        Assert.assertFalse(people.contains(test1));
        Assert.assertFalse(people.contains(test2));
    }
    @Test
    public void testRemoveById2() {
        //Given
        Person test1 = new Person(0, "Tessa");
        Person test2 = new Person(1, "Todd");
        People people = new People();
        people.add(test1);
        people.add(test2);
        //When
        people.remove(0);
        //Then
        Assert.assertFalse(people.contains(test1));
        Assert.assertTrue(people.contains(test2));
    }
    @Test
    public void testRemoveAll() {
        //Given
        Person test1 = new Person(0, "Tessa");
        Person test2 = new Person(1, "Todd");
        People people = new People();
        people.add(test1);
        people.add(test2);
        //When
        people.removeAll();
        //Then
        Assert.assertEquals(0, people.personList.size());
    }
}
