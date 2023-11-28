package practicequestions;

import java.util.HashMap;

public class CharacterOccurrenceCounter {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCountMap = countCharacterOccurrences("programming is fun");
        System.out.println(charCountMap);
    }

//    public static HashMap<Character, Integer> countCharacterOccurrences(String str) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (char ch : str.toCharArray()) {
//            if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
//            else map.put(ch, 1);
//        }
//        return map;
//    }
    public static HashMap<Character, Integer> countCharacterOccurrences(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return charCountMap;
    }
}
