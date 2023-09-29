package Collections.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Learn {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(4);
        System.out.println(list);

        list.add(1, 50);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        list.addAll(newList);
        System.out.println(newList);
        System.out.println("Is Empty :- "+list.isEmpty());
        System.out.println("List size : "+list.size());

        //Get operations
        System.out.println("Element at 3rd position :- "+list.get(3));
        System.out.println("Remove operation : "+newList.remove(1));
        System.out.println("New list after removing an element :- "+newList);

        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Rakesh");

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);
        numbersList.add(60);
        numbersList.add(70);
        numbersList.add(80);

        System.out.println(numbersList);
//
//        System.out.println("Removing an element at index : "+numbersList.remove(3));
//        System.out.println(numbersList);
//
//        System.out.println("Removing an element at index : "+numbersList.remove(Integer.valueOf(51)));;
//        System.out.println(numbersList);
//
//        numbersList.clear();
//        System.out.println(numbersList);

//            numbersList.set(2, 1000);
//        System.out.println(numbersList);
//
//        System.out.println("Contains element : "+numbersList.contains(70));

        //Iterating through the lists

        for (int i = 0; i< list.size(); i++){
            System.out.println("The element is :- " +numbersList.get(i));
        }

        for (int element : numbersList) {
            System.out.println("For each element is :- "+element);
        }

        Iterator<Integer> iterator = numbersList.iterator();

        while(iterator.hasNext()) {
            System.out.println("Iterator each element : "+iterator.next());
        }
    }

}
