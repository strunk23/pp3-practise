package vehicle;

public abstract class Vehicle {
    protected String vehicleType;
    protected int passengerAmount;

    abstract void displayDetails();
}

class Car extends Vehicle {
    public Car() {
        vehicleType = "Car";
        passengerAmount = 5;
    }
    void displayDetails() {
        System.out.println(vehicleType + passengerAmount);
    }

}

class Bus extends Vehicle {
    public Bus() {
        vehicleType = "Bus";
        passengerAmount = 80;
    }
    void displayDetails() {
        System.out.println(vehicleType + passengerAmount);
    }

}

class Truck extends Vehicle {
    public Truck() {
        vehicleType = "Truck";
        passengerAmount = 3;
    }
    void displayDetails() {
        System.out.println(vehicleType + passengerAmount);
    }

}
