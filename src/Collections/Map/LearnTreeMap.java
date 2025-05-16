package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {

    public static void main(String[] args) {

        Map<String, Integer> numbersMap = new TreeMap<>(); //Map is sorted according to the natural ordering of it's keys.

        numbersMap.put("One", 1);
        numbersMap.put("Two", 2);
        numbersMap.put("Three", 3);
        numbersMap.put("Four", 4);
        numbersMap.put("Five", 5);

        System.out.println(numbersMap);

        System.out.println(numbersMap.remove("Three"));

        System.out.println(numbersMap);

        System.out.println(numbersMap.remove("Six"));

        System.out.println(numbersMap);
    }

}
