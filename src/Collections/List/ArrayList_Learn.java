package Collections.List;
import java.util.ArrayList;
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
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        //Get operations
        System.out.println(list.get(3));
        System.out.println(newList.remove(1));
    }

}
