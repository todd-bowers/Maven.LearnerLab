package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    double totalStudyTime;
    public Student(long id, String name) {
        super(id, name);
        Students.getInstance().add(this);
        double totalStudyTime = 0;
    }
    public Student() {
        super(0,"");
        Students.getInstance().add(this);
    }
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
