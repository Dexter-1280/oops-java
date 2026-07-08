abstract class Shape {
   abstract void area();
}
class cricle extends Shape{
void area(){
    System.out.println("Area if circle is 2*pie*R*r");
}
}
class rectangle extends Shape{
    void area(){
        System.out.println("Area of retangle l* b*h");
    }
   
}
class main{
     public static void main(String[] args){
     rectangle n=new rectangle();
     n.area();
    }
}