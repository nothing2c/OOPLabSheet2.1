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
        setAccNum("0");
        setBalance(0);
        customer = new Person("Unknown");
    }

    public String toString()
    {
        return "Account Number: "+getAccNum()+"\nBalance: €"+String.format("%.2f",getBalance())+"\nAccount Holder: "+customer.getName();
    }

    public void lodgeMoney(double money)
    {
        setBalance(getBalance()+money);
    }

    public void withdrawMoney(double money)
    {
        double temp;

        temp=getBalance()-money;

        if(temp>0)
        {
            setBalance(getBalance()-money);
        }
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

    public static BankAccount[] add(BankAccount[] accountList, BankAccount account)
    {
        BankAccount[] accounts = new BankAccount[accountList.length];
        accounts[accountList.length] = account;

        return accounts;
    }
}
