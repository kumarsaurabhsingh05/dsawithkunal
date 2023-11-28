package practicequestions.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Write a Java program to copy one array list into another.

public class CopyOneIntoAnotherArrayList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Mumbai");
        stringList.add("Delhi");
        stringList.add("Kolkata");
        stringList.add("Chennai");
        stringList.add("Uttar Pradesh");
        stringList.add("Rajsthan");
        stringList.add("Dehradoon");

        List<String> newStringList = new ArrayList<>();
        newStringList.add("Bihar");
        newStringList.add("Jharkhand");
        newStringList.add("Mijoram");

        Collections.copy(stringList, newStringList);
        System.out.println(newStringList);
        System.out.println(stringList);

        Collections.sort(stringList);
        System.out.println(stringList);


//        Write a Java program to reverse elements in an array list.
        Collections.reverse(stringList);
        System.out.println(stringList);

//        Write a Java program to extract a portion of an array list.
        System.out.println(stringList.subList(2,6));

//        Write a Java program to compare two array lists.
        ArrayList<String> check = new ArrayList<>();
        for (String str : stringList) {
            check.add(newStringList.contains(str) ? "Yes" : "No");
        }
        System.out.println(check);

//        Write a Java program to shuffle elements in an array list.
        Collections.shuffle(stringList);
        System.out.println(stringList);
    }
}
