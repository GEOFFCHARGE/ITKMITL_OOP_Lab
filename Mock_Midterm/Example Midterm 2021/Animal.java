public abstract class Animal  {
    
    private int age = 0;
    private String name = "";
    private int power = 0;

    public Animal() {
        this.name = "";
        this.power = 0;
        this.age = 0;
    }

    public Animal(String name, int power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public abstract void eat(Food f);

    public boolean equals(Animal a) {
        return getName().equals(a.getName()) && getAge() == a.getAge();
    }

    @Override
    public String toString() {
        return "Animal : name = " + getName() + ", power = " + getPower() + ", age = " + getAge();
    }

}
