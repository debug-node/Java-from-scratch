package arrays.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Before sorting : "+ list);
        Collections.sort(list);
        System.out.println("After sorting : "+ list);
    }
}
