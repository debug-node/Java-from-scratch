package Inheritance;

class parent {
    void display() {
        System.out.println("i am a parent class");
    }
}
class child extends parent {
    void show() {
        System.out.println("i am a child class");
    }
}

public class sample {
    public static void main(String[] args) {
        child c = new child();
        c.show();
        c.display();
    }
}
