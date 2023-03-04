package Classes;

public class Car {

    private int doors;
    private int wheel;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) { //Validations in the setter methods enforces the concept of encapsulation where code that is creating objects for this class can't create invalid objects
        String validModel = model.toLowerCase();
        if(validModel.equals("carerra") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
