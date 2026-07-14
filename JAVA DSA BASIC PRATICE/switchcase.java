import java.util.Scanner;

public class switchcase {
    int choices;
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your value:");
        int choices=sc.nextInt();

        switch(choices){
        case 1: System.out.println("BEEP BEEP FORWARD HONK");
        break;
        case 2: System.out.println("BEEP BEEP SIDEWARD HONK");
        break;
        case 3:System.out.println("BEEP BEEP BACKWORD HONK");
        break;
        default: System.out.println("BLAH BLAH");
        break;
        }
    }
}
