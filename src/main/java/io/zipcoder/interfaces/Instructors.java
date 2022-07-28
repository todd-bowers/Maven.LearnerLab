package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] toArray() {
        return new Instructor[0];
    }
}
