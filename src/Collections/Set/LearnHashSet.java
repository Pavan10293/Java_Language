package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

//        System.out.println(set);

        set.add(54);
        set.add(54);

//        System.out.println(set);

        set.remove(21);
//        System.out.println(set);

//        System.out.println("Contains 100? "+set.contains(100));

//        System.out.println("Is Empty? "+set.isEmpty());

//        System.out.println("Set's Size :- "+set.size());

        set.clear();

//        System.out.println("Is Empty after cleared? "+set.isEmpty());

        studentHashSetlearn();
    }

    public static void studentHashSetlearn() {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Anuj", 2));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));

        Student s1 = new Student("Rohit", 2);
        studentSet.add(s1);

        Student s2 = new Student("Pavan", 2);
        studentSet.add(s2);

        System.out.println(s1.equals(s2));

        System.out.println(studentSet);
    }
}
