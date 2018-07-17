package lab3;

import java.util.Optional;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

       int x,y;
        Scanner scanner = new Scanner(System.in);
        //input data
        System.out.print("Enter integer 1");
        x =scanner.nextByte(); // get data into x
        System.out.print("Knter integer 2:");
        y = scanner.nextInt();
        //te
        if (x>y) {
            System.out.print(x + "มากกว่า" + y);
        }else {
            System.out.print(y+"มากกว่า"+x);
        }





    }//main
}//class
