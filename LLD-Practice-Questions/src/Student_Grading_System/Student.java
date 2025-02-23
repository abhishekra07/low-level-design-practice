package Student_Grading_System;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String rollNumber;
    private List<Double> grades = new ArrayList<>();

    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double getTotalScore() {
        return this.grades.stream().mapToDouble(Double::doubleValue).sum();
    }

    public List<Double> getGrades() {
        return this.grades;
    }
}