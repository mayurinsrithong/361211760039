package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exBufferReader {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?: ");
        String name = reader.readLine();
        System.out.println("How own are you?: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("How much do you weight");
        int Weight = Integer.parseInt(reader.readLine());

        //show data
        System.out.println("Hello, "+name);
        System.out.println("Your are "+age+"years old.");
        System.out.println("Your are "+Weight);





    }//main

}//class
