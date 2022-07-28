package io.zipcoder.interfaces;

import java.util.HashMap;

public final class ZipCodeWilmington {
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        Student[] student = students.toArray();
        teacher.lecture(student, numberOfHours);
    }

    public void hostLecture(long id, Double numberOfHours) {
        Student[] student = students.toArray();
        Teacher teacher = (Teacher) instructors.findById(id);
        teacher.lecture(student, numberOfHours);
    }

    public HashMap<Student, Double> getStudyMap() {
        HashMap<Student, Double> studyMap = new HashMap<>();
        Student[] studentArray = students.toArray();
        for (Student student : studentArray) {
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }
}
