package lab8;

import javax.print.attribute.standard.NumberUp;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[]number ={10,20,30,40,50};

        try {
            System.out.print("Enter an integer:");
            int num = reader.nextInt();
            System.out.println("Integer : " + num);
            try {
            System.out.println("number ["+num+"] ="+number[num]);
        }catch (IndexOutOfBoundsException ex) {
            System.out.println("Enception: " + ex);
        }
    }catch(InputMismatchException ex) {
        System.out.println("Enception: " +ex);
    }
        System.out.println("Complete.");


    }//main
}//class
