package arrays.arraylist;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> V = new Vector<Integer>();
        int x[] = { 10, 20, 30, 40, 50, 60 };
        for (int i = 0; i < x.length; i++) {
            V.add(x[i]);
        }
        System.out.println("vector elements : ");
        for (int i = 0; i < V.size(); i++) {
            System.out.println(V.get(i));
        }
    }
}
