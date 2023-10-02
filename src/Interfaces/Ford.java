package Interfaces;

public class Ford implements Car{

    private int numberOfGears = 5;

    private boolean engineState = false;
    public static void main(String[] args) {
//      Car.numberOfWheels = 6; //Compiler will throw an error as the Interface variables are static and final by default in Java.
        System.out.println(Car.numberOfWheels);
        Ford myFordCar = new Ford();
        System.out.println(myFordCar.getEngineState());
        myFordCar.startEngine();
        System.out.println(myFordCar.getEngineState());
        myFordCar.stopEngine();
        System.out.println(myFordCar.getEngineState());
    }
    @Override
    public void startEngine() {
        if(!this.getEngineState()) {
            System.out.println("Engine turning ON");
            engineState = true;
        } else {
            System.out.println("Engine is already ON!!");
        }
    }

    public boolean getEngineState() {
        return engineState;
    }

    @Override
    public void stopEngine() {
        if(this.getEngineState()) {
            System.out.println("Engine turning OFF");
            engineState = false;
        } else {
            System.out.println("Engine is already OFF!!");
        }
    }


}
