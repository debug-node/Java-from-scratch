package Abstractclass;

abstract class shape {
    abstract void draw();
}
class rectangle extends shape {
    void draw() {
        System.out.println("Draw Rectangle");
    }
}
class triangle extends shape {
    void draw() {
        System.out.println("Draw Triangle");
    }
}
public class shaping {
    public static void main(String[] args) {
        shape s1 = new rectangle();
        s1.draw();
        s1 = new triangle();
        s1.draw();
    }
}
