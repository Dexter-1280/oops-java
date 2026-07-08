import java.util.Scanner;

public class userinpu {
    public static void main(String[] args) {

//
        Scanner sc = new Scanner(System.in); // this line is important to initae my futher scanner
        System.out.println("taking input from  user");


        System.out.println("Enter the number 1");
        int a=sc.nextInt();
        System.out.println("Enter the number 2");
        int b=sc.nextInt();
        System.out.println("Taking string as user input");
        String str=sc.next(); //user input
        System.out.println(str);

    }
}
