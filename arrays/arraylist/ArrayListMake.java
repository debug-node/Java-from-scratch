package arrays.arraylist;

import java.util.ArrayList;
// import java.util.Iterator;

public class ArrayListMake {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        // Iterator<String> itr = list.iterator();
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());       
        // }
        System.out.println("Returning element : "+list.get(1));
        list.set(1, "Dates");
        for(String fruit :list) {
            System.out.println(fruit);
        }

    }
}
