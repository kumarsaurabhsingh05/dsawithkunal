package practicequestions.arraylist;

// Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;

public class PrintColours {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Green");
        list.add("Red");
        list.add("Yellow");
        list.add("Pink");

        System.out.println(list);
    }
}
