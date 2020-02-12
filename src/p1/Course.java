package p1;

public class Course {
    private String name;
    private int credit;

    public Course(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                '}';
    }
}
