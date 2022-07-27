package io.zipcoder.interfaces;

public final class Students extends People {
    public static final Students INSTANCE = new Students();

    public static Students getInstance() {
        return INSTANCE;
    }
}
