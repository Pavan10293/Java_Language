package Classes;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public Account() {
        this("23423", 250, "Default Name", "Default Address", "Default number");
        System.out.println("Empty constructor called.");
//        this("23423", 250, "Default Name", "Default Address", "Default number"); //This will throw compile error as this call should be the first line in the overloaded constructor.
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("9999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double fundsToAdd){
        balance = balance + fundsToAdd;
        System.out.println("Current balance after adding funds to the account : "+balance);
    }

    public void withdrawFunds (double amountTOWithdraw) {
        if(balance - amountTOWithdraw < 0) {
            System.out.println("Only "+balance+" available. Withdrawal not possible.");
        } else {
            balance = balance - amountTOWithdraw;
            System.out.println("Current balance after withdrawing funds from the account : " + balance);
        }
    }
}
