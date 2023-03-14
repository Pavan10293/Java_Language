package Interfaces;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone turned ON.");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("now ringing " + phoneNumber + " ion deskphone.");
        } else {
            System.out.println("phone is switched OFF.");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not ON or wrong number.");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
