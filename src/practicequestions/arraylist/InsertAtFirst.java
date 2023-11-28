package practicequestions.arraylist;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to insert an element into the array list at the first position.

public class InsertAtFirst {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Saurabh");
        list.add("Nishant");
        list.add("Ashish");
        list.add("Deepak");
        list.add("Ashutosh");

        System.out.println(list);

        list.add(0, "Manoj");

        System.out.println(list);

    }
}
