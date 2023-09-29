package Collections.Collections_Class;

import java.util.ArrayList;
import java.util.Collections;

public class LearnCollectionsClass {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(36);
        list.add(42);
        list.add(391);
        list.add(38);
        list.add(4726);

        System.out.println("Min element :- "+ Collections.min(list));
        System.out.println("Max element :- "+ Collections.max(list));
        System.out.println("Frequency :- "+Collections.frequency(list, 37));

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }


}
