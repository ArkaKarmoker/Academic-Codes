public class Course {
    private double courseCode;
    private double courseName;
    private double secNo;
    private double Exams;

    public Course(double courseCode, double courseName, double secNo, double exams) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.secNo = secNo;
        Exams = exams;
    }

    public double getExams() {
        return Exams;
    }

    public void setExams(double exams) {
        Exams = exams;
    }

    public double getCourseCode() {
        return courseCode;
    }

    public double getCourseName() {
        return courseName;
    }

    public double getSecNo() {
        return secNo;
    }
}
