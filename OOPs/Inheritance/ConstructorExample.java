package Inheritance;
class one1 {
    one1() {
        System.out.println("One");
    }
}
class two1 extends one1 {
    two1() {
        System.out.println("Two");
    }
    void show() {
        System.out.println("This is two1 object");
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        two1 t = new two1();
        t.show();
    }
}
