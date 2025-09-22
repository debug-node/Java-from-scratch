package Abstractclass;

abstract class Myclass {
   abstract void calculate(int x);
}
class sub1 extends Myclass {
    void calculate(int x) {
        System.out.println(x*x);
    }
}
class sub2 extends Myclass {
    void calculate(int x) {
        System.out.println(Math.sqrt(x));
    }
}
class sub3 extends Myclass {
    void calculate(int x) {
        System.out.println(x*x*x);
    }
}
public class example1 {
    public static void main(String[] args) {
        sub1 obj1 = new sub1();
        sub2 obj2 = new sub2();
        sub3 obj3 = new sub3();
        obj1.calculate(3);
        obj2.calculate(4);
        obj3.calculate(5);
    }
}
