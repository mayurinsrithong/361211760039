package Quiz;

public class Quiz_1 {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;

        for (int i = 500; i < 1000; i++) {
            //statement for
            if (i % 3 == 0 || i % 6 == 0) {
                count++;
                total += i;
                System.out.println(i + " ");
            }
        }
        System.out.println("The total value is "+total);
        System.out.println("The average value is "+total/count);




























    }//main
}//class
