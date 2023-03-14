package Interfaces;

public class Interface_Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
//        DeskPhone timsPhone; //This is also perfectly valid.
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(2637272); //We can use the same timsPhone instance as we've created it as ITelephone type. if we create it as DeskPhone type, we cannot use it in this way.
        timsPhone.powerOn();
        timsPhone.callPhone(2637272);
        timsPhone.answer();
    }



}
