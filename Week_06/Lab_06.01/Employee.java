public class Employee {

    private int energy;
    private String name;
    private Wallet wallet;
    private static String nationality = "Thai";

    public int getEnergy() {
        return energy;
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public static String getNationality() {
        return nationality;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public static void setNationality(String nationality) {
        Employee.nationality = nationality;
    }

    public boolean buyFood(Seller s) {
        Food f = s.sell(this);
        if (f != null) {
            this.eat(f);
            return true;
        } else {
            return false;
        }
    }

    public void eat(Food f) {
        this.energy += getEnergy();
    }

    public boolean equals(Employee e) {
        return this.name.equals(e.getName());
    }

    public boolean equals(String name) {
        return this.name.equals(name);
    }

    @Override
    public String toString() {
        return "My name is " + name + ". \nI have " + energy + " energy left.\nI have a balance of " + wallet.getBalance() + " baht."; 
    }

}
