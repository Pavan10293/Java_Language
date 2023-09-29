package Collections.List;

import java.util.Stack;

//LIFO type data structure
public class Stack_Learn {

    public static void main(String[] args) {
        Stack<String> animals = new Stack<String>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println(animals);

        System.out.println(animals.peek());

        System.out.println(animals.pop());

        System.out.println(animals);

        System.out.println(animals.peek());

        System.out.println(animals.size());

        System.out.println(animals.capacity());
    }



}
