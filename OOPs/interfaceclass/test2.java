package interfaceclass;

interface Greeting {
    void wishes();  
}
class sample1 implements Greeting {
    public void wishes() {
        System.out.println("Happy New Year");
    }
}
public class test2 {
    public static void main(String[] args) {
        sample1 obj = new sample1();
        obj.wishes();
    }
}
