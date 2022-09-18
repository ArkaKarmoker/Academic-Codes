public class Exam {
    private double examType;
    private double examName;
    private double totalMarks;

    private double attemptingStudents;

    public double getAttemptingStudents() {
        return attemptingStudents;
    }

    public void setAttemptingStudents(double attemptingStudents) {
        this.attemptingStudents = attemptingStudents;
    }

    public double getExamType() {
        return examType;
    }

    public double getExamName() {
        return examName;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public Exam(double examType, double examName, double totalMarks, double attemptingStudents) {
        this.examType = examType;
        this.examName = examName;
        this.totalMarks = totalMarks;
        this.attemptingStudents = attemptingStudents;
    }
}
