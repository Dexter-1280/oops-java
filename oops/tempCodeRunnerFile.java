package oops;
interface onlinePayment{
    void payOnlinne();
}
interface cashPayment{
    void payCash();
}
class PaymentMethod implements onlinePayment,cashPayment{
    public void payOnline(){
        System.out.println("ONline");
    }
    public void payCash(){
        System.out.println("Cash");
    }
    public static void main(String args[]){
        onlinePayment e1=new onlinePayment();
        e1.payOnline();
        cashPayment e2=new cashPayment();
        e2.payCash();
    }
}