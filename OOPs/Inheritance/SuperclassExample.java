package Inheritance;

class one {
    int i = 10;
    void show() {
        System.out.println("Super class method : i = "+i);
    }
}
class two extends one {
    int i = 20;
    void show() {
        System.out.println("Sub class method : i = "+i);
        super.show();
        System.out.println("Super class i = "+super.i);
    }
}
public class SuperclassExample {
    public static void main(String[] args) {
        two t = new two();
        t.show();
    }
}
