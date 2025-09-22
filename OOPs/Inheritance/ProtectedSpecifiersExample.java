package Inheritance;

class access {
    // private int a = 10;  // its gives an error
    int a = 10;             // its gives an output
    protected int b = 20;   // its gives an output
}
class sub extends access {
    public void get() {
        System.out.println(a);  // error
        System.out.println(b);  // allowed
    }
}
public class ProtectedSpecifiersExample {
    public static void main(String[] args) {
        sub s = new sub();
        s.get();
    }
}
