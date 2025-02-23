package Student_Grading_System.grade;

public class PassFailGradeReport implements GradeReport {
    @Override
    public String generateReport(double totalScore) {
        return totalScore >= 50.0 ? "Pass" : "Fail";
    }
}