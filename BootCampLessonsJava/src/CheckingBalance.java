public class CheckingBalance extends Account {
    private double check;

    public CheckingBalance(String accNum, double bal, String name) {
        super(accNum, bal, name); //use super to use methods in main parent class which in this case Accounts
    }

    public double getBalance() {
        return super.getBalance();
    }
    /*if you want to access attributes in parent class directly, use the protected access modifier while if you dont want the child class to
    * access the parent class attribute directly then use super.<getter> */
}
