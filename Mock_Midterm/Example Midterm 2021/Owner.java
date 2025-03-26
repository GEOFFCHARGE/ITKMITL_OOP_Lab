public class Owner {

    protected Animal animal;
    protected final String name;

    public Owner() {
        this.name = "";
        this.animal = null;
    }

    public Owner(Animal animal) {
        this.name = "";
        this.animal = animal;
    }

    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void feedFood(Food f) {
        getAnimal().eat(f);
    }

    public void protectOwnerFrom(Animal a) {
        if (getAnimal() instanceof Dog) {
            ((Dog) getAnimal()).kick(a);
        }
        else {
            ((Pigeous) getAnimal()).wingAttack(a);
        }
    }

    @Override
    public String toString() {
        return "Owner : name = " + getName() + ", Animal : name = " + getAnimal().getName() + ", power = " + getAnimal().getPower() + ", age = " + getAnimal().getAge();
    }

}
