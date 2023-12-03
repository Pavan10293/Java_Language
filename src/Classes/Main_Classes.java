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

        Account bobsAccount = new Account();
        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
        bobsAccount.setCustomerPhoneNumber("8742919188");
        bobsAccount.withdrawFunds(100.0); //All the initialisations made here can be easily set with the help of constructors to avoid typing this code.

        bobsAccount.depositFunds(51);
        bobsAccount.withdrawFunds(100);

        Account careyAccount =  new Account("56472", 15.00, "Carey", "carey12435@gmail.com", "8173917");

        careyAccount.withdrawFunds(10);

        Account defaultAccount = new Account();
        System.out.println(defaultAccount.getBalance());
        System.out.println(defaultAccount.getCustomerName());

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber());

        Account emptyConstructor = new Account();
        System.out.println("Empty constructor customer name :- "+emptyConstructor.getCustomerName());
    }
}
