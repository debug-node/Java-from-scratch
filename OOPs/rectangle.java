class rect {
    int length;
    int breadth;
    
    void insert(int l, int b){
        length = l;
        breadth = b;
    }

    void computearea(){
        System.out.println("Area : "+ length*breadth);
    }
}


public class rectangle {
    public static void main(String[] args) {
        rect r1 = new rect();
        rect r2 = new rect();
        r1.insert(10, 5);
        r2.insert(3, 10);
        r1.computearea();
        r2.computearea();
    }    
}
