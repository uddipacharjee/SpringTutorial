package p1;

import java.util.List;

public class Teacher {
    private String name;
    private int age;
    private List<Course> courses;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, int age, List<Course> courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                '}';
    }
}
