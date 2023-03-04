package Classes;

public class Main_Classes {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        System.out.println("Model is "+porsche.getModel()); //Will print null because null is the eternal default state for a class. String is also a class.
        porsche.setModel("Carerra");
        System.out.println("Model is "+porsche.getModel());
        porsche.setModel("911");
        System.out.println("Model is "+porsche.getModel());


    }
}
