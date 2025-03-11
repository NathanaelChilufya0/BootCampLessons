public class Account {
    //these are private but can be altered by the public getters
    private String accountNumber;
    private String name;
    private double balance;
    //the above are class attributes
    //constructor below
    public  Account(String accNum, double bal, String name){
        this.accountNumber = accNum;
        this.balance=bal;
        this.name=name;
    }

    //below are methods
    public double getBalance() {
        return balance;
    }

    public String getName(){
        return this.name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getData(){
        return this.balance + "-" + this.name + "-" + this.accountNumber;//this will allow returning a non string value
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

