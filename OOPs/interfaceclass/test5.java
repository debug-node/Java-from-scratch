package interfaceclass;

interface action {
    void eat();
    void sleep();
}
interface joy extends action {
    void play();
    void coding();
}
class MC implements joy {
    public void eat() {
        System.out.println("Eating..");
    }
    public void sleep() {
        System.out.println("Sleeping..");
    }
    public void play() {
        System.out.println("Playing..");
    }
    public void coding() {
        System.out.println("Codinging..");
    }
}
public class test5 {
    public static void main(String[] args) {
        MC obj = new MC();
        obj.eat();
        obj.sleep();
        obj.play();
        obj.coding();
    }
}
