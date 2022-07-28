package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] toArray() {
        return new Student[0];
    }
}
