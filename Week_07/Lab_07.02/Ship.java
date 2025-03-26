public class Ship extends Vehicle implements Floatable {
    
    public Ship() {
        this.fuel = 0.0;
    }

    public Ship(double fuel) {
        this.fuel = fuel;
    }

    public void fl0at() {
        if (getFuel() >= 50) {
            setFuel(getFuel() - 50);
            System.out.println("Ship moves");
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }

    public void honk() {
        System.out.println("Shhhhh");
    }

    public void move() {
        fl0at();
    }

    public void move(int distance) {
        for (int i = 0; i < distance; i++) {
            fl0at();
        }
    }

    public void startEngine() {
        if (getFuel() >= 10) {
            setFuel(getFuel() - 10);
            System.out.println("Engine starts");
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }

    public void stopEngine() {
        System.out.println("Engine stops");
    }

}
