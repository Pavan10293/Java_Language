package Nested_Classes;public class Nested_Classes_Main {

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//      Gearbox.Gear second = new Gearbox.Gear(2, 15.4); //Object for the nested class cannot be created in this way without an instance for the Outer class. It should be done like the baove line
//        System.out.println(first.driveSpeed(1000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
    }

}
