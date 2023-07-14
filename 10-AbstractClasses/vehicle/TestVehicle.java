package vehicle;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bus = new Bus();
        Vehicle truck = new Truck();

        car.displayDetails();
        bus.displayDetails();
        truck.displayDetails();
    }
}
