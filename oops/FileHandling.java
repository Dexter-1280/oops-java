package oops;
import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File file = new File("student.txt");

        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }

        FileWriter writer = new FileWriter(file);
        writer.write("Name: Aditya\n");
        writer.write("Branch: CSE\n");
        writer.close();

        FileWriter appendWriter = new FileWriter(file, true);
        appendWriter.write("CGPA: 7.69\n");
        appendWriter.close();

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}