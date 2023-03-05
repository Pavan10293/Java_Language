package Inheritance;

public class Animal {

    private int brain;
    private int body;
    private int size;
    private String name;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.name = name;
        this.weight = weight;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal.move() is called. Animal is moving at speed "+speed);
    }


}
