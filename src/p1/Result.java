package p1;

public class Result {
    private String courseName;
    private double cgpa;
    private boolean passed;

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public boolean isPassed() {
        return passed;
    }
    public void setPassed(boolean passed) {
        this.passed = passed;
    }
    public void displayResult() {
        System.out.println("subject: "+ courseName +"\ncgpa: "+cgpa+"\nStatus: "+(passed?"Passed":"Failed"));
    }

    @Override
    public String toString() {
        return "Result{" +
                "courseName='" + courseName + '\'' +
                ", cgpa=" + cgpa +
                ", passed=" + passed +
                '}';
    }
}