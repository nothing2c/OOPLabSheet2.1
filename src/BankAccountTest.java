import javax.swing.*;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount[] accounts = new BankAccount[0];
        String input="";

        while(!input.equals("n"))
        {
            input=JOptionPane.showInputDialog("Do you wish to enter a bank account ('Y' / 'N')");
            input=input.toLowerCase();

            if(!input.equals("n"))
            {
                BankAccount account = new BankAccount();

                Person accountHolder = new Person(JOptionPane.showInputDialog("Please enter the name"));
                account.setCustomer(accountHolder);

                account.setBalance(Double.parseDouble(JOptionPane.showInputDialog("Please enter the balance")));

                account.setAccNum(JOptionPane.showInputDialog("Please enter the account number"));

                accounts=BankAccount.expand(accounts);

                BankAccount.add(accounts,account);

                JOptionPane.showMessageDialog(null,BankAccount.arrayToString(accounts));
            }
        }
    }
}
