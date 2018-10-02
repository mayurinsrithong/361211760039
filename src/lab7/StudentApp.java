package lab7;

public class StudentApp {
    public static void main(String[] args) {
        Student std =new Student("mayurin",
                "039",
                "mayurin0039@gmail.com",
                "0630800217",
                21);

        System.out.println(std.toString());
        std.setName("Mayurin Srithong");
        System.out.println(std.toString());



    }//main
}//class
