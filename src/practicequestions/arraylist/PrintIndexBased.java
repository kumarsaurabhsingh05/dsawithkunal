package practicequestions.arraylist;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to retrieve an element (at a specified index) from a given array list.

public class PrintIndexBased {

        public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Saurabh");
        list.add("Nishant");
        list.add("Ashish");
        list.add("Deepak");
        list.add("Ashutosh");

        System.out.println(list);

        String str = list.get(1);

        System.out.println(str);

    }
}
