package lab3;

import com.sun.org.apache.bcel.internal.generic.Select;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        //switch-case
        Scanner scanner = new Scanner(System.in);
        int selected;

        //show option
        System.out.println("กรุณาเลือกรายวิชาที่คุณชอบมากที่สุด ?");
        System.out.println("1.Acco");
        System.out.println("2.Mark");
        System.out.println("3.Sys");
        System.out.println("4.Com");
        System.out.println("กรอกหมายเลขรายวิชา: ");
        selected = scanner.nextInt();
        Scanner input = new Scanner(System.in);

        System.out.print("เลื่อกหมายเลข (1-4): ");
        selected = input.nextInt();

        //switch-case
        switch (selected){
            case 1: System.out.println("คุณชอบ Acco"); break;
            case 2: System.out.println("คุณชอบ Mark"); break;
            case 3: System.out.println("คุณชอบ Sys"); break;
            case 4: System.out.println("คุณชอบ Com"); break;
            default: System.out.println("กรุณากรอก 1-4 เท่านั้น");



        }





    }//main
}//class
