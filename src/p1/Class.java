package p1;

public class Class {

    // autowiring constructor test
    private Teacher teacher;

    public Class(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Class{" +
                "teacher=" + teacher +
                '}';
    }
    /*
    // autowiring byType Test
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Class{" +
                "student=" + student +
                '}';
    }

     */
    // autowiring byName Test

//    private Teacher teacher1;
//    private Student student1;
//    private Student student2;
//    private MarkSheet ms;
//
//    public MarkSheet getMs() {
//        return ms;
//    }
//
//    public void setMs(MarkSheet ms) {
//        this.ms = ms;
//    }
//
//    public Student getStudent2() {
//        return student2;
//    }
//
//    public void setStudent2(Student student2) {
//        this.student2 = student2;
//    }
//
//    public Student getStudent1() {
//        return student1;
//    }
//
//    public void setStudent1(Student student1) {
//        this.student1 = student1;
//    }
//
//    public Teacher getTeacher1() {
//        return teacher1;
//    }
//
//    public void setTeacher1(Teacher teacher1) {
//        this.teacher1 = teacher1;
//    }
//
//    @Override
//    public String toString() {
//        return "Class{" +
//                "teacher1=" + teacher1 +
//                ", student1=" + student1 +
//                ", student2=" + student2 +
//                ", ms=" + ms +
//                '}';
//    }
//
}
