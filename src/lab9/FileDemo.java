package lab9;


import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        try {
            File myFile = new File("D:\\361211760039giithub\\src\\lab9\\mit.txt");//mit
            if (myFile.createNewFile())
                System.out.println("new file created.");
            else
                System.out.println("File already exited");
        }catch (IOException ex){
         ex.printStackTrace();
        }

        //write File
        //WriteMyFiel();
        readMyFile();


    }//main

    private static void readMyFile() {
        try {
            FileReader reader = new FileReader("D:\\361211760039giithub\\src\\lab9\\mit.txt");
            int i;
            while ((i=reader.read())!=-1){
                System.out.print((char)i);
            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }//readMyFile

    private static void WriteMyFiel() {
        Writer w = null;
        try {
            w = new FileWriter("D:\\361211760039giithub\\src\\lab9\\mit.txt",true);
            String content = "\nMIT SAIYAI 2018\r";
            w.write(content);
            System.out.println("Done.");
        }catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            try {
                w.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }


        }//main
}//class
