abstract class vehical{
    void fuelType(){
        System.out.println("hello");
    }
    abstract void speed();
}
class Bike extends vehical{
void speed(){
    System.out.println("spped");
}
public static void main(String[] args){
    Bike b1=new Bike();
    b1.speed();
    b1.fuelType();
}
}