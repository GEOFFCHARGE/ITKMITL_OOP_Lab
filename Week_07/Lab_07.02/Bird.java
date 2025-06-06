public abstract class Bird implements Flyable {

    private double height;
    private double weight;
    private double wingSize;

    public Bird() {
        this.height = 0.0;
        this.weight = 0.0;
        this.wingSize = 0.0;
    }

    public Bird(double wingSize, double weight, double height) {
        this.height = height;
        this.weight = weight;
        this.wingSize = wingSize;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getWingSize() {
        return wingSize;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setWingSize(double wingSize) {
        this.wingSize = wingSize;
    }

    public void eat(double food) {
        if (food > 0) {
            setWeight(getWeight() + food);
        }
        else {
            System.out.println("Input cannot be negative number.");
        }
    }

}
