package Collections.Collections_Class;

import Collections.Set.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(36);
        list.add(42);
        list.add(391);
        list.add(38);
        list.add(4726);

//        System.out.println("Min element :- "+ Collections.min(list));
//        System.out.println("Max element :- "+ Collections.max(list));
//        System.out.println("Frequency :- "+Collections.frequency(list, 37));

        Collections.sort(list);

//        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());

//        System.out.println(list);

        compareStudents();
    }


    public static void compareStudents () {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Anuj", 2));
        students.add(new Student("Ramesh", 4));
        students.add(new Student("Shivam", 3));
        students.add(new Student("Rohit", 1));

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 3);

//        System.out.println(students);
        System.out.println(s1.compareTo(s2));     //Elements of a collection can be sorted in two ways. By implementing Comparable
                                                  // interface and overriding the compareTo() method and then using Collections.sort()

//        Collections.sort(students); //

        Collections.sort(students, new Comparator<Student>() {     //2nd way it to create an object of Comparator interface and
            @Override                                              // and overriding compare method.
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(students);
    }



}
