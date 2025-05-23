package Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>(); //Elements in Treeset are ordered using their natural ordering.

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
//        set.add(null);

        System.out.println(set);

//        set.add(54);
//        set.add(54);

        System.out.println(set);

//        set.remove(21);
        System.out.println(set);

        System.out.println("Contains 100? "+set.contains(100));

        System.out.println("Is Empty? "+set.isEmpty());

        System.out.println("Set's Size :- "+set.size());

//        set.clear();

        System.out.println("Is Empty after cleared? "+set.isEmpty());

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(32);
        set2.add(2);
        set2.add(54);
        set2.add(21);
        set2.add(65);

        System.out.println("Lower :- "+ set.lower(32)); //Strictly less than 32. So prints 21
        System.out.println("Floor :- "+set.floor(32)); //Less than or equal to 32. So prints 32 itself as it's available in the set.

        System.out.println("Higher :- "+set.higher(32)); //Strictly greater than 32. So prints 54
        System.out.println("Ceiling :- "+set.ceiling(32)); //Greater than or equal to 32. So prints 32 itself as it's available in the set.



        System.out.println(set2);
        System.out.println(set.equals(set2));

    }
}
