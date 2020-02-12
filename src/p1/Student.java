package p1;

public class Student {
    private String name;
    private int age;
    private MarkSheet markSheet;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, MarkSheet markSheet) {
        this.name = name;
        this.age = age;
        this.markSheet = markSheet;
    }

    public MarkSheet getMarkSheet() {
        return markSheet;
    }

    public void setMarkSheet(MarkSheet markSheet) {
        this.markSheet = markSheet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", markSheet=" + markSheet +
                '}';
    }
}

