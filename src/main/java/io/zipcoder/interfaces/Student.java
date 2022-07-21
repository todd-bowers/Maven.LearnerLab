package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    double totalStudyTime;
    public Student(long id, String name) {
        super(id, name);
        double totalStudyTime = 0;
    }
    public Student() {
        super(0,"");
    }
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
