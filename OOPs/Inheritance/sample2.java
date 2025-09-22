package Inheritance;

class A {
    int i = 10, j = 20;
    void show() {
        System.out.println(i+" "+j);
    }
}
class B extends A {
    int k = 30;
    void sum() {
        System.out.println(i+j+k);
    }
}
public class sample2 {
    public static void main(String[] args) {
        B D = new B();
        D.sum();
        D.show();
    }
}
