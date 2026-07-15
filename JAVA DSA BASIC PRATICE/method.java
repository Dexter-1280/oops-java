public class method {
    int change(int a) {
        a = 1;
        return a;
    }

    public static void main(String[] args) {
        int a = 100;

        method obj = new method();

        a = obj.change(a);

        System.out.println("The changed value is " + a);
    }
}