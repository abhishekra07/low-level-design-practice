package Student_Grading_System.grade;

public class GPAGradeReport implements GradeReport {
    @Override
    public String generateReport(double totalScore) {
        // GPA calculation based on total score (out of 100)
        double gpa = (totalScore / 100) * 4.0;

        // Letter grade conversion based on GPA
        String letterGrade;
        if (gpa >= 3.7) {
            letterGrade = "A";
        } else if (gpa >= 3.0) {
            letterGrade = "B";
        } else if (gpa >= 2.0) {
            letterGrade = "C";
        } else {
            letterGrade = "F";
        }

        return "GPA: " + String.format("%.2f", gpa) + ", Grade: " + letterGrade;
    }
}