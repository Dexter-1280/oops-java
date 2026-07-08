// Interface
interface ElectronicDevice {
    void turnOn(); // Abstract method
}

// Class implementing the interface
class Laptop implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on...");
    }
}

// Main class
public class D {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.turnOn(); // Output: Laptop is turning on...
    }
}
