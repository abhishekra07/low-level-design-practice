package Student_Grading_System.course;

import Student_Grading_System.Student;

import java.util.ArrayList;
import java.util.List;

public class EngineeringCourse implements Course {
    private List<Student> students = new ArrayList<>();

    @Override
    public void enrollStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public void unenrollStudent(Student student) {
        this.students.remove(student);
    }
}