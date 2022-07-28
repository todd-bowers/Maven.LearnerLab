package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<T extends Person> implements Iterable<T> {
    List<T> personList = new ArrayList<>();

    public void add(T person) {
        personList.add(person);
    }

    public T findById(long id) {
        for (int i = 0; i < count(); i++) {
            if (personList.get(i).getId() == id) return personList.get(i);
        }
        return null;
    }

    public boolean contains(T person) {
        return personList.contains(person);
    }

    public void remove(T person) {
        personList.remove(person);
    }

    public void remove(long id) {
        for (T holder : personList) {
            if (holder.getId() == id) {
                personList.remove(holder);
                break;
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        Person[] personArray = new Person[count()];
        for (int i = 0; i < count(); i++) {
            personArray[i] = personList.get(i);
        }
        return personArray;
    }

    @Override
    public Iterator<T> iterator() {
        return personList.iterator();
    }
}
