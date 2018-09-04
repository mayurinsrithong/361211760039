package MidtermExam;
import java.awt.image.Kernel;
import java.util.Scanner;

public class Midterm3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int testScore ;
        //do-while
        do {
            System.out.print("ชื่ออาจารย์ : ");
            String name = input.nextLine();
            System.out.print("ชื่อคณะ : ");
            int age = input.nextInt();
            System.out.print("เงินเดื่อน : ");
            testScore = input.nextInt();
            System.out.print("กรุณาใส่ชั่วโมงที่สอน : ");
            testScore = input.nextInt();
        }while (testScore<0 || testScore>24);


        if (testScore < 12)
            System.out.println("ไม่ได้รับโบนัส");
        else if (testScore < 16)
            System.out.println("ได้รับโบนัส 5 %");
        else if (testScore < 20)
            System.out.println("ได้รับโบนัส 10 %");
        else if (testScore < 24)
            System.out.println("ได้รับโบนัส 15 %");











    }//main


}//class
