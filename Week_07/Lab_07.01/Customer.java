public class Customer {

    private String firstName;
    private String lastName;
    private CheckingAccount acct;

    public Customer() {
        this.firstName = "";
        this.lastName = "";
        this.acct = null;
    }

    public Customer(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Customer(String firstName, String lastName, CheckingAccount acct) {
        setFirstName(firstName);
        setLastName(lastName);
        setAcct(acct);
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

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }

    public CheckingAccount getAcct() {
        return acct;
    }

    @Override
    public String toString() {
        if (getAcct() == null) {
            return getFirstName() + " " + getLastName() + " doesn’t have account.";
        } else {
            return "The " + getFirstName() + " account has " + acct.getBalance() + " baht and " + acct.getCredit() + " credits.";
        }
    }

    public boolean equals(Customer c) {
        return getFirstName().equals(c.getFirstName()) && getLastName().equals(c.getLastName());
    }

}
