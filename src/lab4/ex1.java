package lab4;

public class ex1 {
    public static void B (String msg) {
        System.out.println("Hello B"+ msg);
    }//B
    public static void main(String[] args) {

        System.out.println("Hello main");
     //calling A()
        A();
        A();
        //calling B()
        B("SAM");
        //calling c ()
        int result = c(10,10);
        System.out.println(result);
        System.out.println(c(10,10));



    }//main
    public static void A (){
        System.out.println("Hello A");
    }//A
    public static int c (int x, int y) {
        System.out.println("Hello c");
        int sum = x+y;
        return sum; //x+y;
    }//c

}//class
