package lab3;

import java.util.Scanner;

public class BMRCal {
    public static void main(String[] args) {
        //to do
        String c;
        int h, a;
        double w;
        Scanner scanner = new Scanner(System.in);
        //input data
        System.out.print("กรุณาระบุถ้าเป็นเพศชายพิมพ์ m ถ้าเป็นเพศหญิงพิมพ์ f: ");
        c = scanner.nextLine();
        System.out.print("ระบุน้ำหนักของคุณ: ");
        w = scanner.nextDouble();
        System.out.print("ระบุความสูงของคุณ: ");
        h = scanner.nextInt();
        System.out.print("คุณอายุเท่าไหร่: ");
        a = scanner.nextInt();
        //test condition
        double BMR;
        if (c.equals("m")){
            BMR = 66 + (13.7 * w) + (5 * h) - (6.8 * a);
    }else {
            BMR = 655 + (9.6 * w) + (1.8 * h) - (4.7 * a);
    }
//output
    System.out.println("your BMR is: "+BMR);






    }//main
}//class
