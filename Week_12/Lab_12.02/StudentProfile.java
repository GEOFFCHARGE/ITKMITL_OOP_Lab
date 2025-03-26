import java.io.*;

public class StudentProfile implements Serializable {

    private String name;
    private int ID;
    private int money;

    public StudentProfile() {
        this.name = "";
        this.ID = 0;
        this.money = 0;
    }

    public StudentProfile(String name, int ID, int money) {
        this.name = name;
        this.ID = ID;
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getMoney() {
        return money;
    }

}
