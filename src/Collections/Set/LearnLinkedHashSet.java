package Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>(); //Maintains insertion order whereas HashSet doesn't maintain it.

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set);

        set.add(54);
        set.add(54);

        System.out.println(set);

        set.remove(21);
        System.out.println(set);

        System.out.println("Contains 100? "+set.contains(100));

        System.out.println("Is Empty? "+set.isEmpty());

        System.out.println("Set's Size :- "+set.size());

        set.clear();

        System.out.println("Is Empty after cleared? "+set.isEmpty());

    }
}
