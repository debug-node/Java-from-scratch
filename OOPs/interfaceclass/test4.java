package interfaceclass;

interface activities {
    void eat();
    void sleep();
    void run();
    void walk();
}
class animal implements activities {
    public void eat() {
        System.out.println("Eating...");
    }
    public void sleep() {
        System.out.println("Sleeping...");
    }
    public void run() {
        System.out.println("Running...");
    }
    public void walk() {
        System.out.println("Walking...");
    }
}
public class test4 {
    public static void main(String[] args) {
        animal a = new animal();
        a.eat();
        a.sleep();
        a.run();
        a.walk();
    }
}
