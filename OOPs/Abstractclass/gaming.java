package Abstractclass;

abstract class game {
    public abstract void start();
    public void stop() {
        System.out.println("Stopping game in abstract class");
    }
}
class game1 extends game {
    public void start() {
        System.out.println("Starting game 1");
    }
}
class game2 extends game {
    public void start() {
        System.out.println("Starting game 2");
    }
}

public class gaming {
    public static void main(String[] args) {
        game1 A = new game1();
        game2 B = new game2();
        A.start();
        A.stop();
        B.start();
        B.stop();
    }
}
