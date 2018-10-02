public class BankAccount {
    private String accNum;
    double balance;
    Person customer;

    public BankAccount(String accNum, double balance, Person customer)
    {
        setAccNum(accNum);
        setBalance(balance);
        setCustomer(customer);
    }

    public BankAccount()
    {
        unknown = new Person("Unknown");
        this("0",0, unknown);
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public Person getCustomer() {
        return customer;
    }
}
