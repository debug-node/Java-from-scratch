package interfaceclass;

// Step 1: Interface
interface Good {
    void will();  // abstract method
    void bye();     // abstract method
}

// Step 2: Abstract class partially implements interface
abstract class help implements Good {
    int a = 10, b = 20;

    void sum() {
        System.out.println("Sum = " + (a + b));
    }

    // Implement only one method
    public void will() {
        System.out.println("Hello, Welcome!");
    }

    // bye() is not implemented → so this class must remain abstract
}

// Step 3: Concrete class fully implements
class Sub extends help {
    public void bye() {
        System.out.println("Goodbye!");
    }
}

// Step 4: Main class
public class PartialInterfaceExample {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.will();  // from Sample
        obj.bye();     // from Sub
        obj.sum();     // from Sample
    }
}
