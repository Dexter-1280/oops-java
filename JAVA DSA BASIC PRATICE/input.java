import java.util.Scanner;

class input{
String name;
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
         short s = sc.nextShort();

        int i = sc.nextInt();

        long l = sc.nextLong();

        float f = sc.nextFloat();

        double d = sc.nextDouble();

        char ch = sc.next().charAt(0);

        boolean bool = sc.nextBoolean();

        String word = sc.next();

        sc.nextLine();

        String sentence = sc.nextLine();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(bool);
        System.out.println(word);
        System.out.println(sentence);
    }
}
    
