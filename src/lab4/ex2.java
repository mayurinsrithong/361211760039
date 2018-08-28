
package lab4;
//get data as Integer 2 values from user
//procas with method following:
//1.summation (+)
//2.subtraction (-)
//3.multiple (*)
//4.divide (/)
//than, show the result on the screen.

import java.util.Scanner;

public class ex2 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter an integer 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter an integer 2: ");
        num2 = sc.nextInt();
        System.out.println("The summation is:"+summation(num1,num2));
        System.out.println("The subtraction is:"+subtraction(num1,num2));
        System.out.println("The multiple is:"+multiple(num1,num2));
        System.out.println("The divide is:"+divide(num1,num2));
    }
    public  static  int summation (int x, int y){
        return x+y;

    }
    public static int subtraction (int x, int y){
        return x-y;

    }
    public  static int multiple (int x,int y){
        return x*y;
    }
    public static int divide (int x, int y){
        return  x/y;
    }
}//ex2