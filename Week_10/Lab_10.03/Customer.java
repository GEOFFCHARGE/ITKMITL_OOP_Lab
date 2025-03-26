import java.util.ArrayList;

public class Customer {

    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;
    private int numOfAccount;

    public Customer() {
        this.firstName = "";
        this.lastName = "";
        this.acct = new ArrayList<Account>();
        this.numOfAccount = 0;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new ArrayList<Account>();
        this.numOfAccount = 0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account ac) {
        if (numOfAccount < 5) {
            acct.add(ac);
            numOfAccount++;
        }
    }

    public Account getAccount(int index) {
        return acct.get(index);
    }

    public int getNumOfAccount() {
        return acct.size();
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " has " + getNumOfAccount() + " account.";
    }

    public static void main(String[] args) {

        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        System.out.println(cust);
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }

    }

}
