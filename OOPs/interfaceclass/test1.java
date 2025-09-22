package interfaceclass;

interface Callback {
    void callback(int param);
}

class Client implements Callback {
    @Override
    public void callback(int param) {
        System.out.println("Callback called with : " + param);
    }
}

public class test1 {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
