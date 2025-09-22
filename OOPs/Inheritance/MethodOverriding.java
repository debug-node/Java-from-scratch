package Inheritance;

class parent1 {
    void display() {
        System.out.println("i am a parent class");
    }
}
class child1 extends parent1 {
    void display() {
        System.out.println("i am a child class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        parent1 p = new parent1();
        p.display();
        child1 c = new child1();
        c.display();
        // Method Overriding example with runtime polymorphism
        parent1 pc = new child1();
        pc.display(); // Child method (overridden)

    }
}
