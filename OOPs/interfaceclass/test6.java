package interfaceclass;

class X {
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}
class Y implements X.NestedIF {
    public boolean isNotNegative(int x) {
        return x<0?false:true;
    }
}
public class test6 {
    public static void main(String[] args) {
        X.NestedIF nIf = new Y();
        if(nIf.isNotNegative(10)) {
            System.out.println("10 is not negative");
        }
    }
}
