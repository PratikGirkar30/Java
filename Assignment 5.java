interface Vehicle {
    void changeGear(int gear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}
class Bicycle implements Vehicle {
    int gear;
    int speed;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Bicycle gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bicycle speed increased to: " + speed + " km/h");
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Bicycle speed decreased to: " + speed + " km/h");
    }
}
class Bike implements Vehicle {
    int gear;
    int speed;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Bike gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bike speed increased to: " + speed + " km/h");
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Bike speed decreased to: " + speed + " km/h");
    }
}
class Car implements Vehicle {
    int gear;
    int speed;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Car gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car speed increased to: " + speed + " km/h");
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Car speed decreased to: " + speed + " km/h");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        bicycle.changeGear(2);
        bicycle.speedUp(15);
        bicycle.applyBrakes(5);
        System.out.println();
        bike.changeGear(3);
        bike.speedUp(25);
        bike.applyBrakes(10);
        System.out.println();
        car.changeGear(1);
        car.speedUp(50);
        car.applyBrakes(20);
    }
}
