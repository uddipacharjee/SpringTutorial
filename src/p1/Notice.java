package p1;

public class Notice {
    private String message;
    private int id;

    public void init(){
        System.out.println("Notice Initialzaton callback method Test");

    }
    public void checkValues(){
        if(id<1){
            System.out.println("Invalid ID ");
            this.id=0;
        }
    }
    public void destroy(){
        System.out.println("Notice Destuction callback Test");
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Notice{");
        sb.append("message='").append(message).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
