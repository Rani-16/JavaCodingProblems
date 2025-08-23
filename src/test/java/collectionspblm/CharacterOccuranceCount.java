package collectionspblm;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccuranceCount {
    public static void main(String[] args) {
        String input = "Hello World";
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i <= input.length()-1; i++) {
            char ch = input.charAt(i);
            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) + 1);
            } else {
                mp.put(ch, 1);
            }
        }
        for(Map.Entry<Character,Integer>c:mp.entrySet()){
            System.out.println("Key values  : "+c.getKey()+"\n"+"Count : "+c.getValue());
        }
    }
}