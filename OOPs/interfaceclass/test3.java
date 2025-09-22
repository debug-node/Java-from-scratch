package interfaceclass;

interface example {
    void connect();
    void disconnect();
}
class oracle implements example {
    public void connect() {
        System.out.println("Connected to oracle database");
    }
    public void disconnect() {
        System.out.println("Disconnected from oracle database");
    }
}
public class test3 {
    public static void main(String[] args) {
        oracle o = new oracle();
        o.connect();
        o.disconnect();
    }
}
