package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> personList = new ArrayList<>();

    public void People() {
        List<Person> personList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(long id) {
        Person found = null;
        for (Person person : this.personList) {
            if (person.getId() == id) {
                found = person;
            }
            else found = null;
        }
        return found;
    }

    public boolean contains(Person person) {
        return this.personList.contains(person);
    }

    public void remove(Person person) {
        for (Person holder : this.personList) {
            if (holder == person) {
                this.personList.remove(holder);
                break;
            }
        }
    }

    public void remove(long id) {
        for (Person holder : this.personList) {
            if (holder.getId() == id) {
                this.personList.remove(holder);
                break;
            }
        }
    }

    public void removeAll() {
        this.personList.clear();
    }

    public int count() {
        return this.personList.size();
    }

    public Person[] toArray() {
        Person[] personArray = new Person[this.count()];
        for (int i = 0; i < this.count(); i++) {
            personArray[i] = this.personList.get(i);
        }
        return personArray;
    }
}
