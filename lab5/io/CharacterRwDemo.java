package io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class CharacterRwDemo{
    public static void main(String... args){
        try {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter file name:");
            String fileName=in.nextLine();
            System.out.println("Enter text: ");
            String text=in.nextLine();
            writeFile(fileName,text);

            in.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void readFile(String fileName) throws Exception{
        FileInputStream fis= new FileInputStream(fileName);
        int c;
        while((c=fis.read())!=-1){
            System.out.println((char)c);

        }
        System.out.println();
        fis.close();
        
    }

    static void writeFile() throws Exception{
        FileOutputStream fos= new FileOutputStream("myfile.text");
        fos.write("Hello BE computer!!!".getBytes());
        System.out.println("Complete");

    }

    static void writeFile(String fileName, String message) throws Exception{
        FileReader fos= new FileReader(fileName);
        fos.write(message.getBytes());
        fos.close();
        System.out.print("Complete..");
    }
}