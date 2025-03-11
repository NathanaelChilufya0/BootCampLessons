public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(String accNum, double bal, String name, double interest) {
        super(accNum, bal, name);
        this.interest = interest;
    }
    public double getBalance() {
        return super.getBalance() - 30;
    }
}
;
