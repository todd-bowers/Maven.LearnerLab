package io.zipcoder.interfaces;

public interface Learner {
    default void learn(double numberOfHours){;
    }
    default Double getTotalStudyTime() {
        return null;
    }
}
