package practicequestions.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Write a Java program to update an array element by the given element.
public class UpdateElement {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Mumbai");
        stringList.add("Delhi");
        stringList.add("Kolkata");
        stringList.add("Chennai");
        stringList.add("Uttar Pradesh");
        stringList.add("Rajsthan");
        stringList.add("Dehradoon");

        System.out.println(stringList);

        stringList.set(3, "Bangalore");

        System.out.println(stringList);

        stringList.remove(3); // removes the third element

        System.out.println(stringList);

        System.out.println(stringList.contains("Delhi"));

//        Write a Java program to sort a given array list.
//        Collections.sort(stringList);

        stringList.sort(null);

        System.out.println(stringList);

    }
}
