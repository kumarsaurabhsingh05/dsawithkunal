package practicequestions;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfCharacter {
    public static void main(String[] args) {
        String str = "Saurabh Kumar Singh";
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : charArray) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }
}
