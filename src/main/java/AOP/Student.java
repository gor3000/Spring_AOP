package AOP;

public class Student {
    private String nameSurnamt;
    private int course;
    private double avgGrade;

    public Student(String nameSurnamt, int course, double avgGrade) {
        this.nameSurnamt = nameSurnamt;
        this.avgGrade = avgGrade;
        this.course = course;
    }

    public String getNameSurnamt() {
        return nameSurnamt;
    }

    public void setNameSurnamt(String nameSurnamt) {
        this.nameSurnamt = nameSurnamt;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurnamt='" + nameSurnamt + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
