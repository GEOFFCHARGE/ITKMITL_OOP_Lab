public class Account {

    protected double balance;
    protected String name;

    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double a){
        if (a > 0) {
            setBalance(getBalance() + a);
            System.out.println(a + " baht is deposited to " + getName() + ".");
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public void withdraw(double a){
        if (a > 0) {
            if (getBalance() - a > 0) {
                setBalance(getBalance() - a);
                System.out.println(a + " baht is withdrawn from " + getName() + ".");
            } else {
                System.out.println("Not enough money!");
            }
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void showAccount(){
        System.out.println(getName() + " account has " + getBalance() + " baht.");
    }

}
