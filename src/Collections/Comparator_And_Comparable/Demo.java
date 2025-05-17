package Collections.Comparator_And_Comparable;

import Collections.Set.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);

        Collections.sort(numbers);

//        System.out.println(numbers);

        numbers.clear();

        numbers.add(43);
        numbers.add(31);
        numbers.add(72);
        numbers.add(29);

        //To sort the above based on the last digits..

        Comparator<Integer> comparator = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(numbers, comparator);

//        System.out.println(numbers);

        studentsCompare();
    }

    public static void studentsCompare() {

        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if(i.getRollNo() > j.getRollNo()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Navin", 21));
        studentsList.add(new Student("John", 12));
        studentsList.add(new Student("Parul", 18));
        studentsList.add(new Student("Kiran", 20));

        System.out.println(studentsList);

        Collections.sort(studentsList, studentComparator);

        System.out.println(studentsList);

    }
}
