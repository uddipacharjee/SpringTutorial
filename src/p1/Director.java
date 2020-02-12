package p1;

public class Director {
    private String name;
    private int age;
    private static final Director directorObj=new Director();

    private Director() {
        name="Alen";
        age=45;
    }

    public  static Director getDirector(){
        return directorObj;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
