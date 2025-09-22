package Inheritance;

class C {
    final void method1() {
        System.out.println("hello");
    }
}

class D {
    void method2() {
        C obj = new C();
        obj.method1();
    }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        D d = new D();
        d.method2();
    }
}
