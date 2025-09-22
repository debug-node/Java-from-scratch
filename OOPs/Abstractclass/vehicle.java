package Abstractclass;

abstract class car {
    void opentank() {
        System.out.println("Fill the tank");
    }
    abstract void steering();
    abstract void brakes();
}
class maruthi extends car {
    void steering() {
        System.out.println("Ordinary steering");
    }
    void brakes() {
        System.out.println("Hydrolic brakes");
    }
}
class santro extends car {
    void steering() {
        System.out.println("Power steering");
    }
    void brakes() {
        System.out.println("Gas brakes");
    }
}

public class vehicle {
    public static void main(String[] args) {
        maruthi m = new maruthi();
        santro s = new santro();
        car ref;
        ref = m;
        ref.opentank();
        ref.steering();
        ref.brakes();
        ref = s;
        ref.opentank();
        ref.steering();
        ref.brakes();
    }
}
