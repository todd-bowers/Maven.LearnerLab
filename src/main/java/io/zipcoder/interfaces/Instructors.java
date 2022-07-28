package io.zipcoder.interfaces;

public final class Instructors extends People {
    public static final Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
