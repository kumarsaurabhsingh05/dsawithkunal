package practicequestions.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Write a Java program to iterate through all elements in an array list.

public class PrintWithIterator {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Mumbai");
        stringList.add("Delhi");
        stringList.add("Kolkata");
        stringList.add("Chennai");

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
