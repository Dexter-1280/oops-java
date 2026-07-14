package oops;
//Interface
interface Animal {
void makeSound(); // Abstract method
}
class Dog implements Animal {          //Class implementing the interface

@Override
public void makeSound() {
System.out.println("Dog barks: Woof Woof!");
}
}
class Cat implements Animal {    //Another class implementing the interface
@Override
public void makeSound() {
System.out.println("Cat meows: Meow Meow!");
}
}
public class InterfaceExamplee {  //Main class with main method

public static void main(String[] args) {
// Creating objects
Dog d = new Dog();
Cat c = new Cat();
// Calling methods
d.makeSound();
c.makeSound();
}
}
