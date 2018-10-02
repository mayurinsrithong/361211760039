package lab7;

public class Student {
    private String name;
    private String id;
    private String email;
    private String number;
    private int age;

    //constructor


    public Student(String name, String id, String email, String number, int age) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.number = number;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", age=" + age +
                '}';
    }
}//class

