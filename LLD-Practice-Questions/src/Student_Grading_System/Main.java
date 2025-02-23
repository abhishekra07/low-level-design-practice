package Student_Grading_System;

import Student_Grading_System.course.Course;
import Student_Grading_System.course.EngineeringCourse;
import Student_Grading_System.grade.GPAGradeReport;
import Student_Grading_System.grade.GradeReport;
import Student_Grading_System.grade.PassFailGradeReport;

public class Main {
    public static void main(String[] args) {
        // Create student
        Student student = new Student("John Doe", 20, "12345");

        // Create course
        Course engineeringCourse = new EngineeringCourse();

        // Enroll student
        engineeringCourse.enrollStudent(student);

        // Assign grades for student (simplified)
        student.addGrade(75);  // For example, 75 for assignment
        student.addGrade(85);  // For example, 85 for exam

        // Generate grade report based on Pass/Fail

        GradeReport gpaReport = new GPAGradeReport();
        System.out.println(gpaReport.generateReport(student.getTotalScore()));  // GPA and Grade

        GradeReport passFailReport = new PassFailGradeReport();
        System.out.println(passFailReport.generateReport(student.getTotalScore()));  // Pass or Fail
    }
}