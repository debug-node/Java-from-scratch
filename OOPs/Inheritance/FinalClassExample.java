package Inheritance;

class N {
    void method1() {
        System.out.println("This is parent class");
    }
}
final class M extends N {
    void method2() {
        System.out.println("This is child class");
    }
}

public class FinalClassExample {
    public static void main(String[] args) {
        M m = new M();
        m.method1();
        m.method2();
    }
}
