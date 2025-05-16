package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

    public static void main(String[] args) {

        Map<String, Integer> numbersMap = new HashMap<>();
        numbersMap.put("One", 1);
        numbersMap.put("Two", 2);
        numbersMap.put("Three", 3);

        numbersMap.put("Two", 23);   //This will overwrite the earlier value as the keys in a map should always be unique.

        System.out.println(numbersMap);

        numbersMap.putIfAbsent("Four", 4);
        numbersMap.putIfAbsent("One", 11);

        System.out.println(numbersMap);

        for(Map.Entry<String, Integer> eachEntry : numbersMap.entrySet()) {
            System.out.println("Each Entry : " +eachEntry);

            System.out.println("Each Key : " +eachEntry.getKey());

            System.out.println("Each Value : " +eachEntry.getValue());
        }

        for (String eachKey : numbersMap.keySet()) {
            System.out.println("Each Key in Keyset loop :- "+eachKey);
        }

        for (Integer eachValue : numbersMap.values()) {
            System.out.println("Each value in values loop :- "+eachValue);
        }

        System.out.println("Contains Value :- "+numbersMap.containsValue(45));

        System.out.println("Is Empty? "+ !numbersMap.isEmpty());

    }
}
